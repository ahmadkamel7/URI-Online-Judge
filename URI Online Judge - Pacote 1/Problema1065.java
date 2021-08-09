import java.util.Scanner;

class Problema1065 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;
        
        while (i<5) {
            double num = s.nextDouble();
            if (num % 2 == 0) { contadorPar++; }
            if (num % 2 == 1) { contadorImpar++; }
            if (num > 0) { contadorPositivo++; }
            if (num < 0) { contadorNegativo++; }
            i++;
        }

        System.out.println(contadorPar+" valor(es) par(es)");
        System.out.println(contadorImpar+" valor(es) impar(es)");
        System.out.println(contadorPositivo+" valor(es) positivo(s)");
        System.out.println(contadorNegativo+" valor(es) negativo(s)");

        s.close();
    }
}