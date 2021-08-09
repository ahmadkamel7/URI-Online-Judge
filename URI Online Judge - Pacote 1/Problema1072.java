import java.util.Scanner;

class Problema1072 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qt = s.nextInt();
        int i = 0;
        int contador = 0;

        while (i < qt) {
            int num = s.nextInt();

            if (num>= 10 && num<=20) { contador++; }
            i++;
        }

        System.out.println(contador+" in");
        System.out.println( (qt-contador)+" out");

        s.close();
    }
}