//importamos la herramienta Scanner
import java.util.Scanner;

public class Ej1Programacionestructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamamos al objeto escaner, inicializandolo.
		Scanner teclado=new Scanner(System.in);
		
		//creamos las variables necesarias para nuestras operaiciones.
		//Todas son enteros, por lo que lo creamos en una sola linea.
    	int num1,num2,suma,producto;
    	//Pedimos al usuario que ingrese un valor
    	System.out.print("Ingrese primer valor:");
    	//Le metemos a la variable num1, el valor ingresado.
    	num1=teclado.nextInt();
    	//repetimos lo mismo para la variable num2
    	System.out.print("Ingrese segundo valor");
    	num2=teclado.nextInt();
    	// realizamos las operaciones. Primero la suma de las 2 variables.
    	//el resultado lo metemos en la variable suma.
    	suma=num1 + num2;
    	//Luego la multiplicación. Metemos el resultado en la variable producto.
    	producto=num1 * num2;
    	//Sacamos por pantalla los resultados.
    	System.out.print("La suma de los dos valores es:");
    	//Sacamos el resultado de la suma.
    	System.out.println(suma);
    	System.out.print("El producto de los dos valores es:");
    	//sacamos el resultado del producto.
    	System.out.println(producto);
	}

}
