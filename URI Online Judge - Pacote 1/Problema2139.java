import java.util.Scanner;

class Problema2139 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qt = 0;

        while (s.hasNextInt()) {
            int mes = s.nextInt();
            int dia = s.nextInt();

            if (mes == 12 && dia == 25) { System.out.println("E natal!"); }
            else if (mes == 12 && dia == 24) { System.out.println("E vespera de natal!"); }
            else if (mes == 12 && dia > 25) { System.out.println("Ja passou!"); }
            else {
                for (int i=mes; i<12; i++) {
                    if (i == 4 || i == 6 || i == 9 || i == 11) { qt+=30; }
                    else if (i==2) { qt+=29; }
                    else { qt+=31; }
                }
                System.out.println("Faltam "+(qt-dia+25)+" dias para o natal!");
            }
            qt = 0;
        }

        s.close();
    }
}