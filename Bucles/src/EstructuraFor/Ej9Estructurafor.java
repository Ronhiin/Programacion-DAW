package EstructuraFor;

import java.util.Scanner;

public class Ej9Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos
		 * muestre la tabla de multiplicar del mismo (los primeros 12 términos) Ejemplo:
		 * Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
		 */
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos las variables
		int f, valor;
		// Le pedimos al usuario un numero del 1 al 10
		System.out.print("Ingrese un numero del 1 al 10 : ");
		valor = teclado.nextInt();
		// si el valor es menor a 1 o mayor a 10, mostramos mensaje de error.
		if (valor < 1 || valor > 10) {
			System.out.print("Valor incorrecto. Cerrando aplicacion...");
			// si no,
		} else {
			// bucle que se repite 12 veces
			for (f = 1; f <= 12; f++) {
				// mostramos la tabla del numero ingresado por el usuario, que se multiplicara
				// por f, que se va incrementando.
				System.out.println(valor + " X " + f + " = " + (valor * f));
			}
		}

	}

}
