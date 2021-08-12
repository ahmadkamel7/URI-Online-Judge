import java.util.Scanner;

class Problema1172 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] vetor = new int [10];
        
        for (int i=0; i<10; i++) {
            int num = s.nextInt();
            vetor[i] = num;
        }

        for (int i=0; i<10; i++) {
            if (vetor[i] <= 0) { System.out.println("X["+i+"] = 1"); }
            else { System.out.println("X["+i+"] = "+vetor[i]); }
        }
        s.close();
    }
}