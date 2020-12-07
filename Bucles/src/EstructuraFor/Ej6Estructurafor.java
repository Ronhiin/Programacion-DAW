package EstructuraFor;

import java.util.Scanner;

public class Ej6Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Confeccionar un programa que lea n pares de datos, cada par de datos
		 * corresponde a la medida de la base y la altura de un triángulo. El programa
		 * deberá informar: 
		 * a) De cada triángulo la medida de su base, su altura y su
		 * superficie. 
		 * b) La cantidad de triángulos cuya superficie es mayor a 12.
		 * 
		 */
		//iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos variables
		int pares,dato,base,altura,cantidad,f;
		cantidad=0;
		//Pedimos al usuario el numero de triangulos
		System.out.print("Ingrese numero de triangulos :");
		pares = teclado.nextInt();
		//bucle que se repetira n veces, siendo n el numero de triangulos que indique el usuario
		for (f=1; f<=pares;f++) {
			//le pedimos al usuario la base y altura del triangulo. Se repetira por cada triangulo a ingresar
				System.out.print("triangulo "+f+". Ingrese base: ");
				base = teclado.nextInt();
				System.out.print("triangulo "+f+". Ingrese altura: ");
				altura = teclado.nextInt();
				//Calculamos la superficie y la mostramos
				System.out.println("La superficie del triangulo " +f+" es : "+((base*altura)/2));
				//si la superficie es mayor a 12, sumamos 1 a cantidad
				if ((base*altura)/2 > 12) {
					cantidad++;
				}
		}
		//Mostramos los triangulos con superficie mayor a 12. 
		System.out.println("La cantidad de triangulos con superficie mayor a 12 : " + cantidad);	
		
	}

}
