import java.util.Scanner;

public class ArraywithOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while (wh-- > 0) {
            int sum = 0, n = sc.nextInt();
            boolean dispari = false, pari = false;

            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;
                pari = pari | (x % 2 == 0);
                dispari = dispari | (x % 2 != 0);
            }
            if(sum % 2 == 1 || (dispari && pari)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}