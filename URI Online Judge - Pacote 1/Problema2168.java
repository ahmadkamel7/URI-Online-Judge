import java.util.Scanner;

class Problema2168 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamanho = s.nextInt();
        int [][] matriz = new int [tamanho+1][tamanho+1];
        int qt = 0;

        for (int i=0; i<tamanho+1; i++) {
            for (int j=0; j<tamanho+1; j++) {
                int num = s.nextInt();
                matriz[i][j] = num;
            }
        }

        for (int i=0; i<tamanho; i++) {
            for (int j=0; j<tamanho; j++) {
                if (matriz[i][j] == 1) { qt++; }
                if (matriz[i][j+1] == 1) { qt++; }
                if (matriz[i+1][j] == 1) { qt++; }
                if (matriz[i+1][j+1] == 1) { qt++; }
                
                if (qt>=2) {
                    if (j == tamanho-1){ System.out.println("S"); }
                    else { System.out.print("S"); }
                }
                else {
                    if (j == tamanho-1){ System.out.println("U"); }
                    else { System.out.print("U"); }
                }

                qt = 0;
            }
        }

        s.close();
    }
}