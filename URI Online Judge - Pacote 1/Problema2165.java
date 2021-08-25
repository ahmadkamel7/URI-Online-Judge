import java.util.Scanner;

class Problema2165 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tweet = s.nextLine();

        System.out.println((tweet.length() > 140) ? "MUTE" : "TWEET");

        s.close();
    }
}