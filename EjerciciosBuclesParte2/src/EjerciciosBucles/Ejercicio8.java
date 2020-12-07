package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. El programa leerá libros por teclado, el programa acabará cuando lea el
		 * string de tamaño 1 $. Leerán los libros por conjuntos, cada conjunto acaba
		 * con un string de tamaño 1 con el carácter ?.
		 * 
		 * Por cada conjunto, informar cuántos dígitos numéricos (del 0 al 9)
		 * aparecieron en total (en todos los títulos de libros que componen en esa
		 * línea). Finalmente, informar cuántos conjuntos se ingresaron.
		 ** 
		 * Ejemplo de ejecución:**
		 * 
		 * Libro: Los 3 mosqueteros Libro: Historia de 2 ciudades Libro:? Línea
		 * completa. Aparecen 2 dígitos numéricos. Libro: 20000 leguas de viaje
		 * submarino Libro: El señor de los anillos Libro: ? Línea completa. Aparecen 5
		 * dígitos numéricos. Libro: 20 años después Libro: $ Fin. Se leyeron 3
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
				System.out.println("Linea completa.Aparecen " + contadorDigitos + " Dígitos numéricos");
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
