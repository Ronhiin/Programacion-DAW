package EstructuraFor;

import java.util.Scanner;

public class Ej13Estructurafor {
	public static void main(String[] args) {
		/*
		 * Se cuenta con la siguiente información: Las edades de 5 estudiantes del turno
		 * mañana. Las edades de 6 estudiantes del turno tarde. Las edades de 11
		 * estudiantes del turno noche. Las edades de cada estudiante deben ingresarse
		 * por teclado. a) Obtener el promedio de las edades de cada turno (tres
		 * promedios) b) Imprimir dichos promedios (promedio de cada turno) c) Mostrar
		 * por pantalla un mensaje que indique cual de los tres turnos tiene un promedio
		 * de edades menor.
		 */
		// Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos variables e inicializamos algunas
		int f, x, edad, promedio1, promedio2, promedio3, suma;
		suma = 0;
		x = 0;
		promedio1 = 0;
		promedio2 = 0;
		promedio3 = 0;
		// Bucle que se repite 3 veces. Este bucle va a iniciar 3 bucles en su
		// interior,1 para cada turno.
		for (f = 1; f <= 3; f++) {
			// dependiendo de que repeticion sea, esta condicional :
			switch (f) {
			case 1:
				// establece x en 5. x es la variable utilizada para el numero de veces que se
				// repetira cada bucle.
				x = 5;
				// mensaje que se imprime antes de empezar el bucle
				System.out.println("*****ESTUDIANTES DEL TURNO DE MAÑANA*****");
				break;
			case 2:
				// se repetira 6 veces
				x = 6;
				System.out.println("*****ESTUDIANTES DEL TURNO DE TARDE*****");
				break;
			case 3:
				// se repetira 11 veces
				x = 11;
				System.out.println("*****ESTUDIANTES DEL TURNO DE NOCHE*****");
				break;
			}
			// bucle que pregunta la edad de los estudiantes y la acumula. Se repite x
			// veces. la condicional de arriba le da valor a la x.
			for (int g = 1; g <= x; g++) {
				System.out.print("Ingrese la edad del estudiante " + f + " : ");
				edad = teclado.nextInt();
				suma = suma + edad;
			}
			// Condicional que dependiendo de en que repeticion estemos, calculará un
			// promedio con la suma de las edades.
			switch (f) {
			case 1:
				promedio1 = suma / 5;
				break;
			case 2:
				promedio2 = suma / 6;
				break;
			case 3:
				promedio3 = suma / 11;
				break;
			}
			// reiniciamos suma antes de acabar la repetición, para que nos valga la misma
			// variable para otra repeticion.
			suma = 0;
		}
		// Mostramos resultados
		System.out.println("El promedio de edades de la mañana es: " + promedio1);
		System.out.println("El promedio de edades de la tarde es: " + promedio2);
		System.out.println("El promedio de edades de la noche es: " + promedio3);
		// Condicional para saber quien es el promedio menor.
		if (promedio1 < promedio2 && promedio1 < promedio3) {
			System.out.println("El promedio menor es el turno de mañana ");
		} else if (promedio2 < promedio3 && promedio2 < promedio1) {
			System.out.println("El promedio menor es el turno de tarde ");
		} else {
			System.out.println("El promedio menor es el turno de noche ");

		}

	}
}
