import java.util.Scanner;

public class Problema2059 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int j1 = s.nextInt();
        int j2 = s.nextInt();
        int r = s.nextInt();
        int a = s.nextInt();

        if(r==1 && a==1) { System.out.println("Jogador 2 ganha!"); }
        if(r==1 && a==0) { System.out.println("Jogador 1 ganha!"); }
        if(r==0 && a==1) { System.out.println("Jogador 1 ganha!"); }
        if(r==0 && a==0) {
            if ((j1+j2) % 2 == 0) {
                if (p == 1) { System.out.println("Jogador 1 ganha!"); }
                else { System.out.println("Jogador 2 ganha!");}
            } 
            else {
                if (p == 0) { System.out.println("Jogador 1 ganha!"); }
                else { System.out.println("Jogador 2 ganha!");}
            }
        }
        s.close();
    }
}