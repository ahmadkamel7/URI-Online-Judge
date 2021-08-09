import java.util.Scanner;

class Problema1006 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        double nota1 = A * 2;
        double nota2 = B * 3;
        double nota3 = C * 5;
        double media = (nota1+nota2+nota3) / 10;

        System.out.format("MEDIA = %.1f", media);
        System.out.println();

        s.close();
    }

}