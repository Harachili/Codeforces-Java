import java.util.Scanner;

public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        Character first = next.charAt(0), second = next.charAt(1);

        for(int i = 0; i < 5; i++) {
            String temp = sc.next();
            if(temp.charAt(1) == second || temp.charAt(0) == first) {
                System.out.print("YES");
                break;
            }
            if(i == 4) System.out.print("NO");
        }
    }
}
