import java.util.Scanner;

public class EvenSubsetSumProblem {
    public static void main(String[] args) {
        /*
input
3
3
1 4 3
1
15
2
3 5
         */
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();

        while(rep > 0) {
            int temp = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                int next = arr[i];
                if(next % 2 == 0) {
                    System.out.println(1);
                    System.out.println(i + 1);
                    break;
                } else if(next % 2 == 1 && temp == 0) {
                    temp = i + 1;
                }
                else if(next % 2 == 1 && temp != 0) {
                    System.out.println(2);
                    System.out.println(temp + " " + (i + 1));
                    break;
                }
                if(i == n - 1) System.out.println(-1);
            } rep--;

        }
    }
}
