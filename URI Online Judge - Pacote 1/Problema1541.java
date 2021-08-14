import java.util.Scanner;

class Problema1541 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {

            int medida1 = s.nextInt();
            if(medida1 == 0) { break; }
            int medida2 = s.nextInt();
            int porcentagem = s.nextInt();

            double porcentagemReal = (double) porcentagem/100.00;
            int area = medida1 * medida2;
            double areaRelativa = (double) area / porcentagemReal;
            int lado = (int) Math.sqrt(areaRelativa);
            System.out.println(lado);

        }       
        s.close();
    }
}