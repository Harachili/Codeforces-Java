import java.util.Scanner;

public class LittleArtem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int rows = sc.nextInt(), cols = sc.nextInt();
            int cB = 0, cW = 0; //conto bianchi, neri
            char[][] matrice = new char[rows][cols];

            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    if(i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                        matrice[i][j] = 'B';
                        cB++;
                    }
                    else {
                        matrice[i][j] = 'W';
                        cW++;
                    }
                }
            }
            if(cB == cW) {
                matrice[rows - 1][cols - 1] = 'B';
                matrice[rows - 2][cols - 1] = 'B';
            }

            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrice[i][j]);
                }
                System.out.println();
            }
            wh--;
        }
    }
}
