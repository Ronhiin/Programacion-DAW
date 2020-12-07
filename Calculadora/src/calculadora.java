import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// Usamos la herramienta scanner para pedirle al usuario datos que debera
		// escribirnos
		Scanner teclado = new Scanner(System.in);
		// iniciamos todas las variablesque usaremos donde noperandos es el numero de
		// operandos que va a meter el usuario y noperacion es el numero de operacion
		// que va a hacer.

		int op1, op2, op3, op4, noperandos, noperacion, maximo, minimo;
		// inicializamos las variables
		op1 = 0;
		op2 = 0;
		op3 = 0;
		op4 = 0;
		// Le preguntamos al usuario cuantos operandos necesita.
		System.out.print("¿Cuantos operandos necesita? (2,3 o 4): ");
		// Los mete, utilizando la herramienta scanner
		noperandos = teclado.nextInt();
		// Bucle while para que, en caso de meter un numero de operandos invalidos,
		// vuelva a pedirle un numero valido. Valido es 2 o 4.
		while (noperandos != 2 && noperandos != 4) {
			System.out.print("Numero de operandos incorrecto." + "\n Por favor, escriba 2, o 4.");
			noperandos = teclado.nextInt();
		}
		// Dependiendo de cuantos operandos haya elegido, le pedimos 2 o 4 operandos.
		// Usamos Switch, ya que solo puede ver 2 opciones, o 2 o 4.
		switch (noperandos) {
		case 2:
			System.out.print("Introduce operando 1: ");
			op1 = teclado.nextInt();
			System.out.print("Introduce operando 2: ");
			op2 = teclado.nextInt();
			break;
		case 4:
			System.out.print("Introduce operando 1: ");
			op1 = teclado.nextInt();
			System.out.print("Introduce operando 2: ");
			op2 = teclado.nextInt();
			System.out.print("Introduce operando 3: ");
			op3 = teclado.nextInt();
			System.out.print("Introduce operando 4: ");
			op4 = teclado.nextInt();
			break;

		}
		// Preguntamos al usuario que operacion quiere hacer, le damos la opcion de
		// poner el numero de la opcion elegida.
		System.out.print("¿Qué operacion desea hacer? (Escriba la opcion numérica): " + "\n n1) Sumar" + "\n n2) Restar"
				+ "\n n3) Dividir" + "\n n4) Multiplicar" + "\n n5) Media" + "\n n6) máximo" + "\n n7) mínimo");
		noperacion = teclado.nextInt();
		// Mismo while que el de antes, esta vez para comprobar que se mete una opcion
		// de la lista. En caso de meter otra cosa, le volveremos a pedir una opcion
		// correcta.
		while (noperacion != 1 && noperacion != 2 && noperacion != 3 && noperacion != 4 && noperacion != 5
				&& noperacion != 6 && noperacion != 7) {
			System.out.println("numero de operacion incorrecto." + "\n Por favor, elija bien.");
			System.out.print("¿Qué operacion desea hacer? (Escriba la opcion numérica): " + "\n n1) Sumar"
					+ "\n n2) Restar" + "\n n3) Dividir" + "\n n4) Multiplicar" + "\n n5) Media" + "\n n6) máximo"
					+ "\n n7) mínimo");
			noperacion = teclado.nextInt();
		}
		// Si la operacion es suma, resta, dividir o multiplicar y los operandos son 4,
		// marcaremos ERROR.
		// Si la operacion es media, maximo o minimo y los operandos son 2, marcaremos
		// error.
		if ((noperacion <= 4 && noperandos == 4) || (noperacion >= 5 && noperandos == 2)) {

			System.out.print("ERROR...Por favor, introduce un número de operandos valido. "
					+ "\n Para Sumar, restar, multiplicar o dividir, solo puedes usar 2 operandos."
					+ "\n Para la media, máximo o minimo, tienes que usar 4 operandos." + "\n Cerrando programa...");
		} else {
			// Si pasa la validacion anterior, tenemos un switch que iniciará la
			// correspondiente operacion, segun la eleccion del usuario.
			switch (noperacion) {
			case 1:
				// suma
				System.out.print("La suma de " + op1 + "+" + op2 + " es : " + (op1 + op2));
				break;
			case 2:
				// resta
				System.out.print("La resta de " + op1 + "-" + op2 + " es : " + (op1 - op2));
				break;
			case 3:
				// division
				System.out.print("La division de " + op1 + "/" + op2 + " es : " + (op1 / op2));
				break;
			case 4:
				// multiplicacion
				System.out.print("La multiplicacion de " + op1 + "*" + op2 + " es : " + (op1 * op2));
				break;
			case 5:
				// media
				System.out.print("La media de " + op1 + "," + op2 + "," + op3 + ", " + op4 + " es : "
						+ ((op1 + op2 + op3 + op4) / 4));
				break;
			case 6:
				// Maximo
				if (op1 >= op2 && op1 >= op3 && op1 >= op4) {
					maximo = op1;
				} else if (op2 >= op1 && op2 >= op3 && op2 >= op4) {
					maximo = op2;
				} else if (op3 >= op1 && op3 >= op2 && op3 >= op4) {
					maximo = op3;
				} else {
					maximo = op4;
				}

				System.out.print("El máximo de " + op1 + "," + op2 + "," + op3 + ", " + op4 + " es : " + maximo);
				break;
			case 7:
				// minimo
				if (op1 <= op2 && op1 <= op3 && op1 <= op4) {
					minimo = op1;
				} else if (op2 <= op1 && op2 <= op3 && op2 <= op4) {
					minimo = op2;
				} else if (op3 <= op1 && op3 <= op2 && op3 <= op4) {
					minimo = op3;
				} else {
					minimo = op4;
				}
				System.out.print("El máximo de " + op1 + "," + op2 + "," + op3 + ", " + op4 + " es : " + minimo);
				break;

			}
		}
	}
}
