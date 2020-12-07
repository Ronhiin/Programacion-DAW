package Bucles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class prueba {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		String s1;
		String s2;

		// Cargamos el buffer con el contenido del archivo
		BufferedReader br = new BufferedReader(new FileReader("MyFileReader.txt"));

		// Leemos la primera linea
		s1 = br.readLine();

		System.out.println("La primera linea del archivo es: " + s1);
		System.out.println("La linea tiene " + s1.length() + " caracteres");

		System.out.println();
		System.out.println("Separando la linea en trozos tenemos las siguientes palabras:");

		int numTokens = 0;
		StringTokenizer st = new StringTokenizer(s1);

		// bucle por todas las palabras
		while (st.hasMoreTokens()) {
			s2 = st.nextToken();
			numTokens++;
			System.out.println("    Palabra " + numTokens + " es: " + s2);
		}
	}

}
