package ej06;

import java.util.Scanner;
import static java.lang.Math.*;

public class Principal {

	public static void main(String[] args) {
		// Utilizando la clase Math para obtener las funciones necesarias, 
		// hacer un programa que pida el total de lluvias de un mes, 
		// la cantidad de d�as del mes y publique un n�mero entero (redondeando el resultado) 
		// que muestre el promedio de lluvias por d�a.
				
		System.out.println("Ingrese un cantidad de lluvia del mes en ml: ");
		
		Scanner entrada = new Scanner(System.in);
		int lluvia = entrada.nextInt();
		
		System.out.println("Ingrese cantidad de d�as del mes: ");
		
		entrada = new Scanner(System.in);
		byte dias = entrada.nextByte();
				
		System.out.printf("Promedio de lluvia por d�a: %dml", Math.round(lluvia / dias));
		
		entrada.close();
	}

}