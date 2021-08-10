import java.util.Scanner;

class Problema1144 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        for (int i=1; i<=num; i++) {
            System.out.println(i+" "+(i*i)+" "+(i*i*i));
            System.out.println(i+" "+(i*i+1)+" "+(i*i*i+1));
        }
        s.close();
    }
}