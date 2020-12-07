import java.util.Scanner;

public class Ej3tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iniciamos scanner
		boolean X,Y,Z;
		X=true;
		Y=true;
		Z=false;
		System.out.print( !X || !Y || Z && X && !Y);
		Scanner teclado = new Scanner(System.in);
		//creamos variables, string para caracteres, int para enteros.
		String cadena,subcadena;
		int num1,num2;
		//le pedimos al usuario que escriba 10 caracteres
		System.out.print("Escriba mas de 10 caracteres: ");
		cadena = teclado.next();
		//mientras que la cadena sea menor a 10, va a volver a pedir que se introduzcan la cadena
		while (cadena.length() < 10) {
			System.out.println("Incorrecto, tiene menos de 11 caracteres");
			System.out.print("Vuelva a introducir mas de 10 caracteres: ");
			cadena = teclado.next();
		}
		
		//pedimos 2 numeros
		
		System.out.println("Introduzca 2 numeros (presione enter):");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		//creamos la subcadena con el metodo substring
		subcadena = cadena.substring(num1, num2);
		//mostramos la cadena
		System.out.print(subcadena);

	}

}
