import java.util.Scanner;

class Problema2159 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        double minimo = (double) num / Math.log(num);
        double maximo = 1.25506 * minimo;

        System.out.format("%.1f %.1f%n",minimo, maximo);

        s.close();
    }
}