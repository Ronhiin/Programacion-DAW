package EjerciciosBucles;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5. Teniendo en cuenta que el siguiente código:
		 * 
		 * char caracter=’a’; caracter++; System.out.println(caracter);
		 * 
		 * mostraría b por pantalla, realizar un programa que saque la siguiente
		 * secuencia de caracteres:
		 * 
		 * ZYWXVUTSRQPONMLKJIHGFEDCBA YWXVUTSRQPONMLKJIHGFEDCBA WXVUTSRQPONMLKJIHGFEDCBA
		 * XVUTSRQPONMLKJIHGFEDCBA VUTSRQPONMLKJIHGFEDCBA UTSRQPONMLKJIHGFEDCBA
		 * TSRQPONMLKJIHGFEDCBA SRQPONMLKJIHGFEDCBA RQPONMLKJIHGFEDCBA QPONMLKJIHGFEDCBA
		 * PONMLKJIHGFEDCBA ONMLKJIHGFEDCBA NMLKJIHGFEDCBA MLKJIHGFEDCBA LKJIHGFEDCBA
		 * KJIHGFEDCBA JIHGFEDCBA IHGFEDCBA HGFEDCBA GFEDCBA FEDCBA EDCBA DCBA CBA BA A
		 * 
		 */
		// Creamos las variables necesarias
		char caracter = '[';
		int j, k;
		// Inicializamos las variables
		j = 26;
		// K nos ayudará a ir cambiando el caracter en cada repeticion
		k = 0;
		// Bucle que se repite 26 veces
		while (j > 0) {
			// sumamos 1 a K
			k++;
			// Bucle que se va repitiendo cada vez menos, donde inicialmente vale 26 como j,
			// pero luego valdrá 1 menos.
			for (int x = j; x > 0; x--) {
				// Bajamos el caracter
				caracter--;
				// Lo mostramos por pantalla
				System.out.print(caracter);
			}
			// Reiniciamos el caracter pero esta vez le restamos k, para que vaya de la Z a
			// la Y, de la Y a la X... etc
			caracter = (char) ('[' - k);
			// Salto de linea
			System.out.println("");
			// Decrementamos j para que el bucle tenga final
			j--;

		}
	}

}
