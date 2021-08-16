import java.util.Scanner;

public class Problema2003 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        while(s.hasNext()) {
            String [] horarios = s.nextLine().split(":");
            int horas = Integer.parseInt(horarios[0]);  
            int mins = Integer.parseInt(horarios[1]); 

            if (horas < 7) { System.out.println("Atraso maximo: 0"); }
            else {
                horas++;
                int atraso = (horas-8)*60 + mins;
                System.out.println("Atraso maximo: "+atraso);
            }
        }
        s.close();
    }
}