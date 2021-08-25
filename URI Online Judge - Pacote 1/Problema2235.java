import java.util.Scanner;

class Problema2235 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if ( a==b || a==c || b==c || a==b+c || b==a+c || c==a+b) { System.out.println("S"); }
        else { System.out.println("N"); }

        s.close();
    }
}