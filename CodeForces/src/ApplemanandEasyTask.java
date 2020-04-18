import java.util.Scanner;

public class ApplemanandEasyTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Character[][] arr = new Character[105][105];

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < n; j++) {
                arr[i + 1][j + 1] = s.charAt(j);
            }
        }
        boolean b = true;

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt=0;
                if(j > 1 && arr[i][j-1]=='o')
                    cnt++;

                if(j < n && arr[i][j+1]=='o')
                    cnt++;

                if(i > 1 && arr[i-1][j]=='o')
                    cnt++;

                if(i < n && arr[i + 1][j] == 'o')
                    cnt++;

                if(cnt==1||cnt==3)
                {
                    b = false;
                    break;
                }
            }
        }
        System.out.print((b) ? "YES" : "NO");


    }
}
