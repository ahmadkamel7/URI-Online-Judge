import java.util.Scanner;

class Problema1016 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int distancia = s.nextInt();

        // "consegue se afastar um quilômetro a cada 2 minutos." = 2*distancia
        System.out.println(2*distancia+" minutos");

        s.close();
    }
}