import java.util.Scanner;

class Problema1178 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        int i = 0;

        while (i<100) {
            double aux = (double) num/ Math.pow(2,i);
            System.out.format("N[%d] = %.4f%n",i,aux);
            i++;
        }

        s.close();
    }
}