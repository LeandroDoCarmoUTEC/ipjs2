package ej07;

import java.util.Scanner;
import static java.lang.Math.*;

public class E7_LeandroDoCarmo {

	public static void main(String[] args) {
		/*
		Utilizando los operadores l�gicos y relacionales crear un programa que decida el precio de las entradas para un evento art�stico en El Club seg�n la siguiente pauta:
		Las entradas cuestan 200$. Las personas afiliadas a El Club menores de 15 a�os tendr�n 15% de descuento, si tienen su cuota al d�a.
		Las personas mayores de 65 a�os, afiliadas o no, tienen un descuento del 18%
		Las personas entre 15 y 30 a�os afiliadas al club que tengan un atraso en su cuota tendr�n una recarga del 10 % en el valor de la entrada.
		El programa debe pedir al usuario la edad  de la persona, afiliaci�n al club (si/no) y atraso de la cuota (cuota al d�a corresponde atraso=0) y publicar en la consola el precio de la entrada que le corresponde
		*/

		byte edad;
		String afiliacion;
		int atraso = 0;
		double ticket = 200;
		
		System.out.println("Ingrese edad: ");
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextByte();
		
		System.out.println("�Es afiliado?: ");
		entrada = new Scanner(System.in);
		afiliacion = entrada.nextLine();
		
		System.out.println("D�as de atraso en cuota: ");
		entrada = new Scanner(System.in);
		atraso = entrada.nextInt();
				
		if (afiliacion.contentEquals("si") && edad < 15) {
			System.out.printf("Total a pagar: %.2f", ticket - ticket * 0.15);
		}else if(edad > 65){
			System.out.printf("Total a pagar: %.2f", ticket - ticket * 0.18);
		}else if(edad > 14 && edad < 31 && atraso > 0 && afiliacion.equals("si")) {
			System.out.printf("Total a pagar: %.2f", ticket * 1.1);
		}else {
			System.out.printf("Total a pagar: %.2f", ticket);
		}
		
		
		
		entrada.close();
	}

}