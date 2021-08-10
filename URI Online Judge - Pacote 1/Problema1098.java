import java.text.DecimalFormat;

class Problema1098 {

    public static void main(String[] args) {
        double j = 1;
        DecimalFormat df = new DecimalFormat("0.0");

        for (double i=0; i<=2; i+=0.2) {
            for (int k=0; k<3; k++) {
                if (df.format(i).endsWith("0")) {
                    System.out.println("I=" + df.format(i).charAt(0) + " J=" + df.format(j+k).charAt(0));
                }

                else {
                    System.out.println("I=" + df.format(i) + " J=" + df.format(j+k));
                }
            }
            j+=0.2;
        }
    }
}