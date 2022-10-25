/*
Ejercicio 3: Guillermo tiene N dolares.
Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que posee Luis y Guillermo juntos.
Hacer u n programa que calcule e imprima la cantidad de dinero que tienen entre los tres.|
 */
package ej3averiguarcantidaddinero;

import java.util.Scanner;

public class Ej3AveriguarCantidadDinero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        float guillermo,luis,juan,sumaTotal;
        
        //Se pide los dolares de juan
        System.out.print("Digite los dolares de Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo / 2;
        juan = (guillermo + luis) / 2;
        sumaTotal = guillermo + luis + juan;
        
        System.out.println("\nLa cantidad de dinero entre los tres es: "+sumaTotal);
    }
    
}
