import java.util.Scanner;

class Problema1933 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        if (A==B || A>B) { System.out.println(A); }
        else { System.out.println(B); }

        s.close();
    }
}