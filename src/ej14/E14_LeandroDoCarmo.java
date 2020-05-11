package ej14;

import java.util.Scanner;

public class E14_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		Scanner entrada = new Scanner(System.in);
		String palabra;
		int ini = 0, fin;
		boolean palindromo = true;

		System.out.println("Ingrese una palabra para saber si es pal�ndromo: ");
		palabra = entrada.next();

		if (palabra.isEmpty()) {
			System.out.println("ERROR: No se ingres� palabra");
			System.exit(1);
		}

		fin = palabra.length() - 1;

		while ((ini < fin)) {
			if (palabra.charAt(ini) == palabra.charAt(fin)) {
				ini++;
				fin--;
			} else {
				palindromo = false;
				break;
			}
		}

		if (palindromo) {
			System.out.printf("%s es pal�ndromo", palabra);
		} else {
			System.out.printf("%s NO es pal�ndromo", palabra);
		}
	}

	/*
	 * LETRA DEL EJERCICIO
	 * 
	 * Hacer un programa que pida una palabra al usuario, la cargue letra por letra
	 * en un array y averig�e si es un pal�ndromo (si se lee igual en ambos
	 * sentidos).
	 * 
	 * El programa debe publicar en consola "palabra es un pal�ndromo" �
	 * "palabra no es un pal�ndromo" donde palabra, es la cadena ingresada por el
	 * usuario
	 */
}
