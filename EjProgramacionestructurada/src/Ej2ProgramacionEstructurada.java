import java.util.Scanner;

public class Ej2ProgramacionEstructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos las variables necesarias, que en este caso son Integers
		int perimetro, ladoCuadrado;
		//Le pedimos al usuario que nos ingrese un valor por pantalla.
		System.out.print("Ingrese el valor del lado del cuadrado:");
		//el valor que va a ingresar lo guardamos en ladoCuadrado
		ladoCuadrado = teclado.nextInt();
		//Calculamos el perímetro
		perimetro = ladoCuadrado * 4;
		//Mostramos el resultado por pantalla.
		System.out.print("El valor de su perimetro es: " + perimetro);
			
	}

}
