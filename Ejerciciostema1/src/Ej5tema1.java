import java.util.Scanner;

public class Ej5tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int pagaBase, pagaExtra, anos;
		String categoria;
		
		System.out.print("Introduzca sueldo base: ");
		pagaBase = teclado.nextInt();
		pagaExtra = pagaBase;
		System.out.print("Introduzca categoría: ");
		categoria = teclado.next();
		System.out.print("Introduzca años en la empresa: ");
		anos = teclado.nextInt();
		if (categoria.equals("Senior")) {
			pagaExtra = pagaExtra + 100;
		}
		
		if (pagaBase> 1000 || categoria.equals("Jefe") || anos > 5) {
			pagaExtra = pagaExtra + 500;
		}
		
		System.out.print("La paga extra es de: " +pagaExtra + " Euros");
	}

}
