package Estructuradowhile;

import java.util.Scanner;

public class Ej5Estructuradowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio2. En un banco se procesan datos de las cuentas corrientes de sus
		 * clientes. De cada cuenta corriente se conoce: número de cuenta y saldo
		 * actual. El ingreso de datos debe finalizar al ingresar un valor negativo en
		 * el número de cuenta. Se pide confeccionar un programa que lea los datos de
		 * las cuentas corrientes e informe: a)De cada cuenta: número de cuenta y estado
		 * de la cuenta según su saldo, sabiendo que: Estado de la cuenta 'Acreedor' si
		 * el saldo es >0. 'Deudor' si el saldo es <0. 'Nulo' si el saldo es =0. b) La
		 * suma total de los saldos acreedores
		 * 
		 */
		// iniciamos Scanner
		Scanner teclado = new Scanner(System.in);
		// creamos las variables necesarias
		int ncuenta;
		float saldo, suma;
		// iniciamos suma
		suma = 0;
		//Mientras el numero de cuenta sea positivo,
		do {
			//le pedimos que ingrese el numero de cuenta
			System.out.print("Ingresa número de cuenta: ");
			ncuenta = teclado.nextInt();
			//si la cuenta es positiva
			if (ncuenta >= 0) {
				//le decimos que ingrese el saldo
				System.out.print("Ingresa saldo: ");
				saldo = teclado.nextFloat();
				//si el saldo es positivo, Mostramos acreedor y acumulamos su saldo
				if (saldo > 0) {
					System.out.println("Acreedor.");
					suma = suma + saldo;
					//si su saldo es negativo, es deudor.
				} else if (saldo < 0) {
					System.out.println("Deudor.");
					//si no es ninguno anterior, entonces es Nulo
				} else {
					System.out.println("Nulo.");
				}

			}
		} while (ncuenta >= 0);
		//Mostramos el total del saldo de los acreedores
		System.out.print("Total saldo Acreedor: ");
		System.out.print(suma);
	}

}
