import java.util.Scanner;

class Problema2152 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();

        for(int i=0; i<casos; i++) {
            String horas = s.next();
            String minutos = s.next();
            int ocorrencia = s.nextInt();

            if (horas.length() == 1) { horas = "0" + horas; }
            if (minutos.length() == 1) { minutos = "0" + minutos; }
            
            if (ocorrencia == 1) { System.out.println(horas+":"+minutos+" - A porta abriu!"); }
            else { System.out.println(horas+":"+minutos+" - A porta fechou!"); }
        }
        s.close();
    }
}