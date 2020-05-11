package ej12;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class E12_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		Scanner entrada = new Scanner(System.in);
		int numero = 0, menor = 0, mayor = 0, suma = 0;
		ArrayList<Integer> ingresados = new ArrayList();

		System.out.println("Ingrese números, con 0 (cero) finaliza:");
		do {
			try { // compruebo que lo ingresado es un número
				numero = entrada.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("ERROR: Debió ingresar un número");
				System.exit(1);
			}

			ingresados.add(numero);
			suma += numero;

			if (menor == 0 || numero < menor && numero != 0) { // defino el menor
				menor = numero;
			}

			if (mayor == 0 || numero > mayor) { // defino el mayor
				mayor = numero;
			}

		} while (numero != 0);

		if (ingresados.size() == 1) { // si el largo del arraylist es igual a 1 quiere decir que el único valor
										// ingresado es 0 (cero)
			System.out.println("No se ingresaron valores");
			System.exit(1);
		}

		System.out.printf("Se ingresó/ingresaron %d número/s \r\n", ingresados.size() - 1);
		System.out.printf("El menor fue: %d\r\n", menor);
		System.out.printf("El mayor fue: %d\r\n", mayor);
		System.out.printf("La suma de lo ingresado da como resultado: %d\r\n", suma);
		System.out.printf("El promedio de los números ingresados es: %d\r\n", suma / (ingresados.size() - 1));

	}

	/*
	 * 
	 * LETRA DEL EJERCICIO
	 * 
	 * Hacer un programa que permita al usuario ingresar tantos números como desee
	 * hasta que ingrese 0 (cero)
	 * 
	 * El programa debe:
	 * 
	 * indicar la cantidad de números ingresados Mostrar el menor y el mayor de los
	 * números ingresados Mostrar la suma y el promedio de los números ingresados.
	 * Tener en cuenta que el primer número ingresado por el usuario puede ser el
	 * cero.
	 * 
	 */
}
