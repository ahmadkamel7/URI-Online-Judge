import java.util.Scanner;

class Problema2203 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Xf,Yf,Xi,Yi,Vi,R1,R2;
        while(s.hasNext()) {
            Xf = s.nextInt();
            Yf = s.nextInt();
            Xi = s.nextInt();
            Yi = s.nextInt();
            Vi = s.nextInt();
            R1 = s.nextInt();
            R2 = s.nextInt();
    
            double distancia = Math.sqrt(Math.pow((Xf-Xi), 2) + Math.pow((Yf-Yi), 2));
            distancia+= 1.5*Vi;
            System.out.println( (distancia > (R1+R2) ? "N" : "Y") );
        }
        s.close();
    }
}