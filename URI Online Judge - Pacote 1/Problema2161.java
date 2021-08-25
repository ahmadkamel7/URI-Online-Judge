import java.util.Scanner;

class Problema2161 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        double resp = 0;
        int i = 0;
        while (i < num) {
            resp+=6;
            resp = 1/resp;
            i++;
        }
        System.out.format("%.10f%n", resp+3);

        s.close();
    }
}