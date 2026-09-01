public class Tabla {
    public static void main (String[] args){
        int i;

        System.out.println ("  n\t 10*n\t 100*n\t 1000*n\n");

        for (i=1; i<6; i++){
            System.out.printf("  %d  \t %d \t %d \t %d \n", i, 10*i, 100*i, 1000*i);
        }
    }
}