class Problema1155 {

    public static void main(String[] args) {
        double S = 0;
        for (int i=1; i<=100; i++) {
            S += (double) 1/i;
        }

        System.out.format("%.2f", S);
        System.out.println();
    }
}