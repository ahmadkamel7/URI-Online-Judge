import java.util.Scanner;

class Problema2146 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int num= s.nextInt();
            System.out.println(num-1);
        }
        s.close();
    }
}

