package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Escribir un programa que lea n�meros mientras estos sean cada vez m�s
		 * grandes.
		 */
		// Utilizamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las 2 variables necesarias
		int numero, aux;
		// Le preguntamos al usuario un numero inicial
		System.out.print("Ingrese un n�mero: ");
		numero = teclado.nextInt();
		// Aux es una variable que nos ayudar� a saber si el numero que meta el usuario
		// es mayor o no. Simplemente guardar� el anterior numero para compararlo con el
		// nuevo
		aux = numero;
		// Bucle que se repetira si numero es mayor o igual a aux
		while (numero >= aux) {
			// Le pedimos al usuairo que ingrese un numero mayor
			System.out.print("Ingrese un n�mero mayor: ");
			numero = teclado.nextInt();
			// Si el numero es igual al numero anterior o es menor, terminaremos el bucle.
			if (numero <= aux) {
				break;
				// si no, aux valdr� lo de numero y se reinicia el bucle.
			} else {
				aux = numero;
			}
		}
		// Mostramos resultados
		System.out.println("");
		System.out.println(numero + " No es mayor.");
		System.out.println("******************************************************");
		System.out.println("********************* TERMINADO **********************");
		System.out.println("******************************************************");
	}

}
