package EstructuraWhile;

import java.util.Scanner;

public class Ej10Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio6. Realizar un programa que permita cargar dos listas de 15 valores
		 * cada una. Informar con un mensaje cual de las dos listas tiene un valor
		 * acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
		 * Tener en cuenta que puede haber dos o más estructuras repetitivas en un
		 * algoritmo.
		 * 
		 */
		// Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int x, valor, suma1, suma2;
		// iniciamos las variables
		suma1 = 0;
		suma2 = 0;
		x = 1;
		// Bucles que se repiten 15 veces
		while (x <= 15) {
			// pedimos al usuario los 15 valores
			System.out.print("Lista 1. Ingrese valor " + x + " : ");
			valor = teclado.nextInt();
			// sumamos los valores
			suma1 = suma1 + valor;
			// incrementamos x para que el bucle tenga fin
			x++;
		}
		// reiniciamos la variable x
		x = 1;
		// bucle igual que el anterior.
		while (x <= 15) {
			System.out.print("Lista 2. Ingrese valor " + x + " : ");
			valor = teclado.nextInt();
			suma2 = suma2 + valor;
			x++;
		}
		// condicionales para saber que lista es mayor.
		if (suma1 == suma2) {
			System.out.print("Listas iguales");
		} else if (suma1 > suma2) {
			System.out.print("Lista 1 mayor");
		} else {
			System.out.print("Lista 2 mayor");
		}
	}

}
