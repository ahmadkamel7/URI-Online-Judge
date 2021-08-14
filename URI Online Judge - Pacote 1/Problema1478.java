import java.util.Scanner;

class Problema1478 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int ordem = s.nextInt();
            if (ordem == 0) { break; }
            int [][] matriz = new int [ordem][ordem];

            for (int i=0; i<ordem; i++) {
                for(int j=0; j<ordem; j++) {
                    matriz[i][j] = Math.abs(i-j)+1;
                }
            }

            for (int i=0; i<ordem; i++) {
                for (int j=0; j<ordem; j++) {
                    if (j==ordem-1) { System.out.printf("%3d\n", matriz[i][j]); }
                    else { System.out.printf("%3d ", matriz[i][j]); }
                }
            }
            System.out.println();
        }
        
        s.close();
    }
}