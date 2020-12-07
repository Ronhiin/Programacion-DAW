package EstructuraFor;

import java.util.Scanner;

public class Ej4Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que lea 10 números enteros y luego muestre cuántos
		 * valores ingresados fueron múltiplos de 3 y cuántos de 5. Debemos tener en
		 * cuenta que hay números que son múltiplos de 3 y de 5 a la vez.
		 */
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos variables e inicializamos algunas
		int mul3, mul5, valor, f;
		mul3 = 0;
		mul5 = 0;
		// Bucle que se repetira 10 veces
		for (f = 1; f <= 10; f++) {
			// pedimos al usuario un valor por cada repeticion
			System.out.print("Ingrese un valor:");
			valor = teclado.nextInt();
			// si el resto entre 3 del valor es 0, entonces es multiplo de 3
			if (valor % 3 == 0) {
				mul3 = mul3 + 1;
			}
			// si el resto entre 5 del valor es 0, entonces es multiplo de 5
			if (valor % 5 == 0) {
				mul5 = mul5 + 1;
			}
		}
		// Mostramos resultados
		System.out.print("Cantidad de valores ingresados múltiplos de 3:");
		System.out.println(mul3);
		System.out.print("Cantidad de valores ingresados múltiplos de 5:");
		System.out.print(mul5);
	}

}
