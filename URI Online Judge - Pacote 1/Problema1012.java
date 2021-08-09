import java.util.Scanner;

class Problema1012 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        double areaTriangulo = (A*C) / 2.0;
        System.out.format("TRIANGULO: %.3f", areaTriangulo);
        System.out.println();

        double areaCirculo = 3.14159 * C * C;
        System.out.format("CIRCULO: %.3f", areaCirculo);
        System.out.println();

        double areaTrapezio = ((A+B)/2) * C;
        System.out.format("TRAPEZIO: %.3f", areaTrapezio);
        System.out.println();

        double areaQuadrado = B*B;
        System.out.format("QUADRADO: %.3f", areaQuadrado);
        System.out.println();

        double areaRetangulo = A*B;
        System.out.format("RETANGULO: %.3f", areaRetangulo);
        System.out.println();

        s.close();
    }
}