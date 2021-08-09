import java.util.Scanner;

class Problema1038 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int codigo = s.nextInt();
        int quantidade = s.nextInt();

        switch(codigo) {
            case 1:
                System.out.format("Total: R$ %.2f", 4.00*quantidade);
                System.out.println();
                break;
            case 2:
                System.out.format("Total: R$ %.2f", 4.50*quantidade);
                System.out.println();
                break;
            case 3:
                System.out.format("Total: R$ %.2f", 5.00*quantidade);
                System.out.println();
                break;
            case 4:
                System.out.format("Total: R$ %.2f", 2.00*quantidade);
                System.out.println();
                break;
            case 5:
                System.out.format("Total: R$ %.2f", 1.50*quantidade);
                System.out.println();
                break;
        }

        s.close();
    }
}