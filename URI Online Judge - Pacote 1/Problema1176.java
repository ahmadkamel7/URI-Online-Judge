import java.util.Scanner;

class Problema1176 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int j = 0;
        long soma = 0;
        long ant = 0;
        long antant = 1;

        while (j < casos) {
            int num = s.nextInt();

            for (int i=0; i<=num; i++) {
                if (i==0 && i==num) { 
                    System.out.println("Fib(0) = 0");
                    break;
                }
                soma = ant + antant;
                antant = ant;
                ant = soma;
                if (i==num-1) { 
                    System.out.println("Fib("+num+") = "+soma); 
                    break;
                }
            }

            soma = 0;
            ant = 0;
            antant = 1;
            j++;
        }

        s.close();
    }
}