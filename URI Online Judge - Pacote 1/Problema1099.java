import java.util.Scanner;

class Problema1099 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();

        for(int i=0; i<casos; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int soma = 0;

            if(a > b) {
                int aux = a;
                a = b;
                b = aux;
            }

            for(int j=a+1; j<b; j++) {
                if (j % 2 != 0) { soma+=j; }
            }

            System.out.println(soma);
        }
        s.close();
    }
}