import java.util.Scanner;

class Problema1847 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        if (A > B && B <= C) { System.out.println(":)"); }
        else if (A < B && B >= C) { System.out.println(":("); }
        else if (A < B && B < C && (C-B) < (B-A)) { System.out.println(":("); }
        else if (A < B && B < C && (C-B) >= (B-A)) { System.out.println(":)"); }
        else if (A > B && B > C && (B-C) < (A-B)) { System.out.println(":)"); }
        else if (A > B && B > C && (B-C) >= (A-B)) { System.out.println(":("); }
        else if (A == B && B < C) { System.out.println(":)"); }
        else if (A == B && B > C) { System.out.println(":("); }
        else System.out.println(":(");

        s.close();
    }
}