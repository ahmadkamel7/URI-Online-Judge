import java.util.Scanner;

class Problema1018 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int dinheiro = s.nextInt();
        System.out.println(dinheiro);

        int cedulasDe100 = dinheiro / 100;
        System.out.println(cedulasDe100+" nota(s) de R$ 100,00");

        int sobras100 = dinheiro - cedulasDe100*100;
        int cedulasDe50 = sobras100 / 50;
        System.out.println(cedulasDe50+" nota(s) de R$ 50,00");

        int sobras50 = sobras100 - cedulasDe50*50;
        int cedulasDe20 = sobras50 / 20;
        System.out.println(cedulasDe20+" nota(s) de R$ 20,00");

        int sobras20 = sobras50 - cedulasDe20*20;
        int cedulasDe10 = sobras20 / 10;
        System.out.println(cedulasDe10+" nota(s) de R$ 10,00");

        int sobras10 = sobras20 - cedulasDe10*10;
        int cedulasDe5 = sobras10 / 5;
        System.out.println(cedulasDe5+" nota(s) de R$ 5,00");

        int sobras5 = sobras10 - cedulasDe5*5;
        int cedulasDe2 = sobras5 / 2;
        System.out.println(cedulasDe2+" nota(s) de R$ 2,00");

        int sobras2 = sobras5 - cedulasDe2*2;
        int cedulasDe1 = sobras2;
        System.out.println(cedulasDe1+" nota(s) de R$ 1,00");

        s.close();
    }
}