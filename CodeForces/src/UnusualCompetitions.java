import java.util.Scanner;

public class UnusualCompetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0, contApCh = 0;
        String s = sc.next();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                ++contApCh;
            else {
                if(--contApCh < 0) res += 2;
            }
        }
        System.out.print((contApCh == 0) ? res : -1);
    }
}
