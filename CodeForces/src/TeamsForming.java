import java.util.Arrays;
import java.util.Scanner;

public class TeamsForming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 1; i < n; i = i + 2) {
            res += (arr[i] - arr[i - 1]);
        }
        System.out.print(res);
    }
}
