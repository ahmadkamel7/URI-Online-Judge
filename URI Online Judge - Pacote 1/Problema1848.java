import java.util.Scanner;

class Problema1848 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        
        while (s.hasNext()) {
            String s1 = s.nextLine();

            if (s1.equals("caw caw")) {
                System.out.println(soma);
                soma = 0;
                cont++;
                if (cont == 3) { break; }
            }

            else {
                char [] c = s1.toCharArray();
                for (int i=0; i< c.length; i++) {
                    if (c[i] == '*') { soma+=Math.pow(2, 2-i); }
                }
            }
        }
        s.close();
    }
}