import java.util.Scanner;

class Problema1957 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String hex = "";

        while (num != 0) {
            int resto = num % 16;
            if (resto == 10) { hex = "A" + hex; }
            if (resto == 11) { hex = "B" + hex; }
            if (resto == 12) { hex = "C" + hex; }
            if (resto == 13) { hex = "D" + hex; }
            if (resto == 14) { hex = "E" + hex; }
            if (resto == 15) { hex = "F" + hex; }
            if (resto < 10) { hex = Integer.toString(resto) + hex; }
            num = num/16;
        }

        System.out.println(hex);

        s.close();
    }
}