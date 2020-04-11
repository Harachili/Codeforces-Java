import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.charAt(1) == '+')  res++;
            else res--;
        }
        System.out.print(res);
    }
}
