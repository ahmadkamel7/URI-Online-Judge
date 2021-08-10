import java.util.Scanner;

class Problema1080 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int maior = 0;
        int pos = 0;

        for (int i=1; i<=100; i++) {
            int num = s.nextInt();
            if (num > maior) {
                maior = num;
                pos = i;
            }
        }

        System.out.println(maior);
        System.out.println(pos);

        s.close();
    }
}