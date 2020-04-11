import java.util.Scanner;

public class DefiniteGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n == 2 ? 2 : 1);
    }
}
