import java.util.Scanner;

public class Ej6tema1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos las variables necesarias
		int figura, area, perimetro, lado, lado2;
		// Le damos a elegir la figura al usuario
		System.out.println("Elige entre estas figuras:");
		System.out.println("1. Rectángulo");
		System.out.println("2. Triángulo");
		System.out.println("3. Cuadrado");
		System.out.println("Introduce el numero del elegido:");
		figura = teclado.nextInt();
		// Condicional Switch, ya que solo hay 3 opciones posibles.
		switch (figura) {
		// si es Rectangulo
		case 1:
			// introducimos 2 lados
			System.out.println("Introduce lado:");
			lado = teclado.nextInt();
			System.out.println("Introduce el otro lado:");
			lado2 = teclado.nextInt();
			// calculamos su area y perimetro
			area = lado * lado2;
			perimetro = 2 * lado + 2 * lado2;
			System.out.println("Su area es " + area + " y su perimetro es " + perimetro);
			break;
		// si es triangulo rectangulo
		case 2:
			// introducimos base y altura
			System.out.println("Introduce base:");
			lado = teclado.nextInt();
			System.out.println("Introduce altura:");
			lado2 = teclado.nextInt();
			// calculamos area y perimetro
			area = (lado * lado2) / 2;
			perimetro = (int) (lado2 + lado + Math.sqrt(lado + lado2));
			System.out.println("Su area es " + area + " y su perimetro es " + perimetro);
			break;
		// si es cuadrado
		case 3:
			// pedimos 1 lado
			System.out.println("Introduce base:");
			lado = teclado.nextInt();
			// calculamos perimetro y area
			perimetro = lado * 4;
			area = lado * lado;
			System.out.println("Su area es " + area + " y su perimetro es " + perimetro);
			break;
		}
	}
}
