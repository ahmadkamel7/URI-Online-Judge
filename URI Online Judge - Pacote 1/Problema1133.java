import java.util.Scanner;

class Problema1133 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        int soma = 0;
        for (int i = a+1; i<b; i++) {
            if (i % 5 == 2 || i % 5 == 3 ) { System.out.println(i); }
        }
        s.close();
    }
}