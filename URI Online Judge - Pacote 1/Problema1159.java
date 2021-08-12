import java.util.Scanner;

class Problema1159 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cont = 0;
        int soma = 0;

        while (s.hasNextInt()) {
            int num = s.nextInt();
            if (num == 0) { break; }

            else {
                while (cont < 5) {
                    if (num % 2 == 0) { 
                        soma += num;
                        cont++;
                    }
                    num++;
                }
            }
            System.out.println(soma);
            soma = 0;
            cont = 0;
        }

        s.close();
    }
}