/*
Ejercicio 6: Hacer un programa que calcule el cuadrado de una suma (a+b)^2 = a^2 + b^2 + 2*a*b
 */
package ej6cuadradosuma;

import java.util.Scanner;

public class Ej6CuadradoSuma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double a,b,cuadradoSuma;
        
        System.out.print("Digite el valor de a: ");
        a = entrada.nextFloat();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextFloat();

        //Nota: Tambien se puede hacer: (a*a) + (b*b) en vez de Math.pow(a, 2) + Math.pow(b, 2)
        cuadradoSuma = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);
        
        System.out.println("\nEl cuadrado de la suma es: "+cuadradoSuma);
        
    }
    
}
