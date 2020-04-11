import java.util.Scanner;

public class TelephoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if(n < 11){
                System.out.println("NO");
            } else if(n == 11 && s.charAt(0) == '8') {
                System.out.println("YES");
            } else {
                for (int i = 0; i < n - 10; i++) { // con n - 11 perdevo l'ultimo valore pd
                    if (s.charAt(i) == '8') {
                        System.out.println("YES");
                        break;
                    }
                    if(i == n - 11) System.out.println("NO");
                }
            }
            num--;
        }
    }
}
