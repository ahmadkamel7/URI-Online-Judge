import java.util.Scanner;

class Problema1435 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int ordem = s.nextInt();
            if (ordem == 0) { break; }
            int [][] matriz = new int [ordem][ordem];
            int num = 0;

            for (int i=1; i<=ordem; i++) {
                for (int j=1; j<=ordem; j++) {
                    num = i;
                    if (j < num) num = j;
                    if (ordem-i+1 < num) num = ordem-i+1;
                    if (ordem-j+1 < num) num = ordem-j+1;
                    matriz[i-1][j-1] = num;
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