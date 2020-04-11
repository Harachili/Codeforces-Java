import java.util.Scanner;

public class HittheLottery {
    public static void main(String[] args) {
        //1 , 5, 10, 20, 100
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        while(n > 0) {
            if(n / 100 >= 1) {
                res += n / 100;
                n = n % 100;
            } else if(n / 20 >= 1) {
                res += n / 20;
                n = n % 20;
            } else if(n / 10 >= 1) {
                res += n / 10;
                n = n % 10;
            } else if(n / 5 >= 1) {
                res += n / 5;
                n = n % 5;
            } else {
                res += n;
                break;
            }
        }
        System.out.print(res);
    }
}
