import java.util.Scanner;

class Problema1154 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        int qt = 0;
        
        while (s.hasNextInt()) {
            int num = s.nextInt();
            if (num < 0) { break; }
            soma+=num;
            qt++;
        }

        double media = (double) soma/qt;
        System.out.format("%.2f", media);
        System.out.println();
        s.close();
    }
}