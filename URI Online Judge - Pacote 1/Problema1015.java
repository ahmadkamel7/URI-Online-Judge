import java.util.Scanner;

class Problema1015 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        double distancia = Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );

        System.out.format("%.4f", distancia);
        System.out.println();

        s.close();
    }
}