import java.util.Scanner;

class Problema1008 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numeroDoFuncionario = s.nextInt();
        int salarioPorHora = s.nextInt();
        double horasTrabalhadas = s.nextDouble();

        double salario = salarioPorHora * horasTrabalhadas;

        System.out.println("NUMBER = "+numeroDoFuncionario);
        System.out.format("SALARY = U$ %.2f", salario);
        System.out.println();

        s.close();
    }
}