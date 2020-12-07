package EstructuraWhile;

import java.util.Scanner;

public class Ej3Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos
		 * muestre posteriormente la suma de los valores ingresados y su promedio.
		 */
		// iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias.
		int x, suma, valor, promedio;
		// Inicializamos x, para el bucle.
		x = 1;
		// Inicializamos suma en 0
		suma = 0;
		// Bucle que se repetira mientas x sea menor o igual a 10, ya que queremos 10
		// valores.
		while (x <= 10) {
			// le pedimos al usuario que ingrese un valor cada vez que se repita el bucle
			System.out.print("Ingrese un valor:");
			valor = teclado.nextInt();
			// El valor se va sumando con el valor anterior y se va almacenando en la
			// variable suma. El primer valor se suma con 0, ya que hemos inicializado la
			// variable en 0 anteriormente.
			suma = suma + valor;
			// Incrementamos x, para que el bucle termine cuando valga 10, es decir, cuando
			// haga 10 repeticiones.
			x = x + 1;
		}
		// sacamos el promedio, que es la variable suma que tiene la suma total de los
		// 10 valores, entre 10.
		promedio = suma / 10;
		// mostramos la suma total y el promedio
		System.out.print("La suma de los 10 valores es:");
		System.out.println(suma);
		System.out.print("El promedio es:");
		System.out.print(promedio);
	}

}
