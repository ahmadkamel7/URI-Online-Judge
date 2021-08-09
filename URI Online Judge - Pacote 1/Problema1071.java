import java.util.Scanner;

class Problema1071 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int Y = s.nextInt();
        int soma = 0;

        if (X > Y) {
            int aux = X;
            X = Y;
            Y = aux;
        }

        for (int i = X+1; i<Y; i++) {
            if ( i % 2 != 0) { 
                soma = soma + i; 
            }
        }

        System.out.println(soma);
        s.close();
    }
}