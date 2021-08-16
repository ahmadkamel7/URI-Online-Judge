import java.util.Scanner;

class Problema1914 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i = 0;

        while (i < casos) {
            String nome1 = s.next();
            String escolhaPessoa1 = s.next();
            String nome2 = s.next();
            String escolhaPessoa2 = s.next();
            int dedos1 = s.nextInt();
            int dedos2 = s.nextInt();


            if ( (dedos1+dedos2) % 2 == 0) {
                if (escolhaPessoa1.equals("PAR")) { System.out.println(nome1); }
                else { System.out.println(nome2); }
            }

            else {
                if (escolhaPessoa1.equals("IMPAR")) { System.out.println(nome1); }
                else { System.out.println(nome2); }
            }

            i++;
        }
        
        s.close();
    }
}