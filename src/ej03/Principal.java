package ej03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Realizar un programa que pida el nombre y la edad al usuario, y muestre en la consola la siguiente frase:
		// "Hola,  nombre , el a�o que viene tendr�s edadFutura a�os"
		// donde nombre es el nombre ingresado por el usuario y edadFutura es la edad que el usuario tendr� el a�o que viene.
		// El nombre del usuario debe mostrarse en may�sculas
				
		System.out.println("Ingrese su nombre: ");
		
		Scanner entrada = new Scanner(System.in);
		String nombre = entrada.nextLine();
		
		System.out.println("Ingrese su edad en a�os: ");
		
		entrada = new Scanner(System.in);
		int anios = entrada.nextInt();
		
		System.out.printf("Hola,  %s, el a�o que viene tendr�s %d a�os", nombre.toUpperCase(), anios + 1);
		
		entrada.close();
	}

}