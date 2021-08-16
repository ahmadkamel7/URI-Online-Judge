import java.util.Scanner;

public class Problema2060 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int mult2= 0;
        int mult3 = 0;
        int mult4 = 0;
        int mult5 = 0;
        int i = 0;

        while (i < casos) {
            int num = s.nextInt();
            if (num % 2 == 0) { mult2++; }
            if (num % 3 == 0) { mult3++; }
            if (num % 4 == 0) { mult4++; }
            if (num % 5 == 0) { mult5++; }
            i++;
        }

        System.out.println(mult2+" Multiplo(s) de 2");
        System.out.println(mult3+" Multiplo(s) de 3");
        System.out.println(mult4+" Multiplo(s) de 4");
        System.out.println(mult5+" Multiplo(s) de 5");
        s.close();
    }
}