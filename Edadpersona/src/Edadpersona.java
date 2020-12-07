import java.util.Scanner;

public class Edadpersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LLamamos a la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Iniciamos las variables necesarias
		int anoActual, edadActual, anoDeterminado;
		//preguntamos al usuario, el año actual, su edad actual y un año determinado.
		System.out.print("Introduzca año actual: ");
		anoActual = teclado.nextInt();
		System.out.print("Introduzca su edad: ");
		edadActual = teclado.nextInt();
		System.out.print("Introduzca año determinado: ");
		anoDeterminado = teclado.nextInt();
		//si el año determinado es mayor al actual, entonces le sumaremos a la edadActual. Si es menor, entonces le restaremos.
		if (anoActual < anoDeterminado) {
			System.out.print(
					"Su edad en el año " + anoDeterminado + " será " + (edadActual + (anoDeterminado - anoActual)));
		} else {

			System.out.print(
					"Su edad en el año " + anoDeterminado + " fue " + (edadActual - (anoActual - anoDeterminado)));
		}

	}

}
