class Problema1096 {

    public static void main(String[] args) {
        int j=7;
        for (int i=1; i<=9; i+=2) {
            for (int k=0; k<3; k++) {
                System.out.println("I="+i+" J="+ (j-k));
            }
        }
    }
}