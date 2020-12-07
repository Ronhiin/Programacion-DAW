import java.util.Scanner;

public class Trabajadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Usamos la herramienta Scanner
		Scanner teclado = new Scanner(System.in);
		//Inicializamos las variables que vamos a utilizar
		int anosTrabajados, puesto, categoria, extra;
		//iniciamos la variable de la paga extra
		extra = 0;
		//pedimos los datos necesarios de los trabajadores. 
		System.out.print("Indique años trabajados :  ");
		anosTrabajados = teclado.nextInt();
		System.out.print("Indique el puesto segun estas opciones : "
				+ "\n n1) PROGRAMADOR  "
				+ "\n n2) JEFE \n");
		puesto = teclado.nextInt();
		//bucle while para validar lo que mete el usuario.
		while (puesto != 1 && puesto != 2) {
			System.out.print("Numero de opcion incorrecta." + "\n Por favor, escriba 1, o 2.");
			puesto = teclado.nextInt();
		}
		System.out.print("Indique la categoría a la que pertenece segun estas opciones: "
				+ "\n n1) Categoría A "
				+ "\n n2) Categoría B \n");
		categoria = teclado.nextInt();
		//bucle while para validar lo que mete el usuario.
		while (categoria != 1 && categoria != 2) {
			System.out.print("Numero de opcion incorrecta." + "\n Por favor, escriba 1, o 2.");
			categoria = teclado.nextInt();
		}
		//condicionales para realizar acciones dependiendo de los años que haya trabajado
		
		if (anosTrabajados <=5) {
			//Sentencia switch para las ociones de Jefe o Programador.
			switch(puesto) {
			case 1: 
				extra = 400;
				break;
			case 2: 
				extra = 600;
				break;
			}
		}else {
			switch(puesto) {
			case 1: 
				extra = 800;
				break;
			case 2: 
				extra = 1100;
				break;
			}
			
		}
		//Condicional Switch para realizar acciones dependiendo de que categoria sea.
		switch (categoria) {
		case 1: 
			extra = extra + 100;
			break;
		case 2:
			extra = extra + 200;
			break;
		}
		//mostramos por pantalla el sueldo extra ya calculado.
		System.out.print ("El sueldo extra es de : " + extra);
		
	}

}
