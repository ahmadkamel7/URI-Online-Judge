import java.util.Scanner;

class Problema2176 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qt = 0;
        char [] c = s.nextLine().toCharArray();

        for(int i=0; i< c.length; i++) {
            if (c[i] == '1') { qt++; }
        }

        String resp = "";
        if(qt % 2 == 0) { resp = String.valueOf(c) + "0"; }
        else { resp = String.valueOf(c) + "1"; }

        System.out.println(resp);
        s.close();
    }
}