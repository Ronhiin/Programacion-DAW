import java.util.Scanner;

public class Ej5ProgramacionEstructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos Scanner y las variables a usar.
		Scanner teclado = new Scanner(System.in);
		int precio,cantidad,precioTotal;
		//Pedimos que se ingrese por pantalla el precio y cantidad del articulo
		System.out.print("Inserte precio del artículo: ");
		precio = teclado.nextInt();
		System.out.print("Inserte cantidad del artículo: ");
		cantidad = teclado.nextInt();
		//calculamos el precio total.
		precioTotal = precio*cantidad;
		// Mostramos por pantalla lo que el cliente debe abonar.
		System.out.print("El cliente debe abonar " +precioTotal+ " euros");
	}

}
