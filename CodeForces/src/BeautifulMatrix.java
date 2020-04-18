import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(sc.nextInt() == 1) {
                    System.out.print(Math.abs(i - 2) + Math.abs(j - 2));
                    return;
                }
            }
        }
     }
}
