import java.util.Scanner;

public class KindAnton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wh = sc.nextInt();

        while(wh > 0) {
            int lenArray = sc.nextInt();
            boolean pos = false, neg = false;
            int[] a = new int[lenArray];//array a
            int[] b = new int[lenArray];//array b
            for(int i = 0; i < lenArray; i++) {
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < lenArray; i++) {
                b[i] = sc.nextInt();
            }

            if(a[0] != b[0]) {
                System.out.println("NO");
                wh--;
                continue;
            }
            if(a[0] == 1) pos = true;
            if(a[0] == -1) neg = true;

            for(int i = 1; i < lenArray; i++) {

                if(pos && neg) {
                    System.out.println("YES");
                    break;
                }

                if(a[i] < b[i] && !pos) {
                    System.out.println("NO");
                    break;
                } else if(a[i] > b[i] && !neg){
                    System.out.println("NO");
                    break;
                }

                if(a[i] ==  1) {
                    pos = true;
                }

                if(a[i] == -1) {
                    neg = true;
                }

                if(i == lenArray - 1) {
                    System.out.println("YES");
                }
            }
            wh--;
        }
    }
}
