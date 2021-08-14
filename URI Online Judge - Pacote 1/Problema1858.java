import java.util.Scanner;

class Problema1858 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i=1;
        int pos = 0;
        int menor = 21;

        while (i <= casos) {
            int num = s.nextInt();
            if (num < menor) {
                menor = num; 
                pos = i; 
            }
            i++;
        }

        System.out.println(pos);
        s.close();
    }
}