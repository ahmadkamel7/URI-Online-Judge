import java.util.Scanner;

class Problema1179 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = 0;
        int [] pares = new int [5];
        int [] impares = new int [5];
        int contPar = 0;
        int contImpar = 0;

        while (j<15) {
            int num = s.nextInt();

            if (contPar != 5 && num % 2 == 0) { 
                pares[contPar] = num;
                contPar++;
            }

            if (contImpar != 5 && num % 2 != 0) { 
                impares[contImpar] = num;
                contImpar++;
            }

            if (j == 14 && contImpar != 5) {
                for(int i=0; i<contImpar; i++) {
                    System.out.println("impar["+i+"] = "+impares[i]);
                }
            }

            if (j == 14 && contPar != 5) {
                for(int i=0; i<contPar; i++) {
                    System.out.println("par["+i+"] = "+pares[i]);
                }
            }

            if (contImpar == 5) {
                for(int i=0; i<5; i++) {
                    System.out.println("impar["+i+"] = "+impares[i]);
                    contImpar = 0;
                }
            }

            if (contPar == 5) {
                for(int i=0; i<5; i++) {
                    System.out.println("par["+i+"] = "+pares[i]);
                    contPar = 0;
                }
            }

            j++;
        }

        s.close();
    }
}