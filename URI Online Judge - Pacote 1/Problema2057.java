import java.util.Scanner;

public class Problema2057 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int horaSaida = s.nextInt();
        int tempoViagem = s.nextInt();
        int fuso = s.nextInt();

        int resp = horaSaida + tempoViagem + fuso;

        if(resp >= 24) { resp-=24; }
        else if (resp < 0) { resp+=24; }
        System.out.println(resp);
        s.close();
    }
}