import java.util.Scanner;

class Problema1005 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();

        double nota1 = A * 3.5;
        double nota2 = B * 7.5;
        double media = (nota1+nota2) / 11;

        System.out.format("MEDIA = %.5f", media);
        System.out.println();

        s.close();
    }

}