package EstructuraFor;

import java.util.Scanner;

public class Ej10Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que lea los lados de n triángulos, e informar: a) De
		 * cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
		 * isósceles (dos lados iguales), o escaleno (ningún lado igual) b) Cantidad de
		 * triángulos de cada tipo. c) Tipo de triángulo que posee menor cantidad.
		 */
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int f, triangulos, lado1, lado2, lado3, equilateros, isosceles, escalenos;
		// Inicializamos las variables
		equilateros = 0;
		isosceles = 0;
		escalenos = 0;
		// Le pedimos al usuario que nos indique cuantos triangulos va a meter
		System.out.print("Ingrese numero de triángulos: ");
		triangulos = teclado.nextInt();
		// Bucle que se repetira nveces, siendo n el numero de triangulos ingresados por
		// el usuario
		for (f = 1; f <= triangulos; f++) {
			// Le pedimos al usuario que ingrese los lados del triangulo
			System.out.print("Ingrese lado 1: ");
			lado1 = teclado.nextInt();
			System.out.print("Ingrese lado 2: ");
			lado2 = teclado.nextInt();
			System.out.print("Ingrese lado 3: ");
			lado3 = teclado.nextInt();
			// Condicional que comprueba los lados del triangulo y nos dice si es
			// equilatero, escaleno o isosceles
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triángulo " + f + " es equilátero. ");
				equilateros++;
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Triángulo " + f + " es escaleno. ");
				escalenos++;
			} else {
				System.out.println("Triángulo " + f + " es isósceles. ");
				isosceles++;
			}
		}
		// Mostramos la cantidad de triangulos de cada tipo
		System.out.println(
				"\n Cantidad de triángulos equiláteros : " + equilateros + "\n Cantidad de triángulos escalenos : "
						+ escalenos + "\n Cantidad de triángulos isosceles : " + isosceles);
		// Condicional que comprueba cual es el menor de los 3 tipos.
		if (equilateros < escalenos && equilateros < isosceles) {
			System.out.print("Hay menos triángulos equiláteros");
		} else if (escalenos < equilateros && escalenos < isosceles) {
			System.out.print("Hay menos triángulos escalenos");
		} else {
			System.out.print("Hay menos triángulos isósceles");
		}
	}

}
