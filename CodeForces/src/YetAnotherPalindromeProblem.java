import java.util.Scanner;

public class YetAnotherPalindromeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            boolean paolo = false;
            int n = sc.nextInt();
            int[] arr = new int[n];
            if(n < 3) {
                System.out.println("YES");
                continue;
            }
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n - 2; i++) {
                for(int j = i + 2; j < n; j++) { //Ma vaffancul
                    if(arr[i] == arr[j]) {
                    paolo = true;
                    break;
                    }
                }
            }
            if(arr[n - 3] == arr[n - 1]) paolo = true;
            if(paolo) System.out.println("YES");
            else System.out.println("NO");
            wh--;
        }
    }
}
