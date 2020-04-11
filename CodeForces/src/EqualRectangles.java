import java.util.*;


public class EqualRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int[] arr = new int[sc.nextInt() * 4];
            int lung = arr.length;
            for(int i = 0; i < lung; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            /*
            if(arr[0] <= 0) {
                System.out.println("NO");
                wh--;
                continue;
            }
             */
            int area = 0;
            if(arr[0] == arr[1] && arr[lung - 1] == arr[lung - 2]) {
                area = arr[0] * arr[lung - 1];
            }

            boolean check = true;
            for(int i = 0; i < lung / 2; i = i + 2) {
                if(arr[i] != arr[i + 1] || arr[lung - i - 1] != arr[lung - i - 2] || arr[i] * arr[lung - i - 1] != area) {
                    check = false;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
            wh--;
        }
    }
}
