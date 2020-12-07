package Bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8. Un alumno tiene 9 asignaturas, matemáticas, física, literatura, historia,
		 * inglés, biología, química, filosofía y religión. Repite si suspende más de 4
		 * asignaturas o si suspende alguna de las competencias; lingüística, social o
		 * científica. Dentro de la lingüística esta literatura e ingles, dentro de la
		 * social historia, biologia y filosofia, y dentro de la científica matemáticas,
		 * física y química. Si la media de las asignaturas de alguna competencia salen
		 * inferior a 5 también suspende. Se pide.
		 * 
		 * Leer x alumnos, para cada uno se lee su nombre y las notas de todas las
		 * asignaturas, mostrar para cada alumno su nota media total y por competencia,
		 * y si tiene que repetir. Al final mostrar el porcentaje de repetidores y el
		 * nombre del alumno con mejor expediente.
		 * 
		 * 
		 */
		// Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int numAlumn, suspensos, repetidores, suma, mejorExp;
		// Creo un array para notas con un tamaño de 9, para no tener que crear una
		// variable por cada asignatura.
		int notas[] = new int[9];
		// Creo un array String para el nombre de las asignaturas, para hacer mas comoda
		// su escritura por un bucle.
		String[] asignaturas = new String[] { "matemáticas", "física", "literatura", "historia", "inglés", "biología",
				"química", "filosofía", "religión" };
		// Creo variables String que nos ayudaran a mostrar los resultados.
		String continuar, nomMejorExp, nomAlumn;
		// Inicializo algunas variables
		continuar = "";
		suspensos = 0;
		repetidores = 0;
		suma = 0;
		numAlumn = 0;
		nomMejorExp = "";
		mejorExp = 0;
		// Bucle que se repetira hasta que el usuario escriba n, al final del todo.
		do {
			// Le pedimos al usuario que ingrese el nombre del alumno
			System.out.print("Ingrese nombre de Alumno: ");
			nomAlumn = teclado.next();
			// Le pedimos que ingrese las notas del alumno
			System.out.println("Ingrese NOTAS de " + nomAlumn);
			System.out.println("*****************************************************************");
			// Bucle que se repite dependiendo de la longitud del array, que en este caso es
			// 9.
			for (int x = 0; x < notas.length; x++) {
				// Le pedimos que ingrese la nota de la asignatura en cuestion. En cada
				// repeticion, cambia de asignatura y solo hemos usado un print.
				System.out.print("Ingrese nota de " + asignaturas[x] + " : ");
				// Lo que ingresa, se va metiendo en cada posicion del array, segun x.
				notas[x] = teclado.nextInt();
				// COndiciona que comprueba si la nota es menor a 5. Si lo es, añade 1 punto a
				// suspensos.
				if (notas[x] < 5) {
					suspensos++;
				}
				// Suma total de todas las notas.
				suma = suma + notas[x];
			}
			// Mostramos resultados
			System.out.println("*****************************************************************");
			// Mostramos nota media
			System.out.println("La nota media de " + nomAlumn + " es : " + (suma / 9));
			// Si la nota media es mayor a lo que tenemos guardado en mejorExp, entonces el
			// mejor expediente debe ser esa nota media. Por lo tanto, el nombre del alumno
			// con mejor nota media es el de mejor expediente.
			if (suma / 9 > mejorExp) {
				mejorExp = suma / 9;
				nomMejorExp = nomAlumn;
			}
			// Mostramos notas medias segun competencias. Aquí sumamos el valor segun las
			// posiciones del array y hacemos la media.
			// Notas de linguistica
			System.out.println("La nota media de " + nomAlumn + " en Linguistica es : " + ((notas[2] + notas[4]) / 2));

			// Notas de social
			System.out.println(
					"La nota media de " + nomAlumn + " en social es : " + ((notas[3] + notas[5] + notas[7]) / 3));
			// Notas de cientifica
			System.out.println(
					"La nota media de " + nomAlumn + " en cientifica es : " + ((notas[0] + notas[1] + notas[6]) / 3));
			// Si suspensos llega a 4 o mas, o la nota media de alguna competencia sea menor
			// a 5, entonces el alumno repite.
			if (suspensos >= 4 || ((notas[2] + notas[4]) / 2) < 5 || ((notas[3] + notas[5] + notas[7]) / 3) < 5
					|| ((notas[0] + notas[1] + notas[6]) / 3) < 5) {
				System.out.println("El alumno " + nomAlumn + " , repite curso.");
				// Suma 1 al total de repetidores
				repetidores++;
			} else {
				// Si no, el alumno no repite.
				System.out.println("El alumno " + nomAlumn + " , NO repite curso.");
			}
			// Sumamos 1 al total de alumnos, para saber a cuantos alumnos ha metido datos
			// el usuario
			numAlumn++;
			// reiniciamos variables
			suma = 0;
			suspensos = 0;
			// Preguntamos al usuario si desea seguir metiendo notas
			System.out.print("¿Desea continuar metiendo notas? Responde n para terminar : ");
			continuar = teclado.next();
			// Convertimos lo que escriba en minusculas.
			continuar = continuar.toLowerCase();
			// el bucle seguirá hasta que el usuario conteste "n"
		} while (continuar.equals("n") == false);
		// Mostramos mas resultados al final
		System.out.println("*****************************************************************");
		// Mostramoso el procentaje de repetidores
		System.out
				.println("Ha habido un porcentaje de repetidores igual a : " + (double) (repetidores * 100) / numAlumn);
		// Mostramos el alumno con mejor expediente.
		System.out.println("El alumno con mejor expediente es: " + nomMejorExp);
	}

}
