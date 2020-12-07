package EstructuraFor;

import java.util.Scanner;

public class Ej7Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma
		 * de los últimos 5 valores ingresados.
		 */
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos variables
		int f, valor, suma;
		suma = 0;
		// Bucle que se repite 10 veces
		for (f = 1; f <= 10; f++) {
			// Que el usuario ingrese valor cada vez que se repite el bucle
			System.out.println("Ingrese valor " + f + " : ");
			valor = teclado.nextInt();
			// si ya vamos por la repeticion 6, entonces empieza a sumar los valores.
			if (f > 5) {
				suma = suma + valor;
			}
		}
		// Mostramos el resultado.
		System.out.print("La suma de los ultimos 5 valores es : " + suma);
	}

}
