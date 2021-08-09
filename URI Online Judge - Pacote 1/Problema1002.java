import java.util.Scanner;

class Problema1002 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double raio = s.nextDouble(); 
        double area = raio * raio * 3.14159;

        System.out.format("A=%.4f", area); // %.nf -> arredonda um double em exatas n casas (usar System.out.format)
        System.out.println();

        s.close();
    }
}

