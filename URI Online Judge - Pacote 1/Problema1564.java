import java.util.Scanner;

class Problema1564 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int num = s.nextInt();

            if (num == 0) { System.out.println("vai ter copa!"); }
            else { System.out.println("vai ter duas!"); }
        }
        
        s.close();
    }
}