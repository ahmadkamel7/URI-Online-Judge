import java.util.Scanner;

class Problema1175 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] vetor = new int [20];
        
        for (int i=0; i<20; i++) {
            int num = s.nextInt();
            vetor[i] = num;
        }

        for (int i=0; i<10; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[19-i];
            vetor[19-i] = aux;
        }

        for (int i=0; i<20; i++) {
            System.out.println("N["+i+"] = "+vetor[i]);
        }

        s.close();
    }
}