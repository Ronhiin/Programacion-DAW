import java.util.Scanner;

public class Ej4Programacionestructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iniciamos la herramienta scanner y creamos las variables necesarias.
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, num4, suma, promedio;

		// Le pedimos al usuario que ingrese 4 numeros
		System.out.print("Ingrese 4 numeros(presionando enter):");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		num4 = teclado.nextInt();
		//sumamos los 4 numeros y hacemos su promedio dividiendo por 4.
		suma=num1+num2+num3+num4;
		promedio = suma/4;
		//Mostramos por pantalla el resultado.
		System.out.println("La suma de " +num1+", "+num2+", "+num3+ " y " +num4+ " es: " +suma);
		System.out.print("Y el promedio es: " +promedio);

	}

}
