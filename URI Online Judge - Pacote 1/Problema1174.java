import java.util.Scanner;

class Problema1174 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double [] vetor = new double [100];
        
        for (int i=0; i<100; i++) {
            double num = s.nextDouble();
            vetor[i] = num;
        }

        for (int i=0; i<100; i++) {
            if (vetor[i]<=10) {
                System.out.format("A[%d] = %.1f", i, vetor[i]);
                System.out.println();
            }
        }

        s.close();
    }
}