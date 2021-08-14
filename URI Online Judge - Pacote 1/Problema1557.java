import java.util.Scanner;

class Problema1557 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int ordem = s.nextInt();
            if (ordem == 0) { break; }
            int [][] matriz = new int [ordem][ordem];
            int num = 1;

            for (int i=0; i<ordem; i++) {
                int ant = num;
                for (int j=0; j<ordem; j++) {
                    matriz[i][j] = num;
                    num*=2;
                }
                num = ant*2;
            }

            int T = String.valueOf(matriz[ordem-1][ordem-1]).length();

            for (int i=0; i<ordem; i++) {
                for (int j=0; j<ordem; j++) {
                    if (j==ordem-1) { System.out.printf("%"+T+"d\n", matriz[i][j]); }
                    else { System.out.printf("%"+T+"d ", matriz[i][j]); }
                }
            }
            System.out.println();
        }
        
        s.close();
    }
}