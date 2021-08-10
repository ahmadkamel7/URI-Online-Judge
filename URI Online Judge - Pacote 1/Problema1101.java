import java.util.Scanner;

class Problema1101 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a<=0 || b<=0) {
                break;
            }

            if(a > b) {
                int aux = a;
                a = b;
                b = aux;
            }
            int soma = 0;
            for(int i=a; i<=b; i++) {
                System.out.print(i+" ");
                soma+=i;
            }
            System.out.println("Sum="+soma);
        }

        s.close();
    }
}