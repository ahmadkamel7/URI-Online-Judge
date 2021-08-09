import java.util.Scanner;

class Problema1017 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tempo = s.nextInt();
        int velocidade = s.nextInt();

        int distancia = tempo * velocidade; // ΔS

        double consumo = distancia / 12.0; // 12Km/L

        System.out.format("%.3f", consumo);
        System.out.println();

        s.close();
    }
}