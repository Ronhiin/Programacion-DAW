package Bucles;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Utilizando lo visto en el anterior, realizar un programa que leyendo una
		 * frase muestre el número de palabras que empiezan por mayúscula y cuantas por
		 * minúscula (función de Character isUpperCase()). Cuántas palabras hay y cual
		 * es la palabra de mayor longitud.
		 */
		// Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		String frase, palabramayor;
		int numMayus, numMin;
		// inicializamos las variables
		numMin = 0;
		numMayus = 0;
		palabramayor = "";
		// Le pedimos al usuario que nos escriba la frase.
		System.out.print("Escriba una frase: ");
		frase = teclado.nextLine();
		// Utilizamos un array en el que se almacenaran las palabras por separado. El
		// metodo Split separa la cadena segun que delimitador le pongamos. En este caso
		// utilizo \\s+, que delimita por 1 o mas espacios. Si ponemos solo \\s, nos
		// puede dar error si el usuario introduce mas de 1 espacio seguido.
		String[] result = frase.split("\\s+");
		// Bucle que recorre el array, es decir, se repite 1 vez por cada palabra.
		for (int x = 0; x < result.length; x++) {
			// Condicional que comprueba si palabramayor es menor que la palabra en cuestion
			// del array.
			// Si lo es, se cambia palabramayor por la palabra de result que es mas grande.
			if (palabramayor.length() <= result[x].length()) {
				palabramayor = result[x];
			}
			// Condicional que comprueba si la primera letra de cada palabra es mayuscula,
			// si no, es minuscula.
			if (Character.isUpperCase(result[x].charAt(0))) {
				numMayus++;
			} else {
				numMin++;
			}
		}
		// Mostramos resultados
		// result.length nos dice el tamaño del array, que será el numero total de
		// palabras.
		System.out.println("Hay un total de : " + (result.length) + " palabras.");
		System.out.println("Hay un total de : " + numMayus + " palabras que empiezan por mayusculas.");
		System.out.println("Hay un total de : " + numMin + " palabras que empiezan por minusculas.");
		System.out.println("La palabra con mas letras es : " + palabramayor);

	}

}
