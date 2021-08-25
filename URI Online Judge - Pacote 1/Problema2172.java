import java.util.Scanner;

class Problema2172 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (s.hasNext()) {
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            if(num1 == 0 && num2 == 0) { break; }
            else { System.out.println(num1*num2); }
        }

        s.close();
    }
}