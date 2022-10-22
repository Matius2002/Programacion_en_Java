//Entrada y salida de datos por JOptionPane
package entradaysalidadedatosporjotionpane;

import javax.swing.JOptionPane;

public class EntradaYSalidaDeDatosPorJOtionPane {

    public static void main(String[] args) {
        //Variables
        String cadena;
        int entero;
        char letra;
        float decimal;
        
        cadena = JOptionPane.showInputDialog("Digite la cadena de texto: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        letra = JOptionPane.showInputDialog("Digite un letra: ").charAt(0);
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite el número decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El número entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El número decimal es: "+decimal);
        
       }
    
}
