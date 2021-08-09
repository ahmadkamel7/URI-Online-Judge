import java.util.Scanner;

class Problema1074 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qt = s.nextInt();
        int i = 0;

        while (i < qt) {
            int num = s.nextInt();

            if (num == 0) { System.out.println("NULL"); }
            if (num > 0 && num % 2 == 0 ) { System.out.println("EVEN POSITIVE"); }
            if (num < 0 && num % 2 == 0 ) { System.out.println("EVEN NEGATIVE"); }
            if (num > 0 && num % 2 != 0 ) { System.out.println("ODD POSITIVE"); }
            if (num < 0 && num % 2 != 0 ) { System.out.println("ODD NEGATIVE"); }
            i++;
        }
        
        s.close();
    }
}