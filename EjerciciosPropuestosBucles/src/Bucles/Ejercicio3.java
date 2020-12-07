package Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Realizar un programa que lea un número de 5 cifras y muestre la posición
		 * de la cifra mayor. (hay que utilizar conversión para pasar de char a int cada
		 * posición). El programa tiene que comprobar que lo leído es un número.
		 */
		// Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int numero, mayor;
		String strNum;
		// iniciamos mayor a 0.
		mayor = 0;
		// Bucle que se repite hasta que el numero sea de 5 cifras y todos sus
		// caracteres sean numericos.
		do {
			// Le pedimos al usuario que introduzca un numero de 5 cifras
			System.out.print("Por favor, introduzca un número de 5 cifras: ");
			strNum = teclado.next();
			// Bucle que comprueba que todos los caracteres son numericos. Hace una pasada
			// por cada caracter introducido.
			for (int i = 0; i < strNum.length(); i++) {
				// Si el caracter no es un digito, entonces ponemos la cadena de caracteres en
				// "0" para que el bucle se vuelva a repetir y el usuario tenga que introducir
				// de nuevo el numeor de 5 cifras correcto.
				if (!Character.isDigit(strNum.charAt(i)))
					strNum = "0";
			}
		} while (strNum.length() != 5);
		// Bucle que comprueba que pasa de sring a int cada digito y lo mete en una
		// variable. Luego se comprobará cual de estos numeros es el mayor.
		for (int x = 0; x <= 4; x++) {
			// Metemos en la variable numero, cada caracter en cada repeticion. Se va a
			// repetir 5 veces el bucle, 1 por cada cifra. Con el metodo de abajo, cogemos
			// el valor numerico de cada char y lo metemos en la variable.
			numero = Character.getNumericValue(strNum.charAt(x));
			// Condicional para saber que numero de los 5 es el mayor.
			if (numero > mayor) {
				mayor = numero;
			}
		}
		// Mostramos resultados
		System.out.println("El numero mayor es: " + mayor);
		// Bucle que nos comprueba en que posición está el numero mayor y si está en mas
		// de una posición.
		// creamos la variable j, que se iniciara en la primera posicion del numero
		// mayor
		int j = strNum.indexOf(String.valueOf(mayor));
		// Bucle que se repita mientras j sea mayor o igual a 1, ya que j puede ser -1
		// cuando no se encuentra resultados, que es cuando acabará el bucle
		while (j >= 0) {
			// Mostramos las posiciones que encuentre
			System.out.print("Se encuentra en la posición: ");
			System.out.println(j);
			// j cambia de valor al final del bucle, buscando otra posición del numero
			// mayor. j+1 es para que empiece la busqueda desde la posicion siguiente a la
			// anterior.
			j = strNum.indexOf(String.valueOf(mayor), j + 1);
		}
	}

}
