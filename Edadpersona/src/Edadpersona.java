import java.util.Scanner;

public class Edadpersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LLamamos a la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Iniciamos las variables necesarias
		int anoActual, edadActual, anoDeterminado;
		//preguntamos al usuario, el a�o actual, su edad actual y un a�o determinado.
		System.out.print("Introduzca a�o actual: ");
		anoActual = teclado.nextInt();
		System.out.print("Introduzca su edad: ");
		edadActual = teclado.nextInt();
		System.out.print("Introduzca a�o determinado: ");
		anoDeterminado = teclado.nextInt();
		//si el a�o determinado es mayor al actual, entonces le sumaremos a la edadActual. Si es menor, entonces le restaremos.
		if (anoActual < anoDeterminado) {
			System.out.print(
					"Su edad en el a�o " + anoDeterminado + " ser� " + (edadActual + (anoDeterminado - anoActual)));
		} else {

			System.out.print(
					"Su edad en el a�o " + anoDeterminado + " fue " + (edadActual - (anoActual - anoDeterminado)));
		}

	}

}
