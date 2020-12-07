package EstructuraFor;

import java.util.Scanner;

public class Ej11Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que pida ingresar coordenadas (x,y) que representan
		 * puntos en el plano. Informar cuántos puntos se han ingresado en el primer,
		 * segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se
		 * ingrese la cantidad de puntos a procesar.
		 */
		// Iniciar Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables y las inicializamos
		int f, ncoordenadas, x, y, cuadrante1, cuadrante2, cuadrante3, cuadrante4;
		cuadrante1 = 0;
		cuadrante2 = 0;
		cuadrante3 = 0;
		cuadrante4 = 0;
		// Le indicamos al usuario que nos diga cuantos puntos quiere meter.
		System.out.print("¿Cuantos puntos quieres ingresar? : ");
		ncoordenadas = teclado.nextInt();
		// bucle que se repite n veces, siendo n el numero de puntos a ingresar.
		for (f = 1; f <= ncoordenadas; f++) {
			// le pedimos x e y
			System.out.print("Ingrese x : ");
			x = teclado.nextInt();
			System.out.print("Ingrese y : ");
			y = teclado.nextInt();
			// dependiendo del valor de x e y, esta condicional va a saber en que cuadrante
			// esta e incrementara 1 a su variable correspondiente.
			if (x < 0 && y > 0) {
				cuadrante1++;
			} else if (x > 0 && y > 0) {
				cuadrante2++;
			} else if (x < 0 && y < 0) {
				cuadrante3++;
			} else {
				cuadrante4++;
			}
			// separador
			System.out.println("******************************************************");
		}
		// Mostramos resultados.
		System.out.print("\nCantidad puntos cuadrante 1 : " + cuadrante1 + "\nCantidad puntos cuadrante 2 : "
				+ cuadrante2 + "\nCantidad puntos cuadrante 3 : " + cuadrante3 + "\nCantidad puntos cuadrante 4 : "
				+ cuadrante4);
	}

}
