//Clase Math (Clase matematica y trigonometrica)
package clasemath;

public class ClaseMath {

    public static void main(String[] args) {
        double x = 4, y = 3;
        double a = 3.50;
       
        double resultado = Math.abs(a); //Devuelve el valor valor absoluto de un numero
        double resultado2 = Math.acos(a);//Devuelve el arco coseno de un angulo en radianes
        double resultado3 = Math.asin(a);//Devuelve el arco seno de un angulo en radianes
        double resultado4 = Math.atan(a);//Devuelve el arco tangente entre -PI/2 y PI/2
        double resultado5 = Math.atan2(x, y);//Devuelve el arco tangente entre -PI y PI
        double resultado6 = Math.ceil(a);//Devuelve en entero más cercano por arriba
        double resultado7 = Math.floor(a);//Devuelve el entero mas cercano por debajo
        double resultado8 = Math.round(a);//Devuelve el entero mas cercano
        double resultado9 = Math.cos(a);//Devuelve el coseno de un anngulo
        double resultado10 = Math.sin(a);//Devuelve el seno de un angulo
        double resultado11 = Math.tan(a);//Devuelve la tangente de un angulo
        double resultado12 = Math.exp(a);//Devuelve el exponencial de un numero
        double resultado13 = Math.log(a);//Devuelve el logaritmo natural en base e de un numero
        double resultado14 = Math.max(x, y);//Devuelve el mayor de dos entre dos valores
        double resultado15 = Math.min(x, y);//Devuelve el menor de dos entre dos valores
        double resultado16 = Math.random()*10+1;//Devuelve un numero aleatorio entre 1 y 10. Se pueden cambiar el rango de generacion
        double resultado17 = Math.sqrt(a);//Devuelve la raiz cuadrada de un numero
        double resultado18 = Math.pow(x, y);//Devuelve un numero elevado a un exponente
        
        System.out.println("El número es: "+resultado18);
    }
    
}
