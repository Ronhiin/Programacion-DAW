package EstructuraWhile;

import java.util.Scanner;

public class Ej5Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Ejercicio 1. Escribir un programa que solicite ingresar 10 notas de
		 * alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos
		 * menores.
		 */
		// Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos las variables necesarias
		float nota;
		int cantidad, x;
		// iniciamos la variable cantidad y x
		cantidad = 0;
		x = 1;
		// bucle que se repetira 10 veces
		while (x <= 10) {
			// Le pedimos al usuario que ingrese
			System.out.print("Ingrese nota de alumno " + x + " : ");
			nota = teclado.nextFloat();
			// si la nota es mayor o igual a 7, sumamos 1 a cantidad.
			if (nota >= 7) {
				cantidad++;
			}
			// incrementamos x para que el bucle tenga final.
			x++;
		}
		// Mostramos los resultados
		System.out.println("************************************************************************");
		System.out.println("***********************************RESULTADOS***************************");
		System.out.println("************************************************************************");
		System.out.println("Alumnos con nota mayor o igual a 7: ");
		System.out.println(cantidad);
		System.out.println("Alumnos con nota menor a 7: ");
		// Los menores seran el numero total de alumnos menos la cantidad mayores a 7.
		// De esta manera usamos 1 variable en vez de 2.
		System.out.println(10 - cantidad);
	}

}
