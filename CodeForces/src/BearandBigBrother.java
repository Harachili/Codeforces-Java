import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        if(a == b) {
            System.out.print(1);
            return;
        }
        while(a <= b) {
            count++;
            a *= 3;
            b *= 2;
        }
        System.out.print(count);
        return;
    }
}
