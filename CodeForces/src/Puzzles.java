import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        /*
4 6
10 12 10 7 5 22
         */
        Scanner sc = new Scanner(System.in);
        int numstud = sc.nextInt(), numpuzzles = sc.nextInt();
        int[] arr = new int[numpuzzles];

        for(int i = 0; i < numpuzzles; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int min = arr[numpuzzles - 1];

        for(int i = numpuzzles - 1; i >= numstud - 1; i--) {
            int g = arr[i] - arr[i - numstud + 1];
            if(g < min) {
                min = g;
            }
        }
        System.out.print(min);
    }
}
