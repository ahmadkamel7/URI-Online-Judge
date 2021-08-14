import java.util.Scanner;

class Problema1534 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int num = s.nextInt();

            for (int i=0; i<num; i++) {
                for (int j=0; j<num; j++) {
                    if (j == num-1-i) { System.out.print(2); }
                    else if (j == i) { System.out.print(1); }
                    else { System.out.print(3); }
                }
                System.out.println();
            }
        }       
        s.close();
    }
}