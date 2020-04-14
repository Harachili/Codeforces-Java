import java.util.Scanner;

public class FizzBuzz2 {//Risolto in =(1)
    public static long sum(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long res = sum(n) - sum(n/3) * 3 - sum(n / 5) * 5 + sum(n / 15) * 15;

        System.out.print(res);
    }
}
