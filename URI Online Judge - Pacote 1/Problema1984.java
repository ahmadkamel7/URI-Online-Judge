import java.util.Scanner;

public class Problema1984 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        char [] c = num.toCharArray();

        for (int i=0; i< c.length/2; i++) {
            char aux = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = aux;
        }
        num = String.valueOf(c);

        System.out.println(num); 
        s.close();
    }
}
