/*
Ejercicio 4: Una compañía de venta de carros usados, paga a su personal
de ventas un salario de &1000 mensuales, más una comisión de &150 por cada
carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista
de la empresa ingresa en la computadora los datos pertinentes. Hacer un
programa que calcule e imprima el salario mensual de un vendedor dado.
 */
package salariomensualvendedor;

import java.util.Scanner;

public class SalarioMensualVendedor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables
        final int salarioBase = 1000;
        int carrosVendidos;
        float costeCarro,salarioFinal;
        
        System.out.print("Digite la cantidad de carros vendidos: ");
        carrosVendidos = entrada.nextInt();
        System.out.print("Digite el valor de la venta del carro: ");
        costeCarro = entrada.nextInt();
        
        salarioFinal = salarioBase + (carrosVendidos*150) + (0.05f*costeCarro*carrosVendidos);
  
        System.out.println("\nEl salario mensual del vendedor es: "+salarioFinal);
        
        

        
        
        
        
        
    }
    
}
