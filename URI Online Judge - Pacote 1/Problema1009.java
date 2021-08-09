import java.util.Scanner;

class Problema1009 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome = s.next();
        double salario = s.nextDouble();
        double vendas = s.nextDouble();

        double comissao = vendas * 15 / 100;
        double salarioFinal = salario + comissao;

        System.out.format("TOTAL = R$ %.2f", salarioFinal);
        System.out.println();

        s.close();
    }
}