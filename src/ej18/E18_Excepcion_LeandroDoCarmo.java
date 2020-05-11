package ej18;

import java.util.Scanner;

public class E18_Excepcion_LeandroDoCarmo {

	public static void main(String[] args) throws Exception {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO

		int numerador, denominador;
		double cociente;

		numerador = solicitarNumerador();

		try {
			denominador = solicitarDenominador();
			cociente = numerador / denominador;
			System.out.println("El cociente es: " + cociente);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static int solicitarNumerador() {
		System.out.println("Ingrese numerador: ");
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}

	public static int solicitarDenominador() throws Exception {
		System.out.println("Ingrese denominador: ");
		Scanner entrada = new Scanner(System.in);
		int denom = entrada.nextInt();
		if (denom == 0) {
			throw new Exception("ERROR: El denominador debe ser distinto de 0 (cero)");
		} else {
			return denom;
		}
	}

	/*
	 * LETRA DEL EJERCICIO
	 * 
	 * Crear un programa que permita al usuario ingresar 2 n�meros enteros llamados
	 * numerador y denominador, y que calcule la divisi�n numerador / denominador
	 * que se almacenar� en la variable cociente.
	 * 
	 * El usuario puede ingresar el valor cero para el denominador, lo que producir�
	 * un error en tiempo de ejecuci�n. (el estudiante deber�a comprobar que se
	 * produce este erro ejecutando este c�digo en el IDE antes de continuar)
	 * 
	 * El programa debe prevenir este error implementando una excepci�n.
	 */
}
