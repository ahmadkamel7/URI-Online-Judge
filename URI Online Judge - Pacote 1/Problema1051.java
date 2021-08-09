import java.util.Scanner;

class Problema1051 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double salarioInicial = s.nextDouble();
        double imposto = 0;

        if (salarioInicial <= 2000) { System.out.println("Isento"); }
        else {

            if (salarioInicial > 2000 && salarioInicial <= 3000) {
                imposto = (salarioInicial - 2000) * 0.08;
            }
    
            if (salarioInicial > 3000 && salarioInicial <= 4500) {
                imposto = (1000*0.08) + (salarioInicial - 3000)*0.18;
            }
    
            if (salarioInicial > 4500) {
                imposto = (1000*0.08) + (1500*0.18) + (salarioInicial - 4500)*0.28;
            }
    
            System.out.format("R$ %.2f",imposto);
            System.out.println();

        }

        s.close();
    }
}