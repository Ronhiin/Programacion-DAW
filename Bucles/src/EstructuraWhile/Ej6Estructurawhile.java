package EstructuraWhile;

import java.util.Scanner;

public class Ej6Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.
		 * */
		//Iniciamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Creamos las variables necesarias
		int altura,x,nalturas,cantidad;
		//Le pedimos al usuario que ingrese el numero de personas de las que va a ingresar las alturas.
		System.out.print("Ingrese numero de alturas a ingresar: ");
		nalturas=teclado.nextInt();
		//inicializamos las variables
		cantidad = 0;
		x=1;
		//Bucle que se repetirá n veces dependiendo de lo que haya ingresado el usuario anteriormente, que lo hemos almacenado en nalturas 
		while(x<=nalturas) {
			//Le pedimos al usuario que ingrese la altura de las personas que ha dicho antes
			System.out.print("Ingrese altura de persona "+x+" (en cms) : ");
			altura= teclado.nextInt();
			//sumamos todas las alturas
			cantidad = cantidad + altura;
			//incrementamos x para que el bucle tenga final
			x++;
		}
		//Mostramos los resultados, donde el promedio es la suma de todas las alturas entre el numero de todas las alturas tomadas.
		System.out.print("El promedio de las alturas es : " + (cantidad/nalturas) + "cms");
	}

}
