package Bucles;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Realiza un programa que lea una frase con varias palabras y luego lea una
		 * palabra. Debe buscar la palabra en la frase y cuando la encuentre mostrar el
		 * mensaje “Encontrada!” o “No encontrada!”.
		 */
		// Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		String frase, palabra;
		boolean encontrado;
		// Iniciamos la variable booleana
		encontrado = false;
		// Le pedimos al usuario que nos escriba la frase y la palabra a encontrar
		System.out.print("Escriba una frase: ");
		frase = teclado.nextLine();
		System.out.print("Escriba la palabra a encontrar: ");
		palabra = teclado.next();
		// Usamos la herramienta Tokenizer, que nos divide la frase en tokens.
		StringTokenizer st = new StringTokenizer(frase);
		// Bucle que se repite por cada token
		while (st.hasMoreTokens()) {
			// Condicional que comprueba si la palabra es igual al token, y si lo es, pone
			// la variable booleana en true
			if (palabra.equals(st.nextToken())) {
				encontrado = true;
			}
		}
		// Si la encuentra, pone encontrada. Si no, no.
		if (encontrado == true) {
			System.out.print("Encontrada!");
		} else {
			System.out.print("No encontrada!");
		}
	}

}
