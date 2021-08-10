import java.util.Scanner;

class Problema1145 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int Y = s.nextInt();

        for (int i=1; i<=Y; i++) {
            if (i%X == 0) {
                System.out.println(i);
            }
            else {
                System.out.print(i+" ");
            }
        }
        s.close();
    }
}