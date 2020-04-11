import java.util.Scanner;
/*
5
1 1 1 0 0
0 1 1 1 1
 */
public class ContestforRobots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prob = sc.nextInt(), countW = 0, countL = 0;
        int[] arrW = new int[prob];
        int[] arrL = new int[prob];

        for(int i = 0; i < prob; i++) {
            arrW[i] = sc.nextInt();
        }

        for(int i = 0; i < prob; i++) {
            arrL[i] = sc.nextInt();
        }

        for(int i = 0; i < prob; i++) {
            if(arrW[i] == 0 && arrL[i] == 1) countL++;
            else if(arrW[i] == 1 && arrL[i] == 0) countW++;
        }

        if(countW == 0) System.out.print(-1);
        else if(countL >= countW) System.out.print((countL/ countW) + 1);
        else System.out.print(1);
    }
}
