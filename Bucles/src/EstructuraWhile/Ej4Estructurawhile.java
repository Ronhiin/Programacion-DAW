package EstructuraWhile;

import java.util.Scanner;

public class Ej4Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Una planta que fabrica perfiles de hierro posee un lote de n piezas.
		 * Confeccionar un programa que pida ingresar por teclado la cantidad de piezas
		 * a procesar y luego ingrese la longitud de cada perfil; sabiendo que la pieza
		 * cuya longitud esté comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir
		 * por pantalla la cantidad de piezas aptas que hay en el lote.
		 */
		// inicializamos la variable Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias.
		int x, cantidad, n;
		float largo;
		// Inicializamos x
		x = 1;
		// inicializamos cantidad a 0
		cantidad = 0;
		// Preguntamos cuantas piezas procesará y lo almacenamos en la variable n
		System.out.print("Cuantas piezas procesará:");
		n = teclado.nextInt();
		// Bucle que se repetira mientas x sea menor o igual al numero de piezas que se
		// procesará
		while (x <= n) {
			// Le pedimos al usuario que nos ingrese la medida de cada pieza que se va a
			// procesar. El programa le preguntará por cada una de las piezas. Es decir, se
			// va a repetir la pregunta cuantas veces se repita el bucle, que es el numero
			// de piezas a procesar.
			System.out.print("Ingrese la medida de la pieza:");
			largo = teclado.nextFloat();
			// Si la pieza mide entre 1.20 y 1.30, se le suma a cantidad 1, es decir, son
			// las piezas que son aptas.
			if (largo >= 1.20 && largo <= 1.30) {
				cantidad = cantidad + 1;
			}
			// incrementamos x para que el bucle tenga fin.
			x = x + 1;
		}
		// imprimimos el numero de piezas aptas.
		System.out.print("La cantidad de piezas aptas son:");
		System.out.print(cantidad);
	}

}
