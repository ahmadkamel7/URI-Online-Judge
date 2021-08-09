import java.util.Scanner;

class Problema1073 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int i = 1;

        while (i <= N) {
            if(i%2 == 0) { System.out.println(i+"^2 = "+ (i*i) ); }
            i++;
        }
        s.close();
    }
}