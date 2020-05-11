package ej10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E10_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		ArrayList<String> destinos = new ArrayList();
		int cantidad = 0;
		int seleccion = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese cantidad de pasajeros: ");

		cantidad = entrada.nextInt();

		if (cantidad < 1) {
			System.out.println("Ingrese un número mayor a 0 (cero)");
			System.exit(1);
		}

		if (cantidad < 11) {
			System.out.printf("El destino de los %d será Punta del Este", cantidad);
			System.exit(1);
		} else if (cantidad > 10 && cantidad < 21) {
			destinos.add("Punta del este");
			destinos.add("Piriápolis");
		} else if (cantidad > 20 && cantidad < 41) {
			destinos.add("Punta del este");
			destinos.add("Piriápolis");
			destinos.add("Colonia");
		} else if (cantidad > 40 && cantidad < 61) {
			destinos.add("Punta del este");
			destinos.add("Piriápolis");
			destinos.add("Colonia");
			destinos.add("Montevideo");
		} else {
			destinos.clear();
			System.out.println("AVISO: Los viajes para esta cantidad de pasajeros salen el año que viene");
			System.exit(1);
		}

		System.out.println("Seleccione posible destino:");
		for (byte i = 0; i < destinos.size(); i++) {
			System.out.printf("[%d] - %s\r\n", i, destinos.get(i));
		}
		
		try {
			seleccion = entrada.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("ERROR: Debió seleccionar una opción válida");
			System.exit(1);
		}
		
		if (seleccion < 0 || seleccion >= destinos.size()) {
			System.out.println("ERROR: Debió seleccionar una opción válida");
			System.exit(1);
		}
		System.out.printf("El destino de los %d será %s\r\n", cantidad, destinos.get(seleccion));

	}

	/*
	 * 
	 * LETRA DEL EJERCICIO
	 * 
	 * Crear un programa que permita seleccionar el destino de las vacaciones de
	 * acuerdo al número de personas en el grupo:
	 * 
	 * hasta 10 personas: Punta del este entre 11 y 20 personas: Piriápolis entre 21
	 * y 40 personas: Colonia entre 41 y 60 personas: Montevideo 61 o más: salen el
	 * año que viene
	 * 
	 * El programa debe: 1- Pedir al usuario la cantidad de personas 2- Mostrar el
	 * destino correspondiente
	 * 
	 */
}
