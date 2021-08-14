import java.util.Scanner;

class Problema1865 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        int i = 0;

        while (i < casos) {
            String nome = s.next();
            int newtons = s.nextInt();
            if (nome.equals("Thor")) { System.out.println("Y"); }
            else { System.out.println("N"); }
            i++;
        }
        
        s.close();
    }
}