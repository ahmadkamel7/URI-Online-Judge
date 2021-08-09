import java.util.Scanner;

class Problema1042 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
            if (num2 < num3) {
                System.out.println(num2);
                System.out.println(num3);
            }

            else {
                System.out.println(num3);
                System.out.println(num2);
            }
        }

        if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
            if (num1 < num3) {
                System.out.println(num1);
                System.out.println(num3);
            }

            else {
                System.out.println(num3);
                System.out.println(num1);
            }
        }

        if (num3 < num1 && num3 < num2) {
            System.out.println(num3);
            if (num1 < num2) {
                System.out.println(num1);
                System.out.println(num2);
            }

            else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }

        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
        s.close();
    }
}