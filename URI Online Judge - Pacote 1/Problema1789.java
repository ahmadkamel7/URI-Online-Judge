import java.util.Scanner;

class Problema1789 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maiorVelocidade = 0;

        while (s.hasNextInt()) {
            int num = s.nextInt();
            int i = 0;
            while (i < num) {
                int vLesma = s.nextInt();
                if (vLesma > maiorVelocidade) { maiorVelocidade = vLesma; }
                i++;
            }

            if (maiorVelocidade < 10) { System.out.println(1); }
            if (maiorVelocidade >= 10 && maiorVelocidade < 20) { System.out.println(2); }
            if (maiorVelocidade >= 20) { System.out.println(3); }

            maiorVelocidade = 0;
        }

        s.close();
    }
}