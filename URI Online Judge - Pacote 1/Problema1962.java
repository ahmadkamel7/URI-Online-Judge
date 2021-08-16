import java.util.Scanner;

public class Problema1962 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int casos = s.nextInt();
        int i = 0;

        while (i < casos) {
            int anos = s.nextInt();
            if (anos < 2015) { System.out.println( (2015-anos)+" D.C."); }
            else { System.out.println( (anos-2014)+" A.C."); }
            i++;
        }
        s.close();
    }
}