package EstructuraWhile;

import java.util.Scanner;

public class Ej11Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio7. Desarrollar un programa que permita cargar n números enteros y
		 * luego nos informe cuántos valores fueron pares y cuántos impares. Emplear el
		 * operador % en la condición de la estructura condicional:
		 * 
		 */
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int numeros, x, num, cantidad;
		// Le pedimos al usuario que ingrese cuantos numeros enteros quiere poner
		System.out.print("¿Cuantos numeros enteros quiere ingresar? : ");
		numeros = teclado.nextInt();
		// iniciamos las variables
		cantidad = 0;
		x = 1;
		// bucle que se repetira n veces, lo que diga el usuario en la variable anterior
		while (x <= numeros) {
			// Le pedimos al usuario los valores de los numeros que quiere ingresar
			System.out.print("Ingrese valor " + x + " : ");
			num = teclado.nextInt();
			// si el resto entre 2 del numero es 0, entonces es par.
			if (num % 2 == 0) {
				cantidad++;
			}
			// incrementamos x para que el bucle tenga fin.
			x++;
		}
		// Mostramos los resultados.
		System.out.println("Valores pares: " + cantidad);
		// los valores que no son pares, son impares.
		System.out.println("Valores impares: " + (numeros - cantidad));

	}

}
