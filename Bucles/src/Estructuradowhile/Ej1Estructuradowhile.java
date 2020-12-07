package Estructuradowhile;

import java.util.Scanner;

public class Ej1Estructuradowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que solicite la carga de un número entre 0 y 999, y nos
		 * muestre un mensaje de cuántos dígitos tiene el mismo. Finalizar el programa
		 * cuando se cargue el valor 0.
		 */
		//Iniciamos Scanner
        Scanner teclado=new Scanner(System.in);
        //creamos variable
        int valor;
        //Bucle que se repite hasta que el valor introducido sea distinto a 0.
        //Haz esto,
        do {
        	//le pedimos al usuario que ingrese un valor entre 0 y 999
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor=teclado.nextInt();
            //Condicional que comprueba cuantos digitos tiene el numero.
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                    System.out.println("Tiene 1 dígito.");
                }
            }
            //mientras valor sea diferente a 0
        } while (valor!=0);
	}

}
