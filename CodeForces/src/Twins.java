import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCoins = sc.nextInt(), sum = 0, cnt = 0, cnt2 = 0;
        int[] arr = new int[nCoins];

        for(int i = 0; i < nCoins; i++) {
            int val = sc.nextInt();
            arr[i] = val;
            sum += val;
        }

        Arrays.sort(arr);

        for(int i = nCoins - 1; i >= 0; i--) {
            cnt += arr[i];
            cnt2++;
            if(cnt > sum / 2) break;
        }
        System.out.print(cnt2);
    }
}
