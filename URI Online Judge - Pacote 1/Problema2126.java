import java.util.Scanner;

public class Problema2126 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int i=1;
        int qt = 0;
        int pos = 0;

        while (s.hasNext()) {
            String s1 = s.next();
            String s2 = s.next();

            for (int j=0; j< (s2.length()-s1.length())+1; j++) {
                if (s1.equals(s2.substring(j, j+s1.length()))) { 
                    qt++; 
                    pos = j+1;
                }
            }
            System.out.println("Caso #"+i+":");
            if (qt == 0) { System.out.println("Nao existe subsequencia"); }
            else {
                System.out.println("Qtd.Subsequencias: "+qt);
                System.out.println("Pos: "+pos);
            }
            System.out.println();
            qt = 0;
            pos = 0;
            i++;
        }
        s.close();
    }
}