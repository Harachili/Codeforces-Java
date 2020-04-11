import java.util.HashSet;
import java.util.Scanner;

public class Carousel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while (wh > 0) {
            int lung = sc.nextInt(), count = 0;
            StringBuffer sb = new StringBuffer();
            int[] arr = new int[lung];
            HashSet set = new HashSet();

            for(int i = 0; i < lung; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }
            if(set.size() == 1) {
                for(int i = 0; i < lung; i++) {
                    sb.append("1 ");
                }
                System.out.println('1');
                System.out.println(sb);

                wh--; continue;
            }

            if(lung % 2 == 0) {
                for(int i = 0; i < lung/2; i++) {
                    sb.append("1 ");
                    sb.append("2 ");
                }
                System.out.println('2');
                System.out.println(sb);
                wh--; continue;
            }

            for(int i = 0; i < lung - 1; i++) {
                if(arr[i] == arr[i + 1]) {
                    count++; break;
                }
            }
            for(int i = 0; i < lung/2; i++) {
                sb.append("1 ");
                sb.append("2 ");
            }
            if(count > 0) {
                sb.append('2');
                System.out.println('2');
            } else {
                sb.append('3');
                System.out.println('3');
            }
            System.out.println(sb);
            wh--;
        }
    }
}
