import java.util.Scanner;

class Problema1177 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 0;

        while (i<1000) {
            for (int k=num; k>0; k--) {
                if (i == 1000) { break; }
                System.out.println("N["+i+"] = "+(num-k));
                i++;
            }
        }

        s.close();
    }
}