import java.util.Scanner;

class Problema1078 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(i+" x "+num+" = "+(i*num));
        }

        s.close();
    }
}