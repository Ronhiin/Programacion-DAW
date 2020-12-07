package EstructuraFor;

import java.util.Scanner;

public class Ej5Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que lea n números enteros y calcule la cantidad de
		 * valores mayores o iguales a 1000. Este tipo de problemas también se puede
		 * resolver empleando la estructura repetitiva for. Lo primero que se hace es
		 * cargar una variable que indique la cantidad de valores a ingresar. Dicha
		 * variable se carga antes de entrar a la estructura repetitiva for. La
		 * estructura for permite que el valor inicial o final dependa de una variable
		 * cargada previamente por teclado.
		 */
		// Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos variables e iniciamos cantidad a 0
		int cantidad, n, f, valor;
		cantidad = 0;
		// Le pedimos al usuario que nos indique cuantos valores va a ingresar
		System.out.print("Cuantos valores ingresará:");
		n = teclado.nextInt();
		// Bucle que se repite n veces, segun indique el usuario
		for (f = 1; f <= n; f++) {
			// Se piden valores cada vez que se repite el bucle
			System.out.print("Ingrese el valor:");
			valor = teclado.nextInt();
			// Si el valor introducido es menor a 1000, se suma 1 a cantidad.
			if (valor >= 1000) {
				cantidad = cantidad + 1;
			}
		}
		// Mostramos resultados.
		System.out.print("La cantidad de valores ingresados mayores o iguales a 1000 son:");
		System.out.print(cantidad);

	}

}
