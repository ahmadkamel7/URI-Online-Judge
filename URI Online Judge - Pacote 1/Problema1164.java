import java.util.Scanner;

class Problema1164 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int soma = 0;
        int j=0;

        while (j < casos) {
            int num = s.nextInt();

            for (int i=1; i<num; i++) {
                if (num % i == 0) { soma+=i; }
            }
    
            if (num == soma) { System.out.println(num+" eh perfeito"); }
            else { System.out.println(num+" nao eh perfeito"); }
            
            soma = 0;
            j++;
        }


        s.close();
    }
}