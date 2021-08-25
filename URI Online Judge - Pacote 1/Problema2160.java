import java.util.Scanner;

class Problema2159 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String texto = s.nextLine();

        System.out.println((texto.length() > 80) ? "NO" : "YES");

        s.close();
    }
}