import java.util.Scanner;

class Problema1150 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int soma = 0;
        int qt = 0;

        while (s.hasNextInt()) {
            int Z = s.nextInt();

            if (Z > X) { 
                for (int i = X; i< Z; i++) {
                    soma+=i;
                    qt++;
                    if (soma > Z) { break; }
                }
                break;
            }
        }

        System.out.println(qt);
        s.close();
    }
}