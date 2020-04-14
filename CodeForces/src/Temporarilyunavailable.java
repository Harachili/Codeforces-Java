import java.util.Scanner;

public class Temporarilyunavailable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), r = sc.nextInt();

            int L = Math.max(Math.min(a, b), c - r);
            int R = Math.min(Math.max(a, b), c + r);

            System.out.println(Math.max(a, b) - Math.min(a, b) - Math.max(0, R - L));
            wh--;
        }
    }
}
