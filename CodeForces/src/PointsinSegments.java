import java.util.Scanner;

public class PointsinSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nLinee = sc.nextInt(), max = sc.nextInt(), cnt = 0;
        boolean[] arr = new boolean[max + 1];

        while(nLinee-- > 0) {
            int inizio = sc.nextInt(), fine = sc.nextInt();
            for(int i = inizio; i <= fine; i++) {
                arr[i] = true;
            }
        }

        for(int i = 1; i <= max; i++) {
            if(!arr[i]) cnt++;
        }
        System.out.println(cnt);

        for(int i = 1; i <= max; i++) {
            if(!arr[i]) System.out.print(i + " ");
        }
    }
}
