import java.util.ArrayList;
import java.util.Scanner;

public class FrogJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            String s = sc.next();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'R') {
                    list.add(i + 1);
                }
            }
            list.add(s.length() + 1);

            int res = 0;
            for(int i = 0; i < list.size() - 1; i++) {
                res = Math.max(res, list.get(i + 1) - list.get(i));
            }
            System.out.println(res);
            wh--;
        }
    }
}
