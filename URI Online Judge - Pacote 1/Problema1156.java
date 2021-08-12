class Problema1156 {

    public static void main(String[] args) {
        double S = 0;
        int i = 1;
        int j = 1;

        while (i <= 39) {
            S += (double) i/j;
            i+=2;
            j*=2;
        }

        System.out.format("%.2f", S);
        System.out.println();
    }
}