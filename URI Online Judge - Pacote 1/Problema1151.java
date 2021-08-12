import java.util.Scanner;

class Problema1151 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int soma = 0;
        int ant = 0;
        int antant = 1;

        for (int i=1; i<=num; i++) {
            if (i==1 && i==num-1) { 
                System.out.println(0);
                break;
            }
            if (i==1 && i!=num) { System.out.print(0+" "); }
            soma = ant + antant;
            antant = ant;
            ant = soma;
            if (i==num-1) { 
                System.out.println(soma); 
                break;
            }
            else { System.out.print(soma+" "); }
        }
        s.close();
    }
}