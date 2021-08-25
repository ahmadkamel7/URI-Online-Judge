import java.util.Scanner;

class Problema2162 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int first = s.nextInt();
        int i=1;
        boolean pico = true;
        boolean vale = true;
        boolean deuErrado = false;
        while (i < casos) {
            int prox = s.nextInt();

            if ( (prox > first && pico == false) || (first > prox && vale == false) ||  (first == prox)) {
                System.out.println(0);
                deuErrado = true;
                break;
            }
            else {
                if (prox > first) {
                    vale = true;
                    pico = false;
                }
                else {
                    vale = false;
                    pico = true;
                }
            }

            first = prox;
            i++;
        }

        if (!deuErrado) { System.out.println(1); }
        s.close();
    }
}