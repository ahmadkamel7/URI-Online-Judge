import java.util.Scanner;

class Problema1160 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i=0;
        int anos = 0;

        while (i < casos) {
            int PA = s.nextInt();
            int PB = s.nextInt();
            double G1 = s.nextDouble();
            double G2 = s.nextDouble();

            while (1==1) {
                if(anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
                
                if(PA > PB) { 
                    System.out.println(anos+" anos.");
                    break; 
                }
                PA += PA*(G1/100);
                PB += PB*(G2/100);
                anos++;
            }
            anos = 0;
            i++;
        }

        s.close();
    }
}