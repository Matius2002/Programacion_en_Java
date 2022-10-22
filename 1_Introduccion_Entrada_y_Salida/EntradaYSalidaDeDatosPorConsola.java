/*Entrada y salida de datos por consola
Nota: Agregar un .nextLine antes de pedir una cadena de texto
*/
package entradaysalidadedatosporconsola;

import java.util.Scanner;

public class EntradaYSalidaDeDatosPorConsola {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        short numero;
        String cadena;
        char letra;
        
        System.out.print("Digite un número: ");
        numero = entrada.nextShort();
        entrada.nextLine();
        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);
        
        System.out.println("\nEl número es: "+numero);
        System.out.println("La cadena es: "+cadena);
        System.out.println("La letra es: "+letra);
    }
    
}
