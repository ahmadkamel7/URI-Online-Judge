import java.util.Scanner;

public class Problema2031 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i=0;

        while (i<casos) {
            String p1 = s.next();
            String p2 = s.next();

            if (p1.equals("ataque")) {
                if(p2.equals("ataque")) { System.out.println("Aniquilacao mutua"); }
                else { System.out.println("Jogador 1 venceu"); }
            }

            else if (p1.equals("pedra")) {
                if(p2.equals("ataque")) { System.out.println("Jogador 2 venceu"); }
                else if(p2.equals("papel")) { System.out.println("Jogador 1 venceu"); }
                else if(p2.equals("pedra")) { System.out.println("Sem ganhador"); }
            }

            else if (p1.equals("papel")) {
                if(p2.equals("papel")) { System.out.println("Ambos venceram"); }
                else { System.out.println("Jogador 2 venceu"); }
            }
            i++;
        }
        s.close();
    }
}