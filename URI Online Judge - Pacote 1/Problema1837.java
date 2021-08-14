import java.util.Scanner;

class Problema1837 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dividendo = s.nextInt();
        int divisor= s.nextInt();
        int resto = 0;
        int quociente = 0;

        if(dividendo > 0 || dividendo % divisor == 0) { quociente = dividendo / divisor; }
        else {
            if (divisor > 0) { quociente = dividendo / divisor -1; }
            if (divisor < 0) { quociente = dividendo / divisor +1; }
        }

        resto = dividendo - (quociente*divisor);
        System.out.println(quociente+" "+resto);

        s.close();
    }
}