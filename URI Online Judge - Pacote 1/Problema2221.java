import java.util.Scanner;

class Problema2221 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();

        for(int i=0; i< casos; i++) {
            int bonus = s.nextInt();
            int ataqueDabriel = s.nextInt();
            int defesaDabriel = s.nextInt();
            int levelDabriel = s.nextInt();
            int ataqueGuarte = s.nextInt();
            int defesaGuarte = s.nextInt();
            int levelGuarte = s.nextInt();

            double golpeDabriel = (double) ((ataqueDabriel+defesaDabriel)/2);
            double golpeGuarte = (double) ((ataqueGuarte+defesaGuarte)/2);
            if (levelDabriel % 2 == 0) { golpeDabriel+=bonus; }
            if (levelGuarte % 2 == 0) { golpeGuarte+=bonus; }

            if(golpeDabriel > golpeGuarte) { System.out.println("Dabriel"); }
            else if(golpeDabriel < golpeGuarte) { System.out.println("Guarte"); }
            else { System.out.println("Empate"); }
        }
        s.close();
    }
}