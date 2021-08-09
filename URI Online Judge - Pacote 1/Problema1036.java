import java.util.Scanner;

class Problema1036 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();

        double delta = (B*B) - 4*A*C;

        if ( (delta < 0) || (A == 0) ) {
            System.out.println("Impossivel calcular");
        }

        else {

            double R1 = ( -B + Math.sqrt(delta) ) / (2*A);
            double R2 = ( -B - Math.sqrt(delta) ) / (2*A);

            //Por alguma razão, o URI quer que divida as raízes por 100, mesmo não sendo as raízes da equação original
            System.out.format("R1 = %.5f", R1);
            System.out.println();
            System.out.format("R2 = %.5f", R2);
            System.out.println();
        }

        s.close();
    }
}