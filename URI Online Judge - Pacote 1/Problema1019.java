import java.util.Scanner;

class Problema1019 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tempo = s.nextInt();

        int horas = tempo / 3600; 
        
        int tempoRestanteHoras = tempo - horas*3600;
        int minutos = tempoRestanteHoras / 60;
        int segundos = tempoRestanteHoras - minutos*60;

        System.out.println(horas+":"+minutos+":"+segundos);

        s.close();
    }
}