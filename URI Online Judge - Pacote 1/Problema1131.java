import java.util.Scanner;

class Problema1131 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numJogos = 0;
        int inter = 0;
        int gremio = 0;
        int empate = 0;

        while(s.hasNextInt()) {
            int a = s.nextInt();
            int b = s.nextInt();

            numJogos++;
            if (a > b) { inter++; }
            if (a < b) { gremio++; }
            if (a == b) { empate++; }

            int codigo = 0;
            while (codigo != 1 && codigo != 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                codigo = s.nextInt();
            }

            if (codigo == 2) { break; }
        }

        System.out.println(numJogos+" grenais");
        System.out.println("Inter:"+inter);
        System.out.println("Gremio:"+gremio);
        System.out.println("Empates:"+empate);

        if (inter > gremio) { System.out.println("Inter venceu mais"); }
        else { System.out.println("Gremio venceu mais"); }

        s.close();
    }
}