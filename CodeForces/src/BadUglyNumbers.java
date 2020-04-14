import java.util.Scanner;

public class BadUglyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            StringBuffer sb = new StringBuffer("2");
            int num = sc.nextInt();
            if(num == 1) {
                System.out.println(-1);
                wh--;
                continue;
            }
            for(int i = 1; i < num; i++) sb.append("3");
            System.out.println(sb);
            wh--;
        }

    }
}
