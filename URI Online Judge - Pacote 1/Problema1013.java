import java.util.Scanner;

class Problema1013 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        int teste1 = ( A+B + Math.abs(A-B))/2; //abs = absolute = valor absoluto = módulo
        int maior = ( C+teste1 + Math.abs(C-teste1))/2; //Math.abs() calcula o módulo de um número
        System.out.println(maior+" eh o maior");

        s.close();
    }
}