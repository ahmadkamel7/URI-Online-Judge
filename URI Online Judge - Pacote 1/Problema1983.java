import java.util.Scanner;

public class Problema1983 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i=0;
        double maiorNota = 0;
        int alunoEscolhido = 0;

        while (i<casos) {
            int numAluno = s.nextInt();
            double nota = s.nextDouble();   

            if(nota > maiorNota) {
                maiorNota = nota;
                alunoEscolhido = numAluno;
            }
            i++;
        }

        if(maiorNota >= 8) { System.out.println(alunoEscolhido); }
        else { System.out.println("Minimum note not reached"); }
        s.close();
    }
}