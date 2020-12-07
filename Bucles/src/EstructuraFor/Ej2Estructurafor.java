package EstructuraFor;

import java.util.Scanner;

public class Ej2Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar un programa que permita la carga de 10 valores por teclado y nos
		 * muestre posteriormente la suma de los valores ingresados y su promedio. Este
		 * problema ya lo desarrollamos , lo resolveremos empleando la estructura for.
		 */
		// Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos variables
		int suma, f, valor, promedio;
		// iniciamos variable
		suma = 0;
		// Bucle que se repite 10 veces y va sumando los valores que nos pide. Nos pide
		// 10 valores
		for (f = 1; f <= 10; f++) {
			System.out.print("Ingrese valor:");
			valor = teclado.nextInt();
			suma = suma + valor;
		}
		// muestra la suma y el promedio obtenido.
		System.out.print("La suma es:");
		System.out.println(suma);
		promedio = suma / 10;
		System.out.print("El promedio es:");
		System.out.print(promedio);
	}

}
