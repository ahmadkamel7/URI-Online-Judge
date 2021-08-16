import java.util.*;

public class Problema2028 {
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        LinkedList<Integer> sequencia = new LinkedList<Integer>();
        int caso = 1;

        while (s.hasNextInt()) {
            int num = s.nextInt();
            if(num == 0) {
                System.out.println("Caso "+caso+": 1 numero");
                System.out.println(num);
            }
            else {
                sequencia.add(0);
                for (int i=1; i<=num; i++) {
                    for(int j=0; j<i; j++) {
                        sequencia.add(i);
                    }
                }
                int cont = 1;
                System.out.println("Caso "+caso+": "+sequencia.size()+" numeros");
                for (int elem : sequencia) {
                    if (cont == sequencia.size()) { System.out.println(elem); }
                    else { System.out.print(elem+" "); }
                    cont++;
                }
            }
            System.out.println();
            sequencia.clear();
            caso++;
        }
        s.close();
    }
}