import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int forza = sc.nextInt(), livelli = sc.nextInt();
        int[] array = new int[livelli];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < livelli; i++) {
            int n = sc.nextInt(), m = sc.nextInt();
            if(!map.containsKey(n)) map.put(n, m);
            else map.put(n, map.get(n) + m);
            array[i] = n;
        }

        Arrays.sort(array);
        int i = 0;
        while(i < livelli && forza > array[i] ) {
            int c = 1;
            for(int l = i + 1; l < livelli; l++) {
                if(array[l] == array[i]) c++;
            }
            forza += map.get(array[i]);
            i += c;
        }

        if(i >= livelli) System.out.print("YES");
        else System.out.print("NO");
    }
}

        /*
2 2
1 99
100 0
yes.
         */