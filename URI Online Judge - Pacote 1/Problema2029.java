import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema2029 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        while (s.hasNext()) {
            double volume = s.nextDouble();
            double diametro = s.nextDouble();

            double areaEntrada = (double)(3.14*Math.pow(diametro/2,2));
            double altura = (double)(volume/areaEntrada);

            System.out.println("ALTURA = "+df.format(altura));
            System.out.println("AREA = "+df.format(areaEntrada));
        }
        
        s.close();
    }
}