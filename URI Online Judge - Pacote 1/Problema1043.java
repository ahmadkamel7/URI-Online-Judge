import java.util.Scanner;

class Problema1043 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        if ( (Math.abs(B-C) < A) && (A < B+C) ) {
            if ( (Math.abs(A-C) < B) && (B < A+C) ) {
                if ( (Math.abs(A-B) < C) && (C < A+B) ) {
                    System.out.println("Perimetro = "+ (A+B+C) );
                }
            }
        }

        else {
            double areaTrapezio = ((A+B)/2)*C;
            System.out.println("Area = "+ areaTrapezio );
        }

        s.close();
    }
}