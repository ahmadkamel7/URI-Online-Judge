import java.util.Scanner;

class Problema2163 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int linha = s.nextInt();
        int coluna = s.nextInt();
        int [][] matriz = new int [linha][coluna];

        for (int i = 0; i<linha; i++) {
            for (int j = 0; j<coluna; j++) {
                int num = s.nextInt();
                matriz[i][j] = num;
            }
        }

        boolean achou = false;
        for(int i = 1; i<linha-1; i++) {
            for (int j = 1; j<coluna-1; j++) {
                if (matriz[i][j] == 42) {
                    if( (matriz[i-1][j] == 7) &&
                        (matriz[i+1][j] == 7) &&
                        (matriz[i][j-1] == 7) &&
                        (matriz[i][j+1] == 7) &&
                        (matriz[i-1][j-1] == 7) &&
                        (matriz[i-1][j+1] == 7) &&
                        (matriz[i+1][j+1] == 7) &&
                        (matriz[i+1][j-1] == 7)
                    ) { 
                        System.out.println((i+1)+" "+(j+1)); 
                        achou = true;
                        break;
                    }
                }
            }
        }
        if (!achou) { System.out.println("0 0");  }

        s.close();
    }
}