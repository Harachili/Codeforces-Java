import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(sc.nextInt() == 1) {
                System.out.print("HARD");
                return;
            }
        }
        System.out.print("EASY");
        return;
    }
}
