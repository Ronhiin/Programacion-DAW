package EstructuraFor;

import java.util.Scanner;

public class Ej10Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que lea los lados de n tri�ngulos, e informar: a) De
		 * cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales),
		 * is�sceles (dos lados iguales), o escaleno (ning�n lado igual) b) Cantidad de
		 * tri�ngulos de cada tipo. c) Tipo de tri�ngulo que posee menor cantidad.
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
		System.out.print("Ingrese numero de tri�ngulos: ");
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
				System.out.println("Tri�ngulo " + f + " es equil�tero. ");
				equilateros++;
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("Tri�ngulo " + f + " es escaleno. ");
				escalenos++;
			} else {
				System.out.println("Tri�ngulo " + f + " es is�sceles. ");
				isosceles++;
			}
		}
		// Mostramos la cantidad de triangulos de cada tipo
		System.out.println(
				"\n Cantidad de tri�ngulos equil�teros : " + equilateros + "\n Cantidad de tri�ngulos escalenos : "
						+ escalenos + "\n Cantidad de tri�ngulos isosceles : " + isosceles);
		// Condicional que comprueba cual es el menor de los 3 tipos.
		if (equilateros < escalenos && equilateros < isosceles) {
			System.out.print("Hay menos tri�ngulos equil�teros");
		} else if (escalenos < equilateros && escalenos < isosceles) {
			System.out.print("Hay menos tri�ngulos escalenos");
		} else {
			System.out.print("Hay menos tri�ngulos is�sceles");
		}
	}

}
