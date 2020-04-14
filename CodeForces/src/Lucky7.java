import java.util.Scanner;

public class Lucky7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(Integer.toString(n).contains("7")) {
            System.out.print("Yes");
            return;
        }
        System.out.print("No");
    }
}
