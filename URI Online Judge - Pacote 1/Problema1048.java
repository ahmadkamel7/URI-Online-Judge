import java.util.Scanner;

class Problema1048 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioInicial = s.nextDouble();

        double salarioFinal = 0;
        int aumento = 0;

        if (salarioInicial <= 400) {
            salarioFinal = 1.15*salarioInicial;
            aumento = 15;
        }

        if (salarioInicial > 400 && salarioInicial <= 800) {
            salarioFinal = 1.12*salarioInicial;
            aumento = 12;
        }

        if (salarioInicial > 800 && salarioInicial <= 1200) {
            salarioFinal = 1.1*salarioInicial;
            aumento = 10;
        }

        if (salarioInicial > 1200 && salarioInicial <= 2000) {
            salarioFinal = 1.07*salarioInicial;
            aumento = 7;
        }

        if (salarioInicial > 2000) {
            salarioFinal = 1.04*salarioInicial;
            aumento = 4;
        }

        System.out.format("Novo salario: %.2f", salarioFinal);
        System.out.println();
        System.out.format("Reajuste ganho: %.2f", (salarioFinal - salarioInicial) );
        System.out.println();
        System.out.println("Em percentual: "+aumento+" %");

        s.close();
    }
}