import java.util.Scanner;

class Problema1827 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int num = s.nextInt();
            int [][] matriz = new int [num][num];

            for (int i=0; i<num; i++) {
                for (int j=0; j<num; j++) {
                    matriz[i][j] = 0;
                    if (i == j) { matriz[i][j] = 2; } 
                    if (i+j == num-1) { matriz[i][j] = 3; }
                    if ( (i >= num/3 && i <= ((num-1)-(num/3)) ) && (j >= num/3 && j <= ((num-1)-(num/3))) ) { matriz[i][j] = 1; }
                    if ( i == ((num/2)) && j == ((num/2))) { matriz[i][j] = 4; }
                }
            }

            for (int i=0; i<num; i++) {
                for (int j=0; j<num; j++) {
                    if (j == num-1) { System.out.println(matriz[i][j]); }
                    else { System.out.print(matriz[i][j]); }
                }
            }
            System.out.println();
        }       
        s.close();
    }
}