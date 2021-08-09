import java.util.Scanner;

class Problema1010 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int codigo1 = s.nextInt();
        int quantidade1 = s.nextInt();
        double valor1 = s.nextDouble();

        int codigo2 = s.nextInt();
        int quantidade2 = s.nextInt();
        double valor2 = s.nextDouble();

        double total = (quantidade1*valor1) + (quantidade2*valor2);

        System.out.format("VALOR A PAGAR: R$ %.2f", total);
        System.out.println();

        s.close();
    }
}