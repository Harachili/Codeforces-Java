import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        /*
5 7
+ 5
- 10
- 20
+ 40
- 20
         */
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(), x = sc.nextInt(), out2 = 0;

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            double m = sc.nextInt();
            if(s.charAt(0) == '+') {
                x = x + m;
            } else {
                if(x >= m) {
                    x = x - m;
                } else {
                    out2++;
                }
            }
        }
        System.out.print(Math.round(x) + " " + Math.round(out2));
    }
}
