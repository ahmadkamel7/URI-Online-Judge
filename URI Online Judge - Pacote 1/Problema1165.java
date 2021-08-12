import java.util.Scanner;

class Problema1165 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int soma = 0;
        int j=0;

        while (j < casos) {
            int num = s.nextInt();
            boolean primo = true;

            /*Todos os divisores de um número são sempre menores ou iguais à sua raiz quadrada */
            for (int i=2; i<=Math.sqrt(num); i++) { 
                if (num % i == 0) { 
                    primo = false; 
                    break;
                }
            }

            if (primo == true) { System.out.println(num+" eh primo"); }
            else { System.out.println(num+" nao eh primo"); }

            j++;
        }

        s.close();
    }
}