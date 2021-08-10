import java.util.Scanner;

class Problema1113 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a == b) {
                break;
            }

            if(a > b) { System.out.println("Decrescente"); }
            if(a < b) { System.out.println("Crescente"); }
            
        }

        s.close();
    }
}