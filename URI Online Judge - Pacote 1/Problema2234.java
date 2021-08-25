import java.util.Scanner;

class Problema2234 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hotdogs = s.nextInt();
        int pessoas = s.nextInt();

        double media = (double) hotdogs/pessoas;
        System.out.format("%.2f%n",media);

        s.close();
    }
}