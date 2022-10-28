/*
Ejercicio 5: La calificación final de un estudiante de informática se calcula con base a las
calificaciones de cuatro aspectos de su rendimiento académico: participación, primer examen
parcial, segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones del 10%, 25%, 25%, 40%. Hacer un programa
que calcule e imprima la calificación final obtenida por un estudiante.
 */
package ej5calificacionfinalestudiante;

import java.util.Scanner;

public class Ej5CalificacionFinalEstudiante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        float participacion,primerParcial,segundoParcial,tercerParcial,calificacionFinal;
        
        //Pedimos los datos y los guardamos
        System.out.print("Digite la nota de la participación: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la nota del primer parcial: ");
        primerParcial = entrada.nextFloat();
        System.out.print("Digite la nota del segundo parcial: ");
        segundoParcial= entrada.nextFloat();
        System.out.print("Digite la nota del tercer parcial: ");
        tercerParcial = entrada.nextFloat();
        
        calificacionFinal = (participacion*0.10f)+(primerParcial*0.25f)+(segundoParcial*0.25f)+(tercerParcial*0.40f);
        
        System.out.println("\nLa nota final del estudiante es: "+calificacionFinal);
        
    }
    
}
