package ej03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Realizar un programa que pida el nombre y la edad al usuario, y muestre en la consola la siguiente frase:
		// "Hola,  nombre , el año que viene tendrás edadFutura años"
		// donde nombre es el nombre ingresado por el usuario y edadFutura es la edad que el usuario tendrá el año que viene.
		// El nombre del usuario debe mostrarse en mayúsculas
				
		System.out.println("Ingrese su nombre: ");
		
		Scanner entrada = new Scanner(System.in);
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su edad en años: ");
		
		entrada = new Scanner(System.in);
		int anios = entrada.nextInt();
		
		System.out.printf("Hola,  %s, el año que viene tendrás %d años", nombre.toUpperCase(), anios + 1);
		
		entrada.close();
	}

}