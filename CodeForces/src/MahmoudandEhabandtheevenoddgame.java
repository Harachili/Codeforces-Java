import java.util.Scanner;

public class MahmoudandEhabandtheevenoddgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0) System.out.print("Mahmoud");
        else System.out.print("Ehab");
    }
}
