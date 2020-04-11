import java.util.Scanner;

public class EhAbAnDgCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 0) {
            System.out.println(1 + " " + (sc.nextInt() - 1));
            n--;
        }
    }
}
