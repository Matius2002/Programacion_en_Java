import javax.swing.*;

public class Sentencia_if_else{
    /*
    La sentencia if:

    if(condicion){
        Instruccion1;
    }
    else{
        Instruccion2;
    }

    Operadores
    == : Igualdad
    != : Diferencia
    >  : Mayor
    >= : Mayor o igual
    <  : Menor
    <= : Menor o igual

     */

    public static void main(String[] args) {
        //Creamos 2 variables
        int numero, dato = 5;

        //Pedimos un numero y se convierte a entero porque el JOptionPane es una cadena
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de un numero: "));

        //Condicion
        if (numero <= dato){
            JOptionPane.showMessageDialog(null,"El numero es 5 o menor");
        }else{
            JOptionPane.showMessageDialog(null,"El numero es mayor a 5");
        }
    }
}
