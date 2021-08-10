import java.util.Scanner;

class Problema1116 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();

        for(int i=0; i<casos; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (b == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double divisao = (double) a/b;
                
                System.out.format("%.1f", divisao);
                System.out.println();
            }
        }

        s.close();
    }
}