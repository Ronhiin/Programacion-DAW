import java.util.Scanner;

public class Ej3Programacionestructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos las variables que vamos a utilizar
		int num1, num2, num3, num4, suma, producto;
		//Le pedimos al usuario que ingrese 4 numeros
		System.out.print("Ingrese 4 numeros(presionando enter):");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		num4 = teclado.nextInt();
		//Realizamos las operaciones
		suma = num1 + num2;
		producto = num3 * num4;
		//Mostramos por pantalla los resultados. Con println, conseguimos un salto de linea.
		System.out.println("La suma de " + num1 + " y " +num2+" es igual a: " +suma);
		System.out.print("La multiplicacion de " + num3+ " y " +num4+" es igual a: " +producto);
		
		
	}

}
