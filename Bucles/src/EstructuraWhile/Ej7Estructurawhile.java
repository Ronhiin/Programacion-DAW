package EstructuraWhile;

import java.util.Scanner;

public class Ej7Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
		 * realizar un programa que lea los sueldos que cobra cada empleado e informe
		 * cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
		 * Además el programa deberá informar el importe que gasta la empresa en sueldos
		 * al personal.
		 */
		// Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int nempleados, x, sueldo, cantidad, suma;
		// Le pedimos al usuario el numero total de empleados
		System.out.print("Ingrese numero de empleados de la empresa : ");
		nempleados = teclado.nextInt();
		// Iniciamos las variables
		cantidad = 0;
		suma = 0;
		x = 1;
		// Bucle que se repetira dependiendo del numero total de empleados
		while (x <= nempleados) {
			// Le pedimos al usuario que ingrese el sueldo de cada empleado.
			System.out.print("Ingrese sueldo de empleado " + x + " : ");
			sueldo = teclado.nextInt();
			// Si el sueldo esta entre 100 y 300, sumamos 1 a cantidad.
			if (sueldo >= 100 && sueldo <= 300) {
				cantidad++;
			}
			// sumamos los sueldos
			suma = suma + sueldo;
			// incrementamos x para que el bucle tenga final.
			x++;
		}
		// Mostramos los resultados
		System.out.println("Los empleados que cobran entre 100 y 300 son: ");
		System.out.println(cantidad);
		System.out.println("Los empleados que cobran mas de 300 son: ");
		// los que cobran mas de 300 son la resta del total de empleados menos los que
		// cobran entre 100 a 300.
		System.out.println(nempleados - cantidad);
		System.out.println("La empresa gasta " + suma + "€ en sueldos al personal");

	}

}
