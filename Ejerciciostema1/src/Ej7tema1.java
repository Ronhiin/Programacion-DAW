import java.util.Scanner;

public class Ej7tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos la variable
		String contrasena;
		// Le decimos al usuario que meta la contrase�a
		System.out.println(
				"Restablezca su contrase�a. (Debe empezar por un n�mero, estar entre 6 y 10 caracteres y contener un guion.) : ");
		contrasena = teclado.next();
		// bucle while con varias condiciones que deben de ser falsas para que todo sea
		// correcto.
		while ((contrasena.length() < 6 || contrasena.length() > 10) || !(Character.isDigit(contrasena.charAt(0)))
				|| !(contrasena.contains("-"))) {
			System.out.println("Restablezca su contrase�a. (ERROR. Vuelva a escribirla.): ");
			contrasena = teclado.next();

		}

		System.out.println("Contrase�a reestablecida con �xito. ");
	}

}
