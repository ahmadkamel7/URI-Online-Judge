import java.util.Scanner;

public class Problema1961 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int saltoSapo = s.nextInt();
        int num = s.nextInt();
        int cano = s.nextInt();
        int i = 1;
        boolean caiu = false;

        while (i < num) {
            int outroCano = s.nextInt();
            if (Math.abs(cano - outroCano) > saltoSapo) {
                System.out.println("GAME OVER");
                caiu = true;
                break;
            }
            cano = outroCano;
            i++;
        }

        if (!caiu) { System.out.println("YOU WIN"); }
        s.close();
    }
}