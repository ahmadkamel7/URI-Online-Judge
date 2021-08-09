import java.util.Scanner;

class Problema1046 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int inicio = s.nextInt();
        int fim = s.nextInt();

        if (inicio == fim) { System.out.println("O JOGO DUROU 24 HORA(S)"); }
        if (inicio < fim) { System.out.println("O JOGO DUROU "+ (fim - inicio)+ " HORA(S)"); }
        if (inicio > fim) { System.out.println("O JOGO DUROU "+ ((24 - inicio) + fim)+ " HORA(S)" ); }

        s.close();
    }
}