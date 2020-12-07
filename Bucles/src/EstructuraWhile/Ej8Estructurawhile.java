package EstructuraWhile;

public class Ej8Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
		 * etc. (No se ingresan valores por teclado)
		 */
		// creamos la variable x
		int x;
		// iniciamos la variable
		x = 1;
		// Bucle que se repetira 25 veces
		while (x <= 25) {
			// Mostramos la tabla del 11. Es decir, x que ira incrementandose, se va
			// multiplicando por 11 y se va mostrando por pantalla.
			System.out.print(x * 11);
			// Cuando x llegue a 25, ya no pondrá guion
			if (x != 25) {
				System.out.print("-");
			}
			//Incrementamos x para que el bucle tenga final.
			x++;
		}
	}

}
