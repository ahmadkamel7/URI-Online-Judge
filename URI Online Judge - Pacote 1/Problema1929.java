import java.util.Scanner;
import java.util.Arrays;

class Problema1929 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();

        int [] vetor = {A,B,C,D};
        Arrays.sort(vetor);
        //Para um triangulo existir, a soma de dois lados quaisquer tem que ser maior que o valor do terceiro lado
        if ( (vetor[0] + vetor[1]) > vetor[2] || (vetor[1] + vetor[2]) > vetor[3] ) { System.out.println("S"); }
        else { System.out.println("N"); }

        s.close();
    }
}