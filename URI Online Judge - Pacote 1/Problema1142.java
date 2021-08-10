import java.util.Scanner;

class Problema1142 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int aux = 1;

        for (int i=0; i<num; i++) {
            System.out.println(aux+" "+(aux+1)+" "+(aux+2)+" PUM");
            aux+=4;
        }
        s.close();
    }
}