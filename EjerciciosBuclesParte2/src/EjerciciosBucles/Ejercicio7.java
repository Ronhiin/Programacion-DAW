package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 7. Crear un programa que tenga un menú para tirar dados y que permita elegir
		 * realizar una tirada de dados de 6, 20 y 100 caras. El menú tendrá una opción
		 * para salir, mientras no se seleccione se seguirán realizando tiradas. Cuando
		 * se seleccione un dado, por ejemplo, el de 20 caras, se mostrará un mensaje
		 * “Resultado de la Tirada: 17”, se esperará a que se pulse una tecla y volverá
		 * a mostrarse el menú. En caso de sacar una tirada excepcional 6,>15,>89, se
		 * mostrará el mensaje “tirada excepcional”. Si se hace una mala tirada
		 * <3,<5,<10, se mostrará el mensaje “Pifia Terrible!!”
		 * 
		 * 
		 */
		// Utilizo la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		// Creamos las variables necesarias
		int numDados, resultDado;
		// Bucle que se repite hasta que el ususario escriba 0
		do {
			// Permitimos que el usuario elija el dado
			System.out.print("Elija dado para realizar la tirada (escribe : 6 o 20 o 100 || 0 para salir): ");
			numDados = teclado.nextInt();
			// Mientras el usuario no meta un numero valido, se le va a preguntar hasta que
			// meta un valor valido.
			while (numDados != 6 && numDados != 20 && numDados != 100 && numDados != 0) {
				System.out.print("Por favor, elija un dado válido para realizar la tirada (escribe : 6 o 20 o 100): ");
				numDados = teclado.nextInt();
			}
			// Condicional dependiendo del dado que elija
			switch (numDados) {
			case 6:
				// se tira el dado, que es un numero aleatorio entre 1 y 6.
				resultDado = (int) Math.floor(Math.random() * 6 + 1);
				// Mostramos resultado
				System.out.println("Resultado de la tirada: " + resultDado);
				// Ademas si es 6 o menor que 3, se mostrará otro mensaje.
				if (resultDado == 6) {
					System.out.println("¡Tirada Excepcional!");
				}
				if (resultDado < 3) {
					System.out.println("¡Pifia terrible!");
				}
				break;
			// Lo mismo para 20 y 100.
			case 20:
				resultDado = (int) Math.floor(Math.random() * 20 + 1);
				System.out.println("Resultado de la tirada: " + resultDado);
				if (resultDado > 15) {
					System.out.println("¡Tirada Excepcional!");
				}
				if (resultDado < 5) {
					System.out.println("¡Pifia terrible!");
				}
				break;
			case 100:
				resultDado = (int) Math.floor(Math.random() * 100 + 1);
				System.out.println("Resultado de la tirada: " + resultDado);
				if (resultDado > 89) {
					System.out.println("¡Tirada Excepcional!");
				}
				if (resultDado < 10) {
					System.out.println("¡Pifia terrible!");
				}
				break;
			}
			// Bucle que espera el enter para seguir avanzando
			String enter = teclado.nextLine();
			while (enter != null) {
				if (teclado.hasNextLine())
					enter = teclado.nextLine();
				break;

			}
		} while (numDados != 0);

	}

}
