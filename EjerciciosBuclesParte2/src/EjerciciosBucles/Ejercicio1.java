package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Solicitar al usuario que ingrese números enteros positivos y, por cada
		 * uno, imprimir la suma de los dígitos que lo componen. (Ej 345 = 300 + 40 + 5)
		 * La condición de corte es que se ingrese el número -1. Al finalizar, mostrar
		 * cuántos de los números ingresados por el usuario fueron números pares.
		 * 
		 */
		// Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int numero, suma, pares, contador;
		String strSuma;
		// Inicializamos algunas variables
		suma = 0;
		pares = 0;
		contador = 0;
		strSuma = "";
		// Bucle que se repetirá hasta que el usuario introduzca un -1
		do {
			// Variable para controlar cuantas veces se repite el bucle
			contador++;
			// Le pedimos al usuario que nos ingrese un numero entero positivo
			System.out.print("Ingrese un numero entero positivo (-1 para terminar) : ");
			numero = teclado.nextInt();
			// Condicional si es mayor de 0
			if (numero > 0) {
				// Sumamos todos los numero que vaya metiendo el usuario
				suma = suma + numero;
				// Si el resto de dividir el numero entre 2, es 0, entonces es par.
				if (numero % 2 == 0) {
					pares++;
				}
				// Si es la primera repeticion, meteremos en el string solo el numero, si no,
				// meteremos un "+".
				if (contador == 1) {
					strSuma = String.valueOf(numero);
				} else {
					strSuma = strSuma + " + " + String.valueOf(numero);
				}
				// Mostramos resultado, donde se mostrará la suma = String con los digitos
				// separados por +
				System.out.println(suma + " = " + strSuma);
			}
		} while (numero != -1);
		// Mostramos Resultados
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.println("******************************************************");
		System.out.print("Ingresaste " + pares + " numeros pares");
	}

}
