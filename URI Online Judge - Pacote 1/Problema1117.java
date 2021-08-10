import java.util.Scanner;

class Problema1117 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numerosValidos = 0;
        double soma = 0;

        while (numerosValidos < 2) {
            double num = s.nextDouble();

            if (num >= 0 && num <= 10) {
                soma+=num;
                numerosValidos++;
            }
            else {
                System.out.println("nota invalida");
            }

            if(numerosValidos == 2) {
                double media = soma/2;
                System.out.format("media = %.2f", media);
                System.out.println();
            }
        }
        s.close();
    }
}