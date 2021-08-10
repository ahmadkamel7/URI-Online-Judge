import java.util.Scanner;

class Problema1094 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();

        int total = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 1; i <= casos; i++) {
            int numAmostra = s.nextInt();
            char animal = s.next().charAt(0);

            total+=numAmostra;

            switch (animal) {
                case 'C':
                    totalCoelhos+=numAmostra;
                    break;
                case 'R':
                    totalRatos+=numAmostra;
                    break;
                case 'S':
                    totalSapos+=numAmostra;
                    break;
            }
        }

        double porcentagemCoelhos = (double) ((totalCoelhos*100.00)/total);
        double porcentagemRatos = (double) ((totalRatos*100.00)/total);
        double porcentagemSapos = (double) ((totalSapos*100.00)/total);

        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+totalCoelhos);
        System.out.println("Total de ratos: "+totalRatos);
        System.out.println("Total de sapos: "+totalSapos);
        System.out.format("Percentual de coelhos: %.2f ", porcentagemCoelhos);
        System.out.print("%");
        System.out.println();
        System.out.format("Percentual de ratos: %.2f ", porcentagemRatos);
        System.out.print("%");
        System.out.println();
        System.out.format("Percentual de sapos: %.2f ", porcentagemSapos);
        System.out.print("%");
        System.out.println();
        
        s.close();
    }
}