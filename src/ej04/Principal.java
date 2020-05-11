package ej04;

import java.util.Scanner;
import static java.lang.Math.PI;

public class Principal {

	public static void main(String[] args) {
		/*
		 Realizar un programa que calcule el �rea y la circunferencia de un c�rculo.
		El usuario debe ingresar el radio del c�rculo.
		Los resultados deben publicarse en consola con 2 cifras decimales.
		Para concatenar Strings y n�meros con formato utilizamos
		System.out.printf("este es el valor de var1 expresado con 3 decimales %.3f y este es el valor 
		de var2 expresado con 2 decimales %.2f",var1,var2);
		Observar que los valores de las variables var1 y var2 se concatenan en orden posicional.
		*/
				
		System.out.println("Ingrese radio del c�rculo: ");
		
		Scanner entrada = new Scanner(System.in);
		float radio = entrada.nextFloat();
				
		System.out.printf("�rea del c�rculo: %.2f", PI * radio * radio);
		
		entrada.close();
	}

}