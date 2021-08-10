import java.util.Scanner;

class Problema1132 {

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
        for (int i = a; i<=b; i++) {
            if (i % 13 != 0) { soma+=i; }
        }

        System.out.println(soma);

        s.close();
    }
}