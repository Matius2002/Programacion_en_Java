/*
Ejercicio 8: Construir un programa que calcule y muestre por pantalla las raíces
de la ecuación de segundo grado de coeficientes reales. x = (-b +- √b^2 - 4*a*c) / (2*a)
 */
package ej8ecuacionsegundogrado;

import java.util.Scanner;

public class Ej8EcuacionSegundoGrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double a,b,c,x1,x2;
        
        System.out.print("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Digite el valor de c: ");
        c = entrada.nextDouble();
        
        x1 = (-b + Math.sqrt(Math.pow(b, 2)- (4*a*c))) / (2*a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2)- (4*a*c))) / (2*a);
        
        System.out.println("\nResultado 1: "+x1);
        System.out.println("Resultado 2: "+x2);
    }
    
}
