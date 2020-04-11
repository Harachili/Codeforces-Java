import java.util.HashMap;
import java.util.Scanner;
//"Danil", "Olya", "Slava", "Ann" and "Nikita"
public class Alexandbrokencontest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0, l = s.length() - 6;
        if(s.length() <= 3 && !s.equals("Ann")) {
            System.out.print("NO");
            return;
        }

        for(int i = 0; i < l + 1; i++) {
            if(c > 1) break;
            if(s.substring(i, i + 5).equals("Danil")) {
                c++;
            } else if(s.substring(i, i + 5).equals("Slava")) {
                c++;
            } else if(s.substring(i, i + 4).equals("Olya")) {
                c++;
            } else if(s.substring(i, i + 3).equals("Ann")) {
                c++;
            } else if(s.substring(i, i + 6).equals("Nikita")) {
                c++;
            }
        }
        if(s.lastIndexOf("Ann") > l || s.lastIndexOf("Olya") > l || s.lastIndexOf("Slava") > l || s.lastIndexOf("Danil") > l) c++;
        if(c == 1) System.out.print("YES");
        else System.out.print("NO");
    }
}
