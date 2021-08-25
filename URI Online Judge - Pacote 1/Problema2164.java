import java.util.Scanner;

class Problema2164 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grau = s.nextInt();
        double resultado = (double) (Math.pow((1+Math.sqrt(5))/2, grau) - Math.pow((1-Math.sqrt(5))/2, grau))/Math.sqrt(5);
        System.out.format("%.1f%n", resultado);
        s.close();
    }
}