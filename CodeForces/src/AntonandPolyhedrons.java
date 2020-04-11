import java.util.Scanner;

public class AntonandPolyhedrons {
    /*Tetrahedron. Tetrahedron has 4 triangular faces.
    Cube. Cube has 6 square faces.
    Octahedron. Octahedron has 8 triangular faces.
    Dodecahedron. Dodecahedron has 12 pentagonal faces.
    Icosahedron. Icosahedron has 20 triangular faces*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.charAt(0) == 'T') res += 4;
            if(s.charAt(0) == 'C') res += 6;
            if(s.charAt(0) == 'O') res += 8;
            if(s.charAt(0) == 'D') res += 12;
            if(s.charAt(0) == 'I') res += 20;
        }
        System.out.print(res);
    }
}
