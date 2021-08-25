import java.util.Scanner;

class Problema2140 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int pago = s.nextInt();
            int dado = s.nextInt();
            if (pago == 0 && dado == 0) { break; }
            int troco = dado - pago;
            if (troco == 4 || troco == 7 || troco == 10 || troco == 12 || troco == 15 || troco == 20 || troco == 22 || 
                troco == 25 || troco == 30 || troco == 40 || troco == 52 || troco == 55 || troco == 60 || troco == 70 || 
                troco == 100 || troco == 102 || troco == 105 || troco == 110 || troco == 120 || troco == 150 || troco == 200) {
                    System.out.println("possible");
            }

            else { System.out.println("impossible"); }
            
        }

        s.close();
    }
}