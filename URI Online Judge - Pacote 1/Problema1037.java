import java.util.Scanner;

class Problema1037 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double numero = s.nextDouble();

        if (numero < 0 || numero > 100) {
            System.out.println("Fora de intervalo");
        }

        else {
            if(numero <= 25) { System.out.println("Intervalo [0,25]"); }
            if(numero <= 50 && numero>25) { System.out.println("Intervalo (25,50]"); }
            if(numero <= 75 && numero>50) { System.out.println("Intervalo (50,75]"); }
            if(numero > 75) { System.out.println("Intervalo (75,100]"); }
        }

        s.close();
    }
}