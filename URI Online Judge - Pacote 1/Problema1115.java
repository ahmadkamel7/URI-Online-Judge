import java.util.Scanner;

class Problema1114 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()) {
            int x = s.nextInt();
            int y = s.nextInt();
            if (x == 0 || y == 0) {
                break;
            }
            else {
                if(x>0 && y>0) { System.out.println("primeiro"); }
                if(x<0 && y>0) { System.out.println("segundo"); }
                if(x<0 && y<0) { System.out.println("terceiro"); }
                if(x>0 && y<0) { System.out.println("quarto"); }
            }  
        }
        s.close();
    }
}