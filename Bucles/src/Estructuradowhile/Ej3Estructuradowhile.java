package Estructuradowhile;

import java.util.Scanner;

public class Ej3Estructuradowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas.
		 * El proceso termina cuando ingresamos el valor 0. Se debe informar: a) Cuántas
		 * piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.?
		 * y cuántas con menos de 9.8 Kg.? b) La cantidad total de piezas procesadas.
		 */
		//iniciamos Scanner
        Scanner teclado=new Scanner(System.in);
        //creamos variables e iniciamos algunas
        int cant1,cant2,cant3,suma;
        float peso;
        cant1=0;
        cant2=0;
        cant3=0;
        //Haz esto mientras peso sea diferente a 0
        do {
        	//pedimos al usuario que ingrese el peso de la pieza
            System.out.print("Ingrese el peso de la pieza (0 pera finalizar):");
            peso=teclado.nextFloat();
            //condicional para saber que tipo de pieza segun su peso es. Suma 1 a su tipo.
            if (peso>10.2) {
                cant1++;
            } else {
                if (peso>=9.8) {
                    cant2++;
                } else {
                    if (peso>0) {
                        cant3++;
                    }
                }
            }
        } while(peso!=0);
        //suma las cantidades segun sus tipos de peso
        suma=cant1+cant2+cant3;
       // Muestra resultados.
        System.out.print("Piezas aptas:");
        System.out.println(cant2);
        System.out.print("Piezas con un peso superior a 10.2:");
        System.out.println(cant1);
        System.out.print("Piezas con un peso inferior a 9.8:");
        System.out.println(cant3);
        System.out.print("Cantidad total: ");
        System.out.println(suma);

	}

}
