import java.util.Scanner;

public class Problema1960 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
        String numRomano = "";

        int [] arabicos = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] romanos = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        int i=0;
        while (num > 0) {
            if (num >= arabicos[12-i]) {
                numRomano = numRomano + romanos[12-i];
                num-= arabicos[12-i];
            }
            else { i++; }
        }
        System.out.println(numRomano);
        s.close();
    }
}