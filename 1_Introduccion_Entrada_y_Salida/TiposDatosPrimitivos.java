//Tipos de datos primitivos
package tiposdatosprimitivos;

public class TiposDatosPrimitivos {

    public static void main(String[] args) {
        //Variables de tipo entero
        byte entero = 8; //8 bits
        short entero2; //16 bits
        int entero3; //32 bits
        long entero4; //64 bits
        
        //Variables de punto decimal (pueden almacenar numeros reales)
        float decimal = 3.1416f; //32 bits (se coloca la "f" indicando que el numero es decimal)
        double decimal2 = 3.12; //64 bits
        
        //Variable de tipo caracter
        char caracter = 'z';
        
        //Variable de tipo booleano
        boolean decision = false;//
        
        System.out.println("Numero entero: "+entero);
        System.out.println("Numero decimal: "+decimal);
        System.out.println("Caracter: "+caracter);
        System.out.println("La decisión es: "+decision);
        
        
        
    }
    
}
