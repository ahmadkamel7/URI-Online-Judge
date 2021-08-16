import java.util.Scanner;

public class Problema1985 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i = 0;
        double soma = 0;

        while (i<casos) {
            int codigo = s.nextInt();
            int qt = s.nextInt();

            if(codigo == 1001) { soma+= qt*1.50; }
            if(codigo == 1002) { soma+= qt*2.50; }
            if(codigo == 1003) { soma+= qt*3.50; }
            if(codigo == 1004) { soma+= qt*4.50; }
            if(codigo == 1005) { soma+= qt*5.50; }
            i++;
        }

        System.out.format("%.2f%n", soma); 
        s.close();
    }
}