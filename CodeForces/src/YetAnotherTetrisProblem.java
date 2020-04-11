import java.util.Scanner;

public class YetAnotherTetrisProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int sum = 0, n = sc.nextInt();

            for(int _ = 0; _ < n; _++) {
                sum += sc.nextInt() % 2;
            }

            if(sum == 0 || sum == n)System.out.println("YES");
            else System.out.println("NO");
            wh--;
        }
    }
}
