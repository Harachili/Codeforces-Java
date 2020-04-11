import java.util.Scanner;

public class MinimumBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int len = sc.nextInt(), countones = 0, countzeros = 0;
        String s = sc.next();
        if(s.length() == 1) {
            System.out.print(s);
            return;
        }
        StringBuffer sb = new StringBuffer("1");

        for(int i = 0; i < len; i++) {
            if (s.charAt(i) == '0') sb.append('0');
        }
        System.out.print(sb);
    }
}
