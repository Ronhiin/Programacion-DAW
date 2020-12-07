package EstructuraWhile;

public class Ej9Estructurawhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 -
		 * 16 - 24, etc.
		 */
		// Creamos la variable x
		int x;
		// iniciamos la variable x
		x = 1;
		// Bucle que se repetira 500 veces
		while (x <= 500) {
			// mostramos la tabla del 8, es decir, x se va incrementando y multiplicando por
			// 8 cada vez.
			System.out.print(x * 8);
			// si x vale 500, ya no se pondra el guion.
			if (x != 500) {
				System.out.print(" - ");
			}
			// incrementamos la x
			x++;
		}
	}

}
