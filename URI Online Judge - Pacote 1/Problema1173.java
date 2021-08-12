import java.util.Scanner;

class Problema1173 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] vetor = new int [10];
        int num = s.nextInt();
        
        for (int i=0; i<10; i++) {
            vetor[i] = num;
            num*=2;
        }

        for (int i=0; i<10; i++) {
            System.out.println("N["+i+"] = "+vetor[i]);
        }
        
        s.close();
    }
}