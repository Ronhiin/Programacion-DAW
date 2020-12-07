package EstructuraFor;

import java.util.Scanner;

public class Ej3Estructurafor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen
		 * notas mayores o iguales a 7 y cuántos menores.
		 * 
		 * Para resolver este problema se requieren tres contadores: aprobados (Cuenta
		 * la cantidad de alumnos aprobados) reprobados (Cuenta la cantidad de
		 * reprobados) f (es el contador del for)
		 */
		//iniciamos Scanner
	    Scanner teclado=new Scanner(System.in);
	    //Creamos variables 
        int aprobados,reprobados,f,nota;
        //Iniciamos variables a 0
        aprobados=0;
        reprobados=0;
        //bucle que se repetira 10 veces
        for(f=1;f<=10;f++) {
        	//Se ingresara las notas cada vez que se repita el bucle
            System.out.print("Ingrese la nota:");
            nota=teclado.nextInt();
            //si la nota es igual o mayor a 7, sumamos 1 a aprobados
            if (nota>=7) {
                aprobados=aprobados+1;
                //si no, sumamos 1 a reprobados
            } else {
            	reprobados=reprobados+1;
            }
        }
        //mostramos los resultados.
        System.out.print("Cantidad de aprobados:");
        System.out.println(aprobados);
        System.out.print("Cantidad de reprobados:");
        System.out.print(reprobados);
		
	}

}
