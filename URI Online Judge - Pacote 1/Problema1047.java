import java.util.Scanner;

class Problema1047 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int horaInicio = s.nextInt();
        int minutoInicio = s.nextInt();
        int horaFim = s.nextInt();
        int minutoFim = s.nextInt();

        int numeroHoras = 0;
        int numeroMin = 0; //minutoInicio == minutoFim

        if (minutoInicio > minutoFim) { 
            numeroMin = (60-minutoInicio) + minutoFim;
            numeroHoras = -1; 
        }

        if (minutoInicio < minutoFim) { 
            numeroMin = minutoFim - minutoInicio;
        }

        if ( horaInicio == horaFim ) { 
           if (numeroMin == 0 || (minutoInicio > minutoFim)  ) { numeroHoras += 24; }
        }
        if ( horaInicio > horaFim) { numeroHoras += (24 - horaInicio) + horaFim; }
        if ( horaInicio < horaFim) { numeroHoras += horaFim - horaInicio; }

        System.out.println("O JOGO DUROU "+numeroHoras+" HORA(S) E "+numeroMin+" MINUTO(S)");

        s.close();
    }
}