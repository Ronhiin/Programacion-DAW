package EjerciciosBucles;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 4. Generar aleatoriamente 100 números dentro de un bucle, calcular la suma de
		 * los pares y la suma de los impares.
		 * 
		 * 
		 */
		// Creamos variables
		int num, sumapar, sumaimpar;
		// las inicializamos
		sumapar = 0;
		sumaimpar = 0;
		// Bucle que se repite 100 veces
		for (int x = 1; x <= 100; x++) {

			// Variable que contendrá un numero aleatorio entre 1 y 100
			num = (int) Math.floor(Math.random() * 100 + 1);
			// Condicionalo que comprueba si el numero es par o impar, y lo suma en la
			// variable correspondientes
			if (num % 2 == 0) {
				sumapar = sumapar + num;
			} else {
				sumaimpar = sumaimpar + num;
			}
		}
		// Mostramos resultados.
		System.out.println("Total de la suma de numeros pares: " + sumapar);
		System.out.println("Total de la suma de numeros impares: " + sumaimpar);

	}

}
