import java.util.Scanner;

class Problema1149 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numPositivo = 0;
        int primeiroNum = 0;
        int soma = 0;

        while (s.hasNextInt()) {
            int num = s.nextInt();

            if (num > 0 && numPositivo == 1) { 
                for (int i=0; i<num; i++) {
                    soma+= (primeiroNum+i);
                }
                break;
            }

            if (num > 0 && numPositivo == 0) { 
                primeiroNum = num;
                numPositivo = 1;
            }
        }

        System.out.println(soma);
        s.close();
    }
}