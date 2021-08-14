import java.util.Scanner;

class Problema1589 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i=0;

        while (i < casos) {
            int R1 = s.nextInt();
            int R2 = s.nextInt();

            int raioMinimo = R1 + R2;            
            System.out.println(raioMinimo);

            i++;
        }
        
        s.close();
    }
}