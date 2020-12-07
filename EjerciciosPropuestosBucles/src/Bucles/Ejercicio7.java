package Bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 7. Hacer un programa que leyendo un número nos muestre todos los números
		 * primos entre 1 y dicho número.
		 */
		// Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Cremaos las variables necesarias
		int numero;
		// Creamos una variable booleana que nos servirá mas adelante.
		boolean primo;
		// Le pedimos al usuario que nos introduzca un numero
		System.out.print("Introduce un numero: ");
		numero = teclado.nextInt();
		// Iniciamos las variables.
		primo = true;
		// Mostramos resultados
		System.out.println("Los numeros primos desde 1 hasta " + numero + " son: ");
		// Bucle que tiene inicio en 1 y fin en el numero que introduzca el usuario.
		for (int i = 2; i <= numero; i++) {
			// Si i vale 1 o 4, no son numeros primos, por lo que primo sera falso. Ponemos
			// el 4 para librarnos de el siguiente bucle
			if (i == 4) {
				primo = false;
			}
			// Bucle que se repite cuando la i sea mayor a 4
			for (int x = 2; x < i / 2; x++) {
				// Si este numero mayor a 4, es divisible entre x, entonces no es primo.
				if (i % x == 0)
					primo = false;
			}
			// Si la ejecución llega a este punto teniendo a primo como true, entonces es
			// que el numero es primo, por lo que lo mostraremos.
			if (primo == true) {
				System.out.print(i);
				System.out.print(" ");
			}
			// reiniciamos la variable al salir del bucle, que por defecto, es true.
			primo = true;
		}

	}

}
