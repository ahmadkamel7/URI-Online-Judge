import java.util.Scanner;

class Problema1021 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double dinheiroTotal = s.nextDouble();

        int dinheiro = (int) dinheiroTotal;
        int centavos = (int) ((dinheiroTotal - dinheiro) * 100);

        System.out.println("NOTAS:");

        int cedulasDe100 = dinheiro / 100;
        System.out.println(cedulasDe100+" nota(s) de R$ 100.00");

        int sobras100 = dinheiro - cedulasDe100*100;
        int cedulasDe50 = sobras100 / 50;
        System.out.println(cedulasDe50+" nota(s) de R$ 50.00");

        int sobras50 = sobras100 - cedulasDe50*50;
        int cedulasDe20 = sobras50 / 20;
        System.out.println(cedulasDe20+" nota(s) de R$ 20.00");

        int sobras20 = sobras50 - cedulasDe20*20;
        int cedulasDe10 = sobras20 / 10;
        System.out.println(cedulasDe10+" nota(s) de R$ 10.00");

        int sobras10 = sobras20 - cedulasDe10*10;
        int cedulasDe5 = sobras10 / 5;
        System.out.println(cedulasDe5+" nota(s) de R$ 5.00");

        int sobras5 = sobras10 - cedulasDe5*5;
        int cedulasDe2 = sobras5 / 2;
        System.out.println(cedulasDe2+" nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");

        int sobras2 = sobras5 - cedulasDe2*2;
        int moedasDe1 = sobras2;
        System.out.println(moedasDe1+" moeda(s) de R$ 1.00");

        int moedasDe50 = centavos/50;
        System.out.println(moedasDe50+" moeda(s) de R$ 0.50");

        int sobras50centavos = centavos - 50*moedasDe50;
        int moedasDe25 = sobras50centavos / 25;
        System.out.println(moedasDe25+" moeda(s) de R$ 0.25");

        int sobras25centavos = sobras50centavos - 25*moedasDe25;
        int moedasDe10 = sobras25centavos / 10;
        System.out.println(moedasDe10+" moeda(s) de R$ 0.10");

        int sobras10centavos = sobras25centavos - 10*moedasDe10;
        int moedasDe5 = sobras10centavos / 5;
        System.out.println(moedasDe5+" moeda(s) de R$ 0.05");

        int sobras5centavos = sobras10centavos - 5*moedasDe5;
        int moedasDe1centavo = sobras5centavos;
        System.out.println(moedasDe1centavo+" moeda(s) de R$ 0.01");

        s.close();
    }
}