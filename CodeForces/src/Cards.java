import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), countz = 0, counto = 0;
        String s = sc.next();

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'z') countz++;
            if(s.charAt(i) == 'n') counto++;
        }
        while(counto > 0) {
            sb.append("1 ");
            counto--;
        }
        while(countz > 0) {
            sb.append("0 ");
            countz--;
        }
        System.out.print(sb.toString());
    }
}
