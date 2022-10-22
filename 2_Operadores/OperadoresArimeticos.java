//Operadores ariméticos
package operadoresarimeticos;

import java.util.Scanner;

public class OperadoresArimeticos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//Leer los datos
        //Variables
        float numero1,numero2,suma,resta,mult,div,resto;
        
        //Se piden los números
        System.out.print("Digite el primero número: ");
        numero1 = teclado.nextFloat();//Se guarda el número
        System.out.print("Digite el segundo número: ");
        numero2 = teclado.nextFloat();//S
        
        //Operadores arimeticos (Basicos)
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        System.out.println("\nLa suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("El resto es: "+resto);
        
        
        
    }
    
}
