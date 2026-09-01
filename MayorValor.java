import java.util.Scanner;

public class MayorValor {
    public static void main (String[] args){

        int contador, numero, masGrande;

        Scanner escaner = new Scanner (System.in);

        System.out.println ("Ingresa un número entero: ");

        masGrande = escaner.nextInt();

        if (masGrande<0){
            masGrande = masGrande * -1;
        }

        for (contador=0; contador<9; contador++){
            System.out.println ("Ingresa un número entero: ");

            numero = escaner.nextInt();

            if (numero < 0){
                numero = numero * -1;
            }

            if (numero > masGrande){
                masGrande=numero;
            }

        }

        System.out.println("El mayor valor de tu serie es: " + masGrande);
        escaner.close();

    }

}