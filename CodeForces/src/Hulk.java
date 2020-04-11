import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        StringBuffer sb = new StringBuffer("I hate");

        while(c < n) {
            if(c % 2 == 0) {
                sb.append(" that I hate");
            } else {
                sb.append(" that I love");
            }
            c++;
        }
        sb.append(" it");
        System.out.print(sb);
    }
}
