import java.util.Scanner;

class Problema1114 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()) {
            int a = s.nextInt();
            if (a == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }
            else {
                System.out.println("Senha Invalida");
            }  
        }
        s.close();
    }
}