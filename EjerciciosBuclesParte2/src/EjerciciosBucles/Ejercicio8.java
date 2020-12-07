package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. El programa leer� libros por teclado, el programa acabar� cuando lea el
		 * string de tama�o 1 $. Leer�n los libros por conjuntos, cada conjunto acaba
		 * con un string de tama�o 1 con el car�cter ?.
		 * 
		 * Por cada conjunto, informar cu�ntos d�gitos num�ricos (del 0 al 9)
		 * aparecieron en total (en todos los t�tulos de libros que componen en esa
		 * l�nea). Finalmente, informar cu�ntos conjuntos se ingresaron.
		 ** 
		 * Ejemplo de ejecuci�n:**
		 * 
		 * Libro: Los 3 mosqueteros Libro: Historia de 2 ciudades Libro:? L�nea
		 * completa. Aparecen 2 d�gitos num�ricos. Libro: 20000 leguas de viaje
		 * submarino Libro: El se�or de los anillos Libro: ? L�nea completa. Aparecen 5
		 * d�gitos num�ricos. Libro: 20 a�os despu�s Libro: $ Fin. Se leyeron 3
		 * conjuntos.
		 * 
		 */
		// Herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		String libro;
		int contadorDigitos, contadorConjuntos;
		// inicializamos las variables
		contadorDigitos = 0;
		contadorConjuntos = 0;
		// Bucle que se repite hasta que se escriba $.
		do {
			// Se pregunta al usuario por libros
			System.out.print("Libro: ");
			libro = teclado.nextLine();
			// Si no se escribe ? ni $
			if (libro.equals("?") == false && libro.equals("$") == false) {
				// Bucle que lee todo el titulo y busca digitos. Si encuentra 1, lo suma al
				// contador de digitos.
				for (int x = 0; x < libro.length(); x++) {
					if (Character.isDigit(libro.charAt(x))) {
						contadorDigitos++;
					}
				}
				//si se escribe ?, entonces
			} else if (libro.equals("?")) {
				//Mostramos resultados
				System.out.println("Linea completa.Aparecen " + contadorDigitos + " D�gitos num�ricos");
				//sumamos 1 al contador de conjuntos
				contadorConjuntos++;
				//Reiniciamos el contador de digitos
				contadorDigitos = 0;
			}

		} while (libro.equals("$") == false);
		//Mostramos resultados al final.
		System.out.print("Fin. Se leyeron " + contadorConjuntos + " conjuntos");

	}

}
