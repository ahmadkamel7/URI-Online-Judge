import java.util.Scanner;

class Problema1064 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        int contador = 0;
        double soma = 0;
        while (i<6) {
            double num = s.nextDouble();
            if (num > 0) { 
                contador++; 
                soma += num;
            }
            i++;
        }

        System.out.println(contador+" valores positivos");
        System.out.format("%.1f", soma/contador);
        System.out.println();

        s.close();
    }
}