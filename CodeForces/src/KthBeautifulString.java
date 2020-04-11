import java.util.Scanner;

public class KthBeautifulString {
    public static void main(String[] args) {
/*
7
5 1
5 2
5 8
5 10
3 1
3 2
20 100
 */
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int lung = sc.nextInt(), numSeq = sc.nextInt(), bsx = 0, bdx = 0;//n, k
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < lung; i++) sb.append('a');

            for(int i = lung - 2; i >= 0; i--) {
                int numsBsinRow = lung - i - 1;

                if(numsBsinRow >= numSeq) {
                    sb.setCharAt(i, 'b');
                    sb.setCharAt(lung - numSeq, 'b');
                    System.out.println(sb);
                    break;
                } else {
                    numSeq -= numsBsinRow;
                }
            }


            wh--;
        }
    }
}
