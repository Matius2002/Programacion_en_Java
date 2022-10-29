/*
Ejercicio 7: Construir un programa que, dado un número total de horas, devuelve el número
de semanas, días y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar
5 semanas, 6 días y 16 horas.
 */
package ej7horascalcularsemanasdiasyhoras;

import java.util.Scanner;

public class Ej7HorasCalcularSemanasDiasYHoras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        int totalHoras,semanas,dias,horas;
        
        System.out.print("Digite el total de horas: ");
        totalHoras = entrada.nextInt();
        
        semanas = totalHoras / 168;//Sacamos cuantas semanas son, se divide entre 168 horas, lo que equivale a una semana
        //(totalHoras%168) nos muestra cuantas horas le sobraron de las semanas y lo dividimos entre 24 horas, es decir, un día
        dias = totalHoras%168 / 24;
        horas = totalHoras%24;
        
        System.out.println("\nSemanas: "+semanas+
                           "\nDías: "+dias+
                           "\nHoras: "+horas);
        
        
        
                }

    
}
