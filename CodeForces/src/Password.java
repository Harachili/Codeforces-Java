/*
import java.util.HashSet;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> s2 = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            s2.add(s.charAt(i));
        } if(s2.size() == 1) {
            for(int i = 0; i < s.length() - 2; i++) {
                System.out.print(s.charAt(0));
            }
            return;
        }

        int i = s.length()/2 + 1;

        while(!s.endsWith(s.substring(0, i))) {
            i--;
        }

        if(i == 0 || s.length() < 3) {
            System.out.print("Just a legend");
            return;
        }

        String t = s.substring(0, i);
        int lung = s.length(), lung2 = t.length(), diff = lung - lung2;

        for(int j = 1; j < diff; j++) {
            if(s.substring(j, j + lung2).equals(t)) {
                System.out.print(t);
                return;
            }
        }
        System.out.print("Just a legend");
    }
}
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Password {
    static ArrayList<Integer> longestPrefix;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        longestPrefix = new ArrayList();
        computePrefix(s);

        boolean found = false;
        int len;

        len = longestPrefix.get(s.length() - 1);

        if(len!=0){
            for(int j=0;j<2;j++) {
                for (int i = 1; i < s.length() - 1; i++) {
                    if (len == longestPrefix.get(i)) {
                        found = true;
                        break;
                    }

                }
                if(!found){
                    len=longestPrefix.get(len-1);
                    if(len==0)
                        break;
                }
                else
                    break;
            }

        }
        if (!found) {
            System.out.println("Just a legend");
        } else {
            System.out.println(s.substring(0, len));
        }

    }

    public static void computePrefix(String str) {
        longestPrefix.add(0);
        int m = str.length();
        for (int i = 1, k = 0; i < m; i++) {
            while (k > 0 && str.charAt(k) != str.charAt(i)) {
                k = longestPrefix.get(k - 1);
            }

            if (str.charAt(k) == str.charAt(i)) {
                longestPrefix.add(i, ++k);
            } else {
                longestPrefix.add(i, k);
            }
        }
    }

}
