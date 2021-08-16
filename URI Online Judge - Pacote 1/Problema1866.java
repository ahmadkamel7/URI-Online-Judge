import java.util.Scanner;

class Problema1866 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i = 0;

        while (i < casos) {
            int num = s.nextInt();
            if (num % 2 == 0) { System.out.println(0); }
            else { System.out.println(1); }
            i++;
        }
        
        s.close();
    }
}