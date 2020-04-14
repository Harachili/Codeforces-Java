import java.util.Scanner;

public class CandiesandTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int n = sc.nextInt();
            if(n < 3) {
                System.out.println(0);
                wh--;
                continue;
            }

            if(n % 2 == 0) {
                System.out.println(n / 2 - 1);
                wh--;
            } else {
                System.out.println(n / 2);
                wh--;
            }
        }
    }
}
