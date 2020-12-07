package EstructuraWhile;

import java.util.Scanner;

public class Ej2Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que solicite la carga de un valor positivo y nos muestre
		 * desde 1 hasta el valor ingresado de uno en uno. Ejemplo: Si ingresamos 30 se
		 * debe mostrar en pantalla los números del 1 al 30.
		 * 
		 * Es de FUNDAMENTAL importancia analizar los diagramas de flujo y la posterior
		 * codificación en Java de los siguientes problemas, en varios problemas se
		 * presentan otras situaciones no vistas en el ejercicio anterior.
		 */
		// Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables n y x
		int n, x;
		// Le pedimos al usuario que nos diga el valor final que quiere que se muestre.
		System.out.print("Ingrese el valor final:");
		n = teclado.nextInt();
		// Iniciamos nuestra variable x
		x = 1;
		// El bucle se repetira mientas x sea menor o igual a n. Es decir, menor o igual
		// al numero que nos ha dicho el usuario.
		while (x <= n) {
			// imprimimos el valor de x, que se va a ir incrementando en 1 hasta llegar al
			// valor que nos dijo el usuario.
			System.out.print(x);
			System.out.print(" - ");
			x = x + 1;
		}
	}

}
