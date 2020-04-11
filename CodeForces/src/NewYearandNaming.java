import java.util.HashMap;
import java.util.Scanner;

public class NewYearandNaming {
    public static void main(String[] args) {
        HashMap<Integer, String> maps = new HashMap<>();
        HashMap<Integer, String> mapt = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            maps.put(i, sc.next());
        }
        for(int i = 1; i <= m; i++) {
            mapt.put(i, sc.next());
        }

        int esci = sc.nextInt();

        while(esci > 0) {
            int w = sc.nextInt();

            int val1 = w % n;
            if(val1 == 0)
                val1 = n;

            int val2 = w % m;
            if(val2 == 0)
                val2 = m;
            sb.append(maps.get(val1));
            sb.append(mapt.get(val2));
            System.out.println(sb);
            sb.delete(0, sb.length());
            esci--;
        }
        return;
    }
}
/*
10 12
sin im gye gap eul byeong jeong mu gi gyeong
yu sul hae ja chuk in myo jin sa o mi sin
14
1
2
3
4
10
11
12
13
73
2016
2017
2018
2019
2020

sinyu
imsul
gyehae
gapja
gyeongo
sinmi
imsin
gyeyu
gyeyu
byeongsin
jeongyu
musul
gihae
gyeongja
 */