import java.util.Scanner;

class Problema1079 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int i = 0;

        while (i < num) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();

            double mediaPonderada = ((a*2) + (b*3) + (c*5))/10;

            System.out.format("%.1f", mediaPonderada);
            System.out.println();
            i++;
        }
        s.close();
    }
}