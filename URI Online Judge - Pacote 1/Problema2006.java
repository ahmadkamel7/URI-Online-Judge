import java.util.Scanner;

public class Problema2006 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int resp = s.nextInt();
        int acertos = 0;

        for(int i=0; i<5; i++) {
            int palpite = s.nextInt();
            if (palpite == resp) { acertos++; }
        }

        System.out.println(acertos);
        s.close();
    }
}