package EstructuraFor;

import java.util.Scanner;

public class Ej12Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer: a)
		 * La cantidad de valores ingresados negativos. b) La cantidad de valores
		 * ingresados positivos. c) La cantidad de múltiplos de 15. d) El valor
		 * acumulado de los números ingresados que son pares.
		 */
		//Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos variables e iniciamos algunas
		int f, valor, positivos, negativos, mul15, pares;
		positivos = 0;
		negativos = 0;
		mul15 = 0;
		pares = 0;
		//Bucle que se repite 10 veces
		for (f = 1; f <= 10; f++) {
			//le pedimos al usuario un valor por cada repeticion
			System.out.print("Ingrese valor " + f + " : ");
			valor = teclado.nextInt();
			//Condicional que comprueba si es negativo o positivo
			if (valor < 0) {
				negativos++;
			} else if (valor > 0) {
				positivos++;
			}
			//Condicional que comprueba si es multiplo de 15
			if (valor % 15 == 0) {
				mul15++;
			}
			//Condicional que comprueba si es par, y si lo es, lo va a acumulando.
			if (valor % 2 == 0) {
				pares = pares + valor;
			}
		}
		//Mostramos resultados.
		System.out.println("*********************************************");
		System.out.println("*********************************************");
		System.out.println("*********************************************");
		System.out.println("Hay " + negativos + " valores negativos");
		System.out.println("Hay " + positivos + " valores positivos");
		System.out.println("Hay " + mul15 + " multiplos de 15");
		System.out.println("Los pares suman " + pares);

	}

}
