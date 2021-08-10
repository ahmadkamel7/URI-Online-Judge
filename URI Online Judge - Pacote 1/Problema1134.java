import java.util.Scanner;

class Problema1134 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (num != 4) {
            if (num == 1) { alcool++; }
            if (num == 2) { gasolina++; }
            if (num == 3) { diesel++; }

            num = s.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        s.close();
    }
}