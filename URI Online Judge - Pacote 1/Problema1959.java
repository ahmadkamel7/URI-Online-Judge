import java.util.Scanner;

public class Problema1959 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
        long tam = s.nextLong();
        long perimetro = num * tam;

        System.out.println(perimetro);

        s.close();
    }
}