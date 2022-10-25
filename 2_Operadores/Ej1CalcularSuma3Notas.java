/*
Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones
*/
package ej1calcularsuma3notas;

import java.util.Scanner;

public class Ej1CalcularSuma3Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables
        float nota1,nota2,nota3,suma;
        
        //Pedimos y guardamos las notas
        System.out.print("Digite la primera nota: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite la segunda nota: ");
        nota2 = entrada.nextFloat();
        System.out.print("Digite la tercera nota: ");
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3;//Hacemos la suma
        
        System.out.println("\nLa suma de las tres calificaciones es: "+suma);//Mostramos la suma
        
        
    }
    
}
