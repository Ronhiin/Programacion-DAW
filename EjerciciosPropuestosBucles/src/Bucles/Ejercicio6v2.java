package Bucles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio6v2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		// Creamos las variables necesarias
		String frase, palabramayor;
		int numMayus, numMin;
		// inicializamos las variables
		numMin = 0;
		numMayus = 0;
		palabramayor = "";
		// Cargamos el buffer con el contenido del archivo
		BufferedReader br = new BufferedReader(new FileReader("MyFileReader.txt"));
		// leemos la primera linea y la metemos en la variable frase
		frase = br.readLine();
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
