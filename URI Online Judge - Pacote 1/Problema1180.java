import java.util.Scanner;

class Problema1180 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qt = s.nextInt();
        int i = 0;
        int menor = 1001;
        int pos = 0;

        while (i < qt) {
            int num = s.nextInt();
            if (num < menor) { 
                menor = num;
                pos = i;
            }
            i++;
        }

        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+pos);

        s.close();
    }
}