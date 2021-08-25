import java.util.Scanner;

class Problema2166 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grau = s.nextInt();
        double resp = 0;

        for (int i=0; i<grau; i++) {
            resp += 2;
            resp = 1/resp;
        }

        System.out.format("%.10f%n", resp+1);

        s.close();
    }
}