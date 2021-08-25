import java.util.Scanner;

class Problema1973 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int [] carneiros = new int[casos];
        int [] visitou = new int[casos];
        int j = 0;
        long soma = 0;
        int contador = 0;

        for(int i=0; i<casos; i++) {
            carneiros[i] = s.nextInt();
            visitou[i] = 0;
        }

        while (j<casos && j>=0) {
            if (carneiros[j] == 0) { break; }
            int atual = j;
            if(carneiros[j] % 2 == 0) { j--; }
            else { j++; }

            carneiros[atual]--;
            visitou[atual] = 1;
        }

        for (int i=0; i<casos; i++) {
            soma+=carneiros[i];
            contador+=visitou[i];
        }

        System.out.println(contador+" "+soma);
        s.close();
    }
}