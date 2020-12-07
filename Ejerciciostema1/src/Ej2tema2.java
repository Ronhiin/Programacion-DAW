import java.util.Scanner;

public class Ej2tema2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos las variables necesarias. 
		int num1, num2, num3, media;
		// pedimos al usuario que inserte 3 numeros por pantalla.
		System.out.print("Inserte tres numeros (Presionar enter):");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();
		//Condiciones para saber quien es menor, quien es mayor y el del medio.
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("El mayor es " + num1);
			if (num2 <= num3) {
				System.out.println("El menor es " + num2 + " y el del medio es " + num3);
			} else {
				System.out.println("El menor es " + num3 + " y el del medio es " + num2);
			}
		} else if (num2 >= num3) {
			System.out.println("El mayor es " + num2);
			if (num3 <= num1) {
				System.out.println("El menor es " + num3 + " y el del medio es " + num1);
			} else {
				System.out.println("El menor es " + num1 + " y el del medio es " + num3);
			}
		} else {
			System.out.println("El mayor es " + num3);
			if (num2 <= num1) {
				System.out.println("El menor es " + num2 + " y el del medio es " + num1);
			} else {
				System.out.println("El menor es " + num1 + " y el del medio es " + num2);
			}

		}
		//Calculamos la media sumando y dividiendo entre 3
		media=(num1+num2+num3)/3;
		//mostramos la media por pantalla
		System.out.print("La media es " + media);
	}

}
