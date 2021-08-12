import java.util.Scanner;

class Problema1158 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i = 0;
        int soma = 0;
        int cont = 0;

        while (i < casos) {
            int X = s.nextInt();
            int Y = s.nextInt();

            while (cont < Y) {
                if (X % 2 != 0) {
                    soma+= X;
                    cont++;
                }
                X++;
            }

            System.out.println(soma);
            soma = 0;
            cont = 0;
            i++;
        }

        s.close();
    }
}