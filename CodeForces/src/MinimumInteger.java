import java.util.Scanner;

public class MinimumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int li = sc.nextInt(), ri = sc.nextInt(), div = sc.nextInt();
            if(li > div || ri < div) {
                System.out.println(div);
                wh--;
                continue;
            }

            System.out.println(div * (ri/div + 1));
            wh--;
        }
    }
}
