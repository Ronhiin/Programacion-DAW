import java.util.Scanner;

public class Ej8tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamamos a Scanner
		Scanner teclado = new Scanner(System.in);
		//creamos variables, utilizamos double para poder utilizar operaciones con raices
		int a,b,c;
		double x2;
		double x1;
		//pedimos a ,b y c
		System.out.println("Introduce a");
		a = teclado.nextInt();
		System.out.println("Introduce b");
		b = teclado.nextInt();
		System.out.println("Introduce c");
		c = teclado.nextInt();
		//operamos
		x1 =  ((-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/2*a);
		x2 =  ((-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/2*a);
		//mostramos el resultado
		System.out.println("El valor de X en "+a+"x^2+"+b+"x+"+c+"=0 es "+x1+ " y " +x2);
		
	}

}
