package Estructuradowhile;

import java.util.Scanner;

public class Ej4Estructuradowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio1. Realizar un programa que acumule (sume) valores ingresados por
		 * teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha
		 * finalizado la carga). Imprimir el valor acumulado e informar si dicho valor
		 * es cero, mayor a cero o menor a cero
		 */
		//iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos variables e iniciamos suma
		int valor, suma;
		suma = 0;
		//Bucle que sumara valores mientras no sea 9999
		do {
			//le pedimos al usuario que indique un valor
			System.out.print("Indique valor(9999 para finalizar) :");
			valor = teclado.nextInt();
			//si valor no es 9999, acumulamos los valores en suma.
			if (valor != 9999) {
				suma = suma + valor;
			}
		} while (valor != 9999);
		//mostramos resultados
		System.out.println("Valor total : "+suma);
		//condicional que comprueba si el resultado es mayor, menor o igual a 0.
		if (suma==0) {
			System.out.print("Es igual a 0");
		}else if(suma>0) {
			System.out.print("Es mayor a 0");
		}else {
			System.out.print("Es menor a 0");
		}
	}

}
