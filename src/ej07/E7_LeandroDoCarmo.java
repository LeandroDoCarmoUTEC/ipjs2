package ej07;

import java.util.Scanner;
import static java.lang.Math.*;

public class E7_LeandroDoCarmo {

	public static void main(String[] args) {
		/*
		Utilizando los operadores lógicos y relacionales crear un programa que decida el precio de las entradas para un evento artístico en El Club según la siguiente pauta:
		Las entradas cuestan 200$. Las personas afiliadas a El Club menores de 15 años tendrán 15% de descuento, si tienen su cuota al día.
		Las personas mayores de 65 años, afiliadas o no, tienen un descuento del 18%
		Las personas entre 15 y 30 años afiliadas al club que tengan un atraso en su cuota tendrán una recarga del 10 % en el valor de la entrada.
		El programa debe pedir al usuario la edad  de la persona, afiliación al club (si/no) y atraso de la cuota (cuota al día corresponde atraso=0) y publicar en la consola el precio de la entrada que le corresponde
		*/

		byte edad;
		String afiliacion;
		int atraso = 0;
		double ticket = 200;
		
		System.out.println("Ingrese edad: ");
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextByte();
		
		System.out.println("¿Es afiliado?: ");
		entrada = new Scanner(System.in);
		afiliacion = entrada.nextLine();
		
		System.out.println("Días de atraso en cuota: ");
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