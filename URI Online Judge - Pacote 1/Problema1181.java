import java.util.Scanner;

class Problema1181 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int linha = s.nextInt();
        char op = s.next().charAt(0);
        double [][] matriz = new double [12][12];
        double soma=0;

        for(int i=0; i<12; i++) {
            for(int j=0; j<12; j++) {
                double num = s.nextDouble();
                matriz[i][j] = num;
            }
        }

        for(int i=0; i<12;i++) {
            soma+=matriz[linha][i];
        }

        if (op == 'S') { System.out.format("%.1f%n",soma); }
        if (op == 'M') { System.out.format("%.1f%n",soma/12.0); }

        s.close();
    }
}