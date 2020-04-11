import java.util.Scanner;
/*
4
5
22222
5
21211
1
2
9
220222021

 */

public class TernaryXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while (wh > 0) {
            int lung = sc.nextInt();
            String s = sc.next();
            StringBuffer sb1 = new StringBuffer("1");
            StringBuffer sb2 = new StringBuffer("1");

            int i = 1;
            while(i < lung) {
                if(s.charAt(i) == '0') {
                    sb1.append('0');
                    sb2.append('0');
                    i++;
                } else if(s.charAt(i) == '2') {
                    sb1.append('1');
                    sb2.append('1');
                    i++;
                } else {
                    break;
                }
            }
            if(i == lung) {
                System.out.println(sb1);
                System.out.println(sb2);
                wh--; continue;
            }
            sb1.append('1');
            sb2.append('0');
            i++;
            while(i < lung) {
                sb2.append(s.charAt(i));
                sb1.append('0');
                i++;
            }
            System.out.println(sb1);
            System.out.println(sb2);
            wh--;
        }
    }
}
