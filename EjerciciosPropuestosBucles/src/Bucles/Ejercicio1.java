package Bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 1. Realizar un programa que lea x números y nos muestre la suma y la
		 * multiplicación de ellos
		 * 
		 */
		// iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int cantNum, suma, multiplicacion, num;
		// Inicializamos las variables, suma en 0 para que la primera vez que se repita
		// le bucle coja el primer numero, es decir, sume a 0.
		// La multiplicación se inicia en 1 para que la primera vez se multiplique en 1
		// y sea el mismo numero que introdujo el usuario.
		suma = 0;
		multiplicacion = 1;
		// Le pedimos al usuario cuantos numeros quiere introducir
		System.out.print("¿Cuantos numeros desea introducir?");
		cantNum = teclado.nextInt();
		// Bucle que se repetira cuantas veces haya dicho el usuario en la variable
		// anterior.
		for (int x = 1; x <= cantNum; x++) {
			// Le pedimos un numero en cada repeticion
			System.out.print("Ingrese numero " + x + " : ");
			num = teclado.nextInt();
			// Vamos sumando todos los numeros y los almacenamos en suma, que se sumara cada
			// vez con el resultado anterior.
			suma = suma + num;
			// Hacemos lo mismo con multiplicación pero multiplicando por el resultado
			// anterior.
			multiplicacion = multiplicacion * num;
		}
		// Mostramos resultados.
		System.out.println("La suma total de todos los numeros es: " + suma);
		System.out.println("La multiplicación de todos los numeros es: " + multiplicacion);

	}

}
