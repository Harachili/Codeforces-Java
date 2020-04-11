import java.util.Scanner;

public class EvenSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int res = 0;

        for(int i = 0; i < n; i++) {
            if(Character.getNumericValue(s.charAt(i)) % 2 == 0) {
                res += i + 1;
            }
        }
        System.out.print(res);
    }
}
