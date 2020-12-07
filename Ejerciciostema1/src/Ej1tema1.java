import java.util.Scanner;

public class Ej1tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		//creamos las variables necesarias. He creado las variables resto1 y resto 2 para que cojan el resto de las divisiones por 5 y por 7.
		int num1,resto1,resto2;
		//pedimos al usuario que inserte un numero por pantalla.
		System.out.print("Inserte un numero:");
		num1 = teclado.nextInt();
		//Creamos la condicion de que si el numero es mayor a uno y menor a 100.
		if(num1>= 1 && num1<=100) {
			System.out.println("El numero se encuentra entre 1 y 100");
		}else {
			System.out.println("El numero NO se encuentra entre 1 y 100");
		}
		//resto de dividir por 5 o por 7
		resto1=num1%5;
		resto2=num1%7;
		//si el resto es igual a 0, entonces es divisible.
		if (resto1 == 0) {
			System.out.println("El numero es divisible por 5");
		}else {
			System.out.println("El numero NO es divisible por 5");
		}
		if (resto2 == 0) {
			System.out.println("El numero es divisible por 7");
		}else {
			System.out.println("El numero NO es divisible por 7");
		}
		
	}

}
