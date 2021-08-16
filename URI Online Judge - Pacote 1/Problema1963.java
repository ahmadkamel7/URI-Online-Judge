import java.util.Scanner;

public class Problema1963 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double A = s.nextDouble();
        double B = s.nextDouble();

        System.out.format("%.2f%%%n", ((B-A)/A)*100);
        s.close();
    }
}