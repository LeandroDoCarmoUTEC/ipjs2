package ej05;

import java.util.Scanner;
import static java.lang.Math.PI;

public class Principal {

	public static void main(String[] args) {
		// Utilizando los operadores de Java de incremento y decremento, pedir al usuario un número entero y publicar el anterior y el siguiente
				
		System.out.println("Ingrese un número: ");
		
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
				
		System.out.printf("Anterior: %d \r\n", --numero);
		numero++;
		System.out.printf("Siguiente: %d", ++numero);
		
		entrada.close();
	}

}