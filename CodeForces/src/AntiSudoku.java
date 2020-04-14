import java.util.Scanner;

public class AntiSudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            StringBuffer sb = new StringBuffer();

            for(int i = 0; i < 9; i++) {
                sb.append(sc.next());
            }

            for(int i = 0; i < sb.length(); i++) {
                if(sb.charAt(i) == '1') sb.replace(i, i + 1, "2");
            }

            for(int i = 0; i < sb.length(); i+=9) {
                System.out.println(sb.substring(i, i + 9));
            }
            wh--;
        }
    }
}
