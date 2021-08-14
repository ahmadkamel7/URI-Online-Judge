import java.util.Scanner;

class Problema1864 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String quote = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        System.out.println(quote.substring(0,num));
        s.close();
    }
}