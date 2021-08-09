import java.util.Scanner;
import java.text.DecimalFormat;

class Problema1040 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();
        double nota4 = s.nextDouble();

        double mediaPonderada =  ( (nota1*2) + (nota2*3) + (nota3*4) + (nota4*1) ) / 10.0;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Media: "+df.format(mediaPonderada));

        if (mediaPonderada > 7.0) { System.out.println("Aluno aprovado."); }
        else if (mediaPonderada < 5.0) { System.out.println("Aluno reprovado."); }
        else {
            System.out.println("Aluno em exame.");

            double notaExame = s.nextDouble();
            System.out.println("Nota do exame: "+df.format(notaExame));

            double media = (notaExame + mediaPonderada) / 2.0;
            if (media < 5.0) { System.out.println("Aluno reprovado."); }
            else { System.out.println("Aluno aprovado."); }

            System.out.println("Media final: "+df.format(media));
        }
        s.close();
    }
}