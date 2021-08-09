import java.util.Scanner;

class Problema1041 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double coordX = s.nextDouble();
        double coordY = s.nextDouble();

        if (coordX == 0 && coordY == 0) { System.out.println("Origem"); }
        if (coordX == 0 && coordY != 0) { System.out.println("Eixo Y"); }
        if (coordX != 0 && coordY == 0) { System.out.println("Eixo X"); }

        if (coordX > 0 && coordY > 0) { System.out.println("Q1"); }
        if (coordX < 0 && coordY > 0) { System.out.println("Q2"); }
        if (coordX < 0 && coordY < 0) { System.out.println("Q3"); }
        if (coordX > 0 && coordY < 0) { System.out.println("Q4"); }

        s.close();
    }
}