/*
Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajadas y de sus salario por hora.
*/
package ej2salariosemanalempleado;

import java.util.Scanner;

public class Ej2SalarioSemanalEmpleado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables
        int horasTrabajadas;
        float salarioHora,salarioSemanal;
        
        //Pedimos las horas trabajadas en la semana y el salario por hora
        System.out.print("Digite las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        System.out.print("Digite el salario por hora: ");
        salarioHora = entrada.nextFloat();
        
        //Operación para el salario semanal
        salarioSemanal = salarioHora * horasTrabajadas ;
        
        System.out.println("\nEl salario semanal del trabajador es: "+salarioSemanal);//Mostramos el salario semanal
        
        
    }
    
}
