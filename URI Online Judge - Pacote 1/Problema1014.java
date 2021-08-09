import java.util.Scanner;

class Problema1014 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        double Y = s.nextDouble();

        double rendimento = X/Y;

        System.out.format("%.3f km/l", rendimento);
        System.out.println();

        s.close();
    }
}