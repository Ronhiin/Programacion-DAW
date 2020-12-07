package EjerciciosBucles;

import java.util.Scanner;

public class ejercicio1v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Solicitar al usuario que ingrese números enteros positivos y, por cada
		 * uno, imprimir la suma de los dígitos que lo componen. (Ej 345 = 300 + 40 + 5)
		 * La condición de corte es que se ingrese el número -1. Al finalizar, mostrar
		 * cuántos de los números ingresados por el usuario fueron números pares.
		 * 
		 */
		//Herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos las variables necesarias
		int numero, intAux,intSuma;
		String aux,suma;
		//Bucle que se repite hasta que el usuario marque -1
		do {
			//Iniciamos variables
			suma = "";
			intAux=1;
			//le pedimos al usuario 1 numero
			System.out.print("Introduzca numero: ");
			numero = teclado.nextInt();
			//Si el numero es diferente a -1
			if (numero != -1) {
				//pasamos el numero a String
				aux = String.valueOf(numero);
				//Bucle que se repite n veces, siendo n la longitud del numero
				for (int j=0;j<aux.length()-1;j++) {
					//int aux, será igual al 10 elevado a la longitud del numero.
					intAux= intAux*10;
				}
				//Bucle que se repite n veces, siendo n la longitud del numero
				for (int x = 0; x <= aux.length()-1; x++) {
					//Condicional que va cogiendo cada caracter del numero y lo va multiplicando por intAux
					if (x==0) {
						intSuma = Integer.parseInt(Character.toString(aux.charAt(x)))*intAux;
						suma = String.valueOf(intSuma);
					}else {
						intSuma = Integer.parseInt(Character.toString(aux.charAt(x)))*intAux;
						suma = suma + " + "+ String.valueOf(intSuma);
						
					}
					//dividimos entre 10 intAux al acabar cada repeticion.
					intAux=intAux/10;
				}
				//Mostramos resultados
				System.out.println(numero+ " = "+ suma);
			}

		} while (numero != -1);
	}

}
