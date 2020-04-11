import java.util.Scanner;

public class DeadPixel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while (wh > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            System.out.println(Math.max(Math.max(x, a - x - 1) * b, a * Math.max(y, b - y - 1)) );
            wh--;
        }
    }
}
