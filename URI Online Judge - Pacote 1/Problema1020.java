import java.util.Scanner;

class Problema1020 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numeroDeDias = s.nextInt();

        int anos = numeroDeDias / 365; 
        
        int tempoRestanteAnos = numeroDeDias - anos*365;
        int meses = tempoRestanteAnos / 30;
        int dias = tempoRestanteAnos - meses*30;

        System.out.println(anos+" ano(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");

        s.close();
    }
}