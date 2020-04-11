import java.util.Scanner;

public class GoodolNumbersColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(a == 1 || b == 1) {
                System.out.println("finite");
                wh--;
                continue;
            }

            while(b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            if(a == 1) {
                System.out.println("finite");
            } else {
                System.out.println("infinite");
            }
            wh--;
        }
    }
}
