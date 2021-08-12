import java.util.Scanner;

class Problema1146 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int num = s.nextInt();

            if (num == 0) { break; }

            for (int i=1; i<=num; i++) {
                if (i != num) { System.out.print(i+" "); }
                else { System.out.println(i); }
            }
        }

        s.close();
    }
}