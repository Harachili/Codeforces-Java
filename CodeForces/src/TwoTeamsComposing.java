import java.util.*;

public class TwoTeamsComposing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int wh = sc.nextInt();

        while(wh-- > 0) {
            int n = sc.nextInt(), rep = 0;
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
                rep = Math.max(rep, map.get(x));
            }

            System.out.println(Math.max(Math.min(rep,map.size()-1), Math.min(rep-1, map.size())));

        }
    }
}
