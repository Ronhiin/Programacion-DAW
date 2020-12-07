package Bucles;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio5v2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		String palabra, frase;
		boolean encontrado;
		// Iniciamos la variable booleana
		encontrado = false;
		// Cargamos el buffer con el contenido del archivo
		BufferedReader br = new BufferedReader(new FileReader("MyFileReader.txt"));
		// leemos la primera linea del archivo y la metemos en la variable frase
		frase = br.readLine();
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
