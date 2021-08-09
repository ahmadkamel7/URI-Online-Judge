import java.util.Scanner;

class Problema1060 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int contador = 0;
        while (i<6) {
            double num = s.nextDouble();
            if (num > 0) { contador++; }
            i++;
        }

        System.out.println(contador+" valores positivos");

        s.close();
    }
}