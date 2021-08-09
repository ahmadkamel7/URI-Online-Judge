import java.util.Scanner;

class Problema1045 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        if (A>=B && A>=C) {
            if (A >= B+C) { System.out.println("NAO FORMA TRIANGULO"); }
            else {
                if (A*A == B*B+C*C) { System.out.println("TRIANGULO RETANGULO"); }
                if (A*A > B*B+C*C) { System.out.println("TRIANGULO OBTUSANGULO"); }
                if (A*A < B*B+C*C) { System.out.println("TRIANGULO ACUTANGULO"); }
            }
        }

        else if (B>=A && B>=C) {
            if (B >= A+C) { System.out.println("NAO FORMA TRIANGULO"); }
            else {
                if (B*B == A*A+C*C) { System.out.println("TRIANGULO RETANGULO"); }
                if (B*B > A*A+C*C) { System.out.println("TRIANGULO OBTUSANGULO"); }
                if (B*B < A*A+C*C) { System.out.println("TRIANGULO ACUTANGULO"); }
            }
        }

        else if (C>=A && C>=B) {
            if (C >= A+B) { System.out.println("NAO FORMA TRIANGULO"); }
            else {
                if (C*C == B*B+A*A) { System.out.println("TRIANGULO RETANGULO"); }
                if (C*C > B*B+A*A) { System.out.println("TRIANGULO OBTUSANGULO"); }
                if (C*C < B*B+A*A) { System.out.println("TRIANGULO ACUTANGULO"); }
            }
        }

        if (A == B && A == C) {System.out.println("TRIANGULO EQUILATERO");}
        if ( (A == B && A != C) || (A == C && A != B) || (B == C && B != C)  ) {System.out.println("TRIANGULO ISOSCELES");}

        s.close();
    }
}