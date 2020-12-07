package EjerciciosBucles;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 6. Leer con un bucle los datos de libros hasta que el usuario decida parar.
		 * Los datos leídos serán; titulo, numPaginas, categoria(drama, terror,
		 * suspense, romantico, fantasia), idioma, numPremios, precio, y un boolean que
		 * informe sobre si el libro está de oferta o no(se leerá (S/N)) El programa
		 * calculará para cada categoría el libro más barato y el más premiado, el
		 * precio medio. Además mostrará de forma general la cantidad de libros escritos
		 * en cada idioma, también mostrará cuántos libros están en oferta (subir nota:
		 * Mostrar el listado de libros en oferta)
		 * 
		 */
		// *********************************************************************************//
		// *********************************************************************************//
		// *********************************************************************************//
		// Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos variables String
		String titulo, categoria, idioma, aux, librosOferta;
		// array que nos permitirá mostrar las categorias mas adelante
		String[] categorias = new String[] { "drama", "terror", "suspense", "romantico", "fantasia" };
		// Array para meter los titulos de los libros mas baratos, dependiendo de cada
		// poisición en el array. Posición 0 drama, 1 terror... etc
		String[] masBarato = new String[5];
		// Lo mismo para el mas premiado
		String[] masPremiado = new String[5];
		// Array para los idiomas
		String[] idiomas = new String[] { "Español", "Ingles", "Aleman", "otro" };
		// Array que nos sirve para calcular el precio medio para cada categoría
		double[] precioMedio = new double[5];
		// Contador para saber cuantos libros se han creado de cada categoría
		int[] contador = new int[] { 0, 0, 0, 0, 0 };
		// LLeva la cantidad de libros para cada idioma que hemos metido
		int[] librosIdiomas = new int[] { 0, 0, 0, 0 };
		// Auxiliar de precio y de premios para comparar la cantidad con el precio
		// actual, segun su categoria.
		double[] auxPrecio = new double[] { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,
				Integer.MAX_VALUE };
		int[] auxPremios = new int[] { 0, 0, 0, 0, 0 };
		// Creamos variables int necesarias
		int numPaginas, numPremios, numOfertas;
		// Creamos variables double
		double precio;
		// Algunas variables boolean que nos ayudaran
		boolean continuar;
		// *********************************************************************************//
		// *********************************************************************************//
		// *********************************************************************************//
		// Inicializamos las variables
		continuar = true;
		numOfertas = 0;
		librosOferta = "";
		// *********************************************************************************//
		// *********************************************************************************//
		// *********************************************************************************//
		// Bucle que se repite hasta que el usuario responda n en la pregunta final.
		do {
			// Le preguntamos al usuario el titulo del libro
			System.out.print("Ingrese titulo del libro: ");
			titulo = teclado.nextLine();
			// le preguntamos al usuario el numero de paginas del libro
			System.out.print("Ingrese numero de páginas del libro: ");
			numPaginas = teclado.nextInt();
			// ponemos la siguiente linea para que no haya errores en una nueva repeticion,
			// ya que nextint no espera pulsar un enter
			teclado.nextLine();
			// Le preguntamos la categoría del libro
			System.out.print("Ingrese categoria del libro: ");
			System.out.print("(drama, terror,suspense, romantico, fantasia): ");
			categoria = teclado.next();
			// Bucle que comprueba que lo introducido es una categoría válida, si no lo es,
			// se le pregunta de nuevo.
			while (categoria.equals("drama") == false && categoria.equals("terror") == false
					&& categoria.equals("suspense") == false && categoria.equals("romantico") == false
					&& categoria.equals("fantasia") == false) {
				System.out.println("Por favor, introduzca una categoria válida.");
				System.out.print("(drama, terror,suspense, romantico, fantasia): ");
				categoria = teclado.next();
			}
			// Le preguntamos el idioma del libro
			System.out.print("Ingrese idioma del libro(Español, Ingles, Aleman u otro): ");
			idioma = teclado.next();
			idioma = idioma.toLowerCase();
			// Condicion que sumara 1 al contador de libros dependiendo de que idioma sea.
			switch (idioma) {
			case "español":
				librosIdiomas[0]++;
				break;
			case "ingles":
				librosIdiomas[1]++;
				break;
			case "aleman":
				librosIdiomas[2]++;
				break;
			default:
				librosIdiomas[3]++;
				break;
			}

			// Le preguntamos los premios del libro
			System.out.print("Ingrese numero de premios del libro: ");
			numPremios = teclado.nextInt();
			teclado.nextLine();
			// Le preguntamos el precio del libro
			System.out.print("Ingrese Precio del libro: ");
			precio = teclado.nextDouble();
			teclado.nextLine();
			// Le preguntamos si el libro está de oferta
			System.out.println("¿El libro está de oferta?:(S/N) ");
			aux = teclado.next();
			// lo pasamos a minusculas
			aux.toLowerCase();
			// si es una s lo introducido :
			if (aux.equals("s")) {
				// sumamos 1 a numofertas
				numOfertas++;
				// Metemos el titulo en librosofertas y le quitaremos los espacios para que
				// despues nos lo divida bien el tokenizer. librosoferta recoge todos los
				// titulos en oferta
				librosOferta = librosOferta + " " + titulo.replace(" ", "-");

			}
			// preguntamos al usuario si desea continuar
			System.out.print("¿Desea continuar?:(S/N) ");
			aux = teclado.next();
			teclado.nextLine();
			aux.toLowerCase();
			// si la respuesta es no, entonces continuar lo pasamos a false.
			if (aux.equals("n")) {
				continuar = false;
			}
			// AQUI CALCULAREMOS TODOS LOS RESULTADOS
			// Condicional que comprueba que categoria ha escrito el usuario:
			switch (categoria) {
			case "drama":
				// suma 1 al contador dependiendo de en que categoria estemos
				contador[0]++;
				// Calcula el precio medio para la categoria
				precioMedio[0] = precioMedio[0] + precio;
				// Si el precio es menor a la variable auxiliar de precio para esta categoria:
				if (precio < auxPrecio[0]) {
					// Cambiamos la auxiliar y metemos el valor de precio
					auxPrecio[0] = precio;
					// El mas barato para esta categoria sera este libro, pues metemos en mas
					// barato, el titulo.
					masBarato[0] = titulo;
				}
				// Hacemos lo mismo para el mas premiado.
				if (numPremios > auxPremios[0]) {
					auxPremios[0] = numPremios;
					masPremiado[0] = titulo;
				}
				break;
			case "terror":
				contador[1]++;
				precioMedio[1] = precioMedio[1] + precio;
				if (precio < auxPrecio[1]) {
					auxPrecio[1] = precio;
					masBarato[1] = titulo;
				}
				if (numPremios > auxPremios[1]) {
					auxPremios[1] = numPremios;
					masPremiado[1] = titulo;
				}
				break;
			case "suspense":
				contador[2]++;
				precioMedio[2] = precioMedio[2] + precio;
				if (precio < auxPrecio[2]) {
					auxPrecio[2] = precio;
					masBarato[2] = titulo;
				}
				if (numPremios > auxPremios[2]) {
					auxPremios[2] = numPremios;
					masPremiado[2] = titulo;
				}
				break;
			case "romantico":
				precioMedio[3] = precioMedio[3] + precio;
				contador[3]++;
				if (precio < auxPrecio[3]) {
					auxPrecio[3] = precio;
					masBarato[3] = titulo;
				}
				if (numPremios > auxPremios[3]) {
					auxPremios[3] = numPremios;
					masPremiado[3] = titulo;
				}
				break;
			case "fantasia":
				precioMedio[4] = precioMedio[4] + precio;
				contador[4]++;
				if (precio < auxPrecio[4]) {
					auxPrecio[4] = precio;
					masBarato[4] = titulo;
				}
				if (numPremios > auxPremios[4]) {
					auxPremios[4] = numPremios;
					masPremiado[4] = titulo;
				}
				break;
			}
			// El bucle acaba cuando continuar sea false.
		} while (continuar == true);
		// *********************************************************************************//
		// *********************************************************************************//
		// *********************************************************************************//
		// AQUI VAMOS A MOSTRAR LOS RESULTADOS, UNA VEZ EL USUARIO NO QUIERA CONTINUAR
		// Bucle que se repite n veces, siendo n el numero total de categorias
		for (int x = 0; x < categorias.length; x++) {
			// Separador
			System.out.println("");
			System.out.println("**********************************************");
			System.out.println("");
			// Muestra resultados, separando por categorias, en cada repeticion.
			System.out.println("Categoría " + categorias[x] + " : ");
			// Mostramso el mas barato y el mas premiado segun la categoria
			System.out.println("1. El libro mas barato es: " + masBarato[x]);
			System.out.println("2. El libro mas premiado es: " + masPremiado[x]);
			// Calculamos el precio medio para cada categoria. precioMedio contiene la suma
			// de todos los precios de esa categoria y contador tiene el numero de libros
			// total de esa categoria
			System.out.println("3. El precio medio es: " + precioMedio[x] / contador[x]);

		}
		// separador
		System.out.println("");
		System.out.println("**********************************************");
		System.out.println("");
		// Mostramos resultados para los idiomas

		// Bucle que se repite dependiendo de cuantos idiomas haya en el array.
		for (int x = 0; x < idiomas.length; x++) {
			// Muestra resultados para cada idioma
			System.out.println("Para el idioma " + idiomas[x] + " hay " + librosIdiomas[x] + " libros.");
		}
		// separador
		System.out.println("");
		System.out.println("**********************************************");
		System.out.println("");
		// Mostramos el nuemro total de libros en oferta
		System.out.println("Hay un total de " + numOfertas + " libros en oferta");
		System.out.println("Los libros en oferta son: ");
		// Dividimos la variable con la ayuda de Stringtokenizer,
		StringTokenizer st = new StringTokenizer(librosOferta);
		// Bucle que nos mostrará una lista con los libros en oferta
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
