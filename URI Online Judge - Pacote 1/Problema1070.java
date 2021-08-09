import java.util.Scanner;

class Problema1070 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int contador = 0;

        while (contador < 6) {
            if(X % 2 == 1) { 
                System.out.println(X); 
                contador++;
            }
            X++; 
        }

        s.close();
    }
}