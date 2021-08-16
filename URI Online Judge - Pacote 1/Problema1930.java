import java.util.Scanner;

class Problema1930 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();

        System.out.println(A+B+C+D-3);

        s.close();
    }
}