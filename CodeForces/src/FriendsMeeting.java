import java.util.Scanner;

public class FriendsMeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int diff = Math.abs(a - b);
        int nMezzi = diff / 2;

        if(diff % 2 == 1) {
            System.out.print((nMezzi * (nMezzi + 1) / 2) + (((nMezzi + 1) * (nMezzi + 2))/ 2));
            return;
        }
        System.out.print(2 * (nMezzi * (nMezzi + 1) / 2));
    }
}
