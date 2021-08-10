import java.util.Scanner;

class Problema1118 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numerosValidos = 0;
        double soma = 0;

        while (s.hasNextDouble()) {
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
                numerosValidos = 0;
                soma= 0;

                double codigo = 0;
                while (codigo != 1 && codigo != 2) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    codigo = s.nextInt();
                }
                if (codigo == 2) { break; }
            }
        }
        s.close();
    }
}