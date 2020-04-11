import java.util.Scanner;

public class LoveA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countA = 0, countelse = 0, lung = s.length();

        for(int i = 0; i < lung; i++) {
            if(s.charAt(i) == 'a') countA++;
            else countelse++;
        }
        if(countA > lung/2) System.out.print(lung);
        else System.out.print(countA * 2 - 1);
    }
}
