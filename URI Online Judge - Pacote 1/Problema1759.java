import java.util.Scanner;

class Problema1759 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i=0; i<num; i++) {
            if (i==num-1) { System.out.println("Ho!"); }
            else { System.out.print("Ho "); }
        }

        s.close();
    }
}