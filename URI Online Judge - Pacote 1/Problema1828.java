import java.util.Scanner;

class Problema1828 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i=1;

        while (i<=casos) {
            String s1 = s.next();
            String s2 = s.next();

            if (s1.equals(s2)) { System.out.println("Caso #"+i+": De novo!"); }

            else if (
                (s1.equals("tesoura") && s2.equals("papel")) ||
                (s1.equals("papel") && s2.equals("pedra")) ||
                (s1.equals("pedra") && s2.equals("lagarto")) ||
                (s1.equals("lagarto") && s2.equals("Spock")) ||
                (s1.equals("Spock") && s2.equals("tesoura")) ||
                (s1.equals("tesoura") && s2.equals("lagarto")) ||
                (s1.equals("lagarto") && s2.equals("papel")) ||
                (s1.equals("papel") && s2.equals("Spock")) ||
                (s1.equals("Spock") && s2.equals("pedra")) ||
                (s1.equals("pedra") && s2.equals("tesoura"))
            ) { System.out.println("Caso #"+i+": Bazinga!"); }

            else { System.out.println("Caso #"+i+": Raj trapaceou!"); }

            i++;
        }       
        s.close();
    }
}