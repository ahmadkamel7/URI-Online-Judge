import java.util.Scanner;

class Problema2143 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int casos = s.nextInt();
            if (casos == 0) { break; }
            for (int i=0; i<casos; i++) {
                int num = s.nextInt();
                if (num % 2 == 0) { System.out.println( (((num-2)*2)+2) ); }
                else { System.out.println( (((num-1)*2)+1) ); }
            }
        }
        s.close();
    }
}