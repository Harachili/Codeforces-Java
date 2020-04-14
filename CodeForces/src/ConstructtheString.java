import java.util.Scanner;

public class ConstructtheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            String lettere = "abcdefghijklmnopqrstuvwxyz";
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < b; j++) {
                    sb.append(lettere.charAt(j));
                }
            }
            System.out.println(sb.substring(0, n));

            wh--;
        }
    }
}
