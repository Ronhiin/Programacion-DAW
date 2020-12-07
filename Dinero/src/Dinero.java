import java.util.Scanner;

public class Dinero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Utilizamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Iniciamos la variable necesaria.
		double dinero;
		//Le pedimos al usuario que nos meta el dinero a desglosar
		System.out.print("Indique el dinero a desglosar: ");
		dinero = teclado.nextDouble();
		//Pasamos a entero el resultado de las operaciones poniendo el int. Las operaciones se basan en dividir por el tamaño del billete/moneda y luego pasar el resto, para dividirlo por el siguiente billete.
		System.out.println("Los billetes de 100 serian : " + ((int) (dinero / 100)));
		System.out.println("Los billetes de 50 serian : " + ((int) (dinero % 100) / 50));
		System.out.println("Los billetes de 20 serian : " + ((int) ((dinero % 100) % 50) / 20));
		System.out.println("Los billetes de 10 serian : " + ((int) (((dinero % 100) % 50) % 20) / 10));
		System.out.println("Los billetes de 5 serian : " + ((int) ((((dinero % 100) % 50) % 20) % 10) / 5));
		System.out.println("Las monedas de 1 serian : " + ((int) (((((dinero % 100) % 50) % 20) % 10) % 5) / 1));
		System.out
				.println("Las monedas de 50cent serian : " + (((((((dinero % 100) % 50) % 20) % 10) % 5) % 1) / 0.50));

	}

}
