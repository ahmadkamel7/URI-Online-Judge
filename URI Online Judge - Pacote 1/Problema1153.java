import java.util.Scanner;

class Problema1153 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i=num-1; i>1; i--) {
            num*=i;
        }

        System.out.println(num);
        s.close();
    }
}