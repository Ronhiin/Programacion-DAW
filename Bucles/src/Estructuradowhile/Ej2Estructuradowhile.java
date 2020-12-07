package Estructuradowhile;

import java.util.Scanner;

public class Ej2Estructuradowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que solicite la carga de números por teclado, obtener su
		 * promedio. Finalizar la carga de valores cuando se cargue el valor 0.
		 * 
		 * Cuando la finalización depende de algún valor ingresado por el operador
		 * conviene el empleo de la estructura do while, por lo menos se cargará un
		 * valor (en el caso más extremo se carga 0, que indica la finalización de la
		 * carga de valores)
		 */
		//iniciamos scanner
        Scanner teclado=new Scanner(System.in);
        //creamos variables e iniciamos algunas
        int suma,cant,valor,promedio;
        suma=0;
        cant=0;
        //Bucle que hara primero lo de arriba y mientras valor sea distinto a 0, seguira repitiendose.
        do {
        	//le pedimos al usuario que ingrese un valor
            System.out.print("Ingrese un valor (0 para finalizar):");
            valor=teclado.nextInt();
            //si valor es diferente a 0, acumula el valor y añade 1 a cant.
            if (valor!=0) {
                suma=suma+valor;
                cant++;
            }
        } while (valor!=0);
        //si cant es diferente a 0, hacemos el promedio de los valores y los mostramos.
        if (cant!=0) {
            promedio=suma/cant;
            System.out.print("El promedio de los valores ingresados es:");
            System.out.print(promedio);
        } else {
            System.out.print("No se ingresaron valores.");
        }
		
	}

}
