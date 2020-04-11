import java.util.Scanner;

public class BuyaShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 10 == 0) {
            System.out.print(1);
            return;
        }

        int w = sc.nextInt();
        if((n - w) % 10 == 0) {
            System.out.print(1);
            return;
        }

        for(int i = 2; i < 10; i++) {
            if((n * i) % 10 == 0 || (n * i) % 10 == w) {
                System.out.print(i);
                break;
            }
        }
    }
}
