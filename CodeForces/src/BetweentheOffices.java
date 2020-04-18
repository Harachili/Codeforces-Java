import java.util.Scanner;

public class BetweentheOffices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), countSF = 0;
        String s = sc.next();

        for(int i = 0; i < n - 1; i++) {
            if(s.charAt(i) == 'S' && s.charAt(i + 1) == 'F') countSF++;
            else if(s.charAt(i) == 'F' && s.charAt(i + 1) == 'S') countSF--;
        }
        System.out.print((countSF > 0) ? "YES" : "NO");
    }
}
