package EstructuraWhile;

public class Ej1Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que imprima en pantalla los números del 1 al 100. Sin
		 * conocer las estructuras repetitivas podemos resolver el problema empleando
		 * una estructura secuencial. Inicializamos una variable con el valor 1, luego
		 * imprimimos la variable, incrementamos nuevamente la variable y así
		 * sucesivamente.
		 */
		//creamos la variable x
		int x;
		//iniciamos la variable en 1
		x = 1;
		//creamos el bucle while que se ejecutará mientras x sea menor o igual a 100
		while (x <= 100) {
			//imprimimos el valor de x
			System.out.print(x);
			//separamos los valores con un guion
			System.out.print(" - ");
			//Sumamos 1 a x para que se vaya incrmeentando cada vez que se repita el bucle. Se puede hacer con x++;
			x = x + 1;
		}
	}

}
