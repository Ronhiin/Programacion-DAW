package EjerciciosBucles;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3. Realizar un programa que lea una frase con al menos 10 palabras y muestre
		 * la palabra con mayor longitud.
		 */
		// Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int contador;
		String frase, palabra, token;
		palabra = "";
		contador = 0;
		// Le pedimos al usuario que escriba una frase con 10 palabras
		System.out.print("Escriba una frase de almenos 10 palabras: ");
		frase = teclado.nextLine();
		// Usamos la herramienta Tokenizer, que nos divide la frase en tokens.
		StringTokenizer st = new StringTokenizer(frase);
		// Contamos cuantas palabras tiene la frase con un contador..
		while (st.hasMoreTokens()) {
			contador++;
			// Metemos en token en una variable
			token = st.nextToken();
			// Condicional que comprueba que palabra es mayor y la almacena en la variable
			// palabra.
			if (token.length() > palabra.length()) {
				palabra = token;
			}
		}
		// Si la frase tiene menos de 10 palabras, entonces mostramos un mensaje de
		// error.
		if (contador < 10) {
			System.out.print("Error...La frase es mas corta de 10 palabras.");
			// si no,
		} else {
			// Mostramos resultados.
			System.out.println("La palabra de mayor longitud es: ");
			System.out.print(palabra);
		}
	}

}
