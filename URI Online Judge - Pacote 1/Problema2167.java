import java.util.Scanner;

class Problema2167 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int first = s.nextInt();
        boolean temMenor = false;

        for (int i=0; i<casos-1; i++) {
            int prox = s.nextInt();
            if (prox < first) { 
                System.out.println(i+2);
                temMenor = true;
                break;
            }
            first = prox;
        }

        if(!temMenor) { System.out.println(0); }

        s.close();
    }
}