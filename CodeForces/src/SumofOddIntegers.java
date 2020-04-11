import java.util.Scanner;

public class SumofOddIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            double n = sc.nextInt(), k = sc.nextInt();
            if((n >= k * k) && (n % 2) == (k % 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            wh--;
        }
    }
}
