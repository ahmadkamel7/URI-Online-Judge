import java.util.Scanner;

class Problema1061 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palavraDia = s.next();
        int dia1 = s.nextInt();
        int hora1 = s.nextInt();
        char doispontos = s.next().charAt(0);
        int min1 = s.nextInt();
        char doispontoss = s.next().charAt(0);
        int seg1 = s.nextInt();

        String palavraDiaa = s.next();
        int dia2 = s.nextInt();
        int hora2 = s.nextInt();
        char doispontosss = s.next().charAt(0);
        int min2 = s.nextInt();
        char doispontossss = s.next().charAt(0);
        int seg2 = s.nextInt();

        int segundosTotal1 = seg1 + min1*60 + hora1*60*60 + dia1*24*60*60;
        int segundosTotal2 = seg2 + min2*60 + hora2*60*60 + dia2*24*60*60;
        int tempoTotal = segundosTotal2 - segundosTotal1;

        int qtDia = (tempoTotal - tempoTotal % (24*60*60))/(24*60*60);
        tempoTotal-= qtDia*24*60*60;
        int qtHora = (tempoTotal - tempoTotal % (60*60))/(60*60);
        tempoTotal-= qtHora*60*60;
        int qtMin = (tempoTotal - tempoTotal % (60))/(60);
        tempoTotal-= qtMin*60;

        System.out.println(qtDia+" dia(s)");
        System.out.println(qtHora+" hora(s)");
        System.out.println(qtMin+" minuto(s)");
        System.out.println(tempoTotal+" segundo(s)");
        s.close();
    }
}