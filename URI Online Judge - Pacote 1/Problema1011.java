import java.util.Scanner;

class Problema1011 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double raio = s.nextDouble();

        double volumeEsfera = (4.0/3.0) * 3.14159 * Math.pow(raio,3);

        System.out.format("VOLUME = %.3f", volumeEsfera);
        System.out.println();

        s.close();
    }
}