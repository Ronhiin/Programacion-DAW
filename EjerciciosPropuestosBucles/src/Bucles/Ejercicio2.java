package Bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. Realiza un programa que lea un número y nos muestre el factorial y el
		 * sumatorio de dicho número, por ejemplo si se introduce el 5, el factorial
		 * seria 5*4*3*2*1, y el sumatorio 5+4+3+2+1, se tiene que utilizar bucle.
		 */
		// Utilizamos la herrmaienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos la variable necesaria
		int num;
		// Le pedimos al usuario que nos ingrese un numero.
		System.out.print("Ingrese numero: ");
		num = teclado.nextInt();
		// Mostramos el sumatorio
		System.out.println("El sumatorio es: ");
		// Bucle que se repite n veces, siendo n el numero ingresado por el usuario
		// en este caso la x del bucle se decrementa, para asi mostrar el numero de
		// forma decreciente, para le sumatorio.
		for (int x = num; x >= 1; x--) {
			// Mostramos x que ira decrementando en cada repeticion
			System.out.print(x);
			// Mientras sea distinto de 1, pondremos el simbolo de +, para que no acabe con
			// un +.
			if (x != 1) {
				System.out.print("+");
			}
		}
		// Salto de linea
		System.out.println("");
		// Mostramos la factorización
		System.out.println("La factorización es: ");
		// Mismo bucle pero para la factorización
		for (int x = num; x >= 1; x--) {
			System.out.print(x);
			if (x != 1) {
				System.out.print("*");
			}
		}

	}

}
