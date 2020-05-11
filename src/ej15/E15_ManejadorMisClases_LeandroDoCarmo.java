package ej15;

import ej15.E15_MiClase_LeandroDoCarmo;

public class E15_ManejadorMisClases_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO

		E15_MiClase_LeandroDoCarmo miClaseA = new E15_MiClase_LeandroDoCarmo();
		E15_MiClase_LeandroDoCarmo miClaseB = new E15_MiClase_LeandroDoCarmo(5, "Perro");
		E15_MiClase_LeandroDoCarmo miClaseC = new E15_MiClase_LeandroDoCarmo("Gato");

		System.out.println(miClaseA.toString());
		System.out.println(miClaseB.toString());
		System.out.println(miClaseC.toString());
	}

	/*
	 * 
	 * LETRA DEL EJERCICIO
	 * 
	 * Parte A - Definir una clase de nombre E16_MiClase_LeandroDoCarmo que tiene 2 atributos: un
	 * número y una palabra.
	 * 
	 * La clase debe tener 3 constructores:
	 * 
	 * un constructor que no asigna valores a los atributos un constructor que
	 * recibe los valores para el número y la palabra un constructor que recibe el
	 * valor de la palabra y que entonces le asigna el valor 1 al atributo número.
	 * La clase debe tener métodos get y set para todos sus atributos y un método
	 * toString que devuelva la siguiente cadena:"num = numero, cad = cadena", donde
	 * numero y cadena son los valores de los atributos.
	 * 
	 * Parte B - Definir una clase de nombre E16_ManejadorMisClases_LeandroDoCarmo con un método main,
	 * donde se deben definir 3 objetos de clase E16_MiClase_LeandroDoCarmo, de nombres miClaseA,
	 * miClaseB y miClaseC.
	 * 
	 * Cada uno de estos objetos será una instancia de la clase E16_MiClase_LeandroDoCarmo construido
	 * con cada uno de los tres constructores disponibles en la clase.
	 */

}