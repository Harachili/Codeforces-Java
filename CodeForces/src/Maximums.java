import java.util.Scanner;

public class Maximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num + 1];
        int x = 0;

        for(int i = 1; i <= num; i++) {
            int ax = sc.nextInt() + x;
            System.out.print(ax + " ");
            x = Math.max(x, ax);
        }
    }
}
