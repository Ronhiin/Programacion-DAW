import java.util.Scanner;

public class Ej7tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos la variable
		String contrasena;
		// Le decimos al usuario que meta la contraseña
		System.out.println(
				"Restablezca su contraseña. (Debe empezar por un número, estar entre 6 y 10 caracteres y contener un guion.) : ");
		contrasena = teclado.next();
		// bucle while con varias condiciones que deben de ser falsas para que todo sea
		// correcto.
		while ((contrasena.length() < 6 || contrasena.length() > 10) || !(Character.isDigit(contrasena.charAt(0)))
				|| !(contrasena.contains("-"))) {
			System.out.println("Restablezca su contraseña. (ERROR. Vuelva a escribirla.): ");
			contrasena = teclado.next();

		}

		System.out.println("Contraseña reestablecida con éxito. ");
	}

}
