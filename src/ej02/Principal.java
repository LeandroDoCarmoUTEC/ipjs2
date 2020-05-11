package ej02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Crear un  programa que publique en consola la frase "nombre dice: Hola, mundo"
		// donde nombre es el nombre del estudiante ingresado desde la consola.
				
		System.out.println("Ingrese su nombre: ");
		
		Scanner entrada = new Scanner(System.in);
		String nombre = entrada.nextLine();
		entrada.close();
		
		System.out.printf("%s dice: Hola Mundo!", nombre);
	}

}