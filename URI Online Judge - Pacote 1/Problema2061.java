import java.util.Scanner;

public class Problema2061 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int abas = s.nextInt();
        int casos = s.nextInt();
        int i=0;

        while (i < casos) {
            String action = s.next();
            if (action.equals("fechou")) { abas++; }
            if (action.equals("clicou")) { abas--; }
            i++;
        }

        System.out.println(abas);

        s.close();
    }
}