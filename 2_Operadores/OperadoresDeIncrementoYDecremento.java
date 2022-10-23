//Operadores de incremento y decremento
package operadoresdeincrementoydecremento;

public class OperadoresDeIncrementoYDecremento {

    public static void main(String[] args) {
        int x = 5, y;
        
        y = x++;//Se asigna el valor y despues se incrementa (orden de x++)
        y = ++x;//Se incrementa el valor y despues se asigna (orden de ++x)
       
        System.out.println("El número es: "+y);
    }
    
}
