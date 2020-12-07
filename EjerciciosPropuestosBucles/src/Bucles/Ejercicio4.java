package Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Escribir un programa que lea n (leído por teclado) jugadores de tenis,
		 * leerá su nombre, torneos ganados y posición atp. Mostrará el nombre del
		 * jugador en mejor posición en la lista atp y el del que más torneos ha ganado.
		 * 
		 */
		// utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int njugadores, tornganados, posicion, masTornGanados, mejorPosicion;
		String nombre, nomMasTornGanados, nomMejorPosicion;
		// Inicializamos las variables.
		masTornGanados = 0;
		mejorPosicion = 99999999;
		nomMejorPosicion = "";
		nomMasTornGanados = "";
		// Le preguntamos cuantos jugadores va a introducir
		System.out.print("¿Cuantos jugadores desea introducir? : ");
		njugadores = teclado.nextInt();
		// Bucle que se repetira 1 vezpor cada jugador que vaya a introducir.
		while (njugadores > 0) {
			// Pedimos los datos de los jugadores
			System.out.print("Ingrese nombre de jugador : ");
			nombre = teclado.next();
			System.out.print("Ingrese numero de torneos ganados : ");
			tornganados = teclado.nextInt();
			System.out.print("Ingrese numero de posicion en la lista ATP : ");
			posicion = teclado.nextInt();
			// Condicionales para saber quien es quien mas torneos tiene y quien esta en la
			// mejor posicion
			if (tornganados >= masTornGanados) {
				masTornGanados = tornganados;
				nomMasTornGanados = nombre;
			}
			if (posicion <= mejorPosicion) {
				mejorPosicion = posicion;
				nomMejorPosicion = nombre;
			}

			System.out.println("*****************************************************************");
			// decrementamos para que el bucle tenga final.
			njugadores--;
		}
		// Mostramos resultados
		System.out.println("El jugador con mejor posicion en la ATP: " + nomMejorPosicion);
		System.out.println("El jugador con mas torneos ganados: " + nomMasTornGanados);

	}

}
