import java.util.Scanner;

public class Problema1958 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double X = s.nextDouble();
        char c = String.valueOf(X).charAt(0);

        if (c == '-') { System.out.format("-%.4E%n", Math.abs(X)); }
		else { System.out.format("+%.4E%n", X); }

        s.close();
    }
}