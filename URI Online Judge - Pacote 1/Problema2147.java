import java.util.Scanner;

class Problema2147 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();

        for(int i=0; i<casos; i++) {
            String galopeira = s.next();
            double tempo = galopeira.length() * 0.01;
            System.out.format("%.2f%n", tempo);
        }
        s.close();
    }
}