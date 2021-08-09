import java.util.Scanner;

class Problema1067 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int i = 1;
        
        while (i<=X) {
            if (i % 2 == 1) { System.out.println(i); }
            i++;
        }

        s.close();
    }
}