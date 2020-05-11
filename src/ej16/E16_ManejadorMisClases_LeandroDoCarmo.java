package ej16;

import ej16.E16_MiClase_LeandroDoCarmo;

public class E16_ManejadorMisClases_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO

		E16_MiClase_LeandroDoCarmo miClaseA = new E16_MiClase_LeandroDoCarmo(1, "Gato");
		E16_MiClase_LeandroDoCarmo miClaseB = new E16_MiClase_LeandroDoCarmo(5, "Perro");
		E16_MiClase_LeandroDoCarmo miClaseC = new E16_MiClase_LeandroDoCarmo(4, "Loro");
		E16_MiClase_LeandroDoCarmo miClaseD = new E16_MiClase_LeandroDoCarmo(4, "Oveja");

		System.out.println((comparaClases(miClaseA, miClaseB)) ? "A y B Son iguales" : "A y B Son distintos");
		System.out.println((comparaClases(miClaseC, miClaseD)) ? "C y D Son iguales" : "C y D Son distintos");
	}

	/**
	 * Compara el número de dos clases dadas para saber si son iguales
	 * @param uno E16_MiClase_LeandroDoCarmo Clase uno
	 * @param dos E16_MiClase_LeandroDoCarmo Clase dos
	 * @return boolean True si los números son iguales, false en caso contrario
	 */
	public static boolean comparaClases(E16_MiClase_LeandroDoCarmo uno, E16_MiClase_LeandroDoCarmo dos) {
		return (uno.getNumero() == dos.getNumero()) ? true : false;
	}
	
	
	/*
	 * 
	 * LETRA DEL EJERCICIO
	 * 
	 * obre las clases creadas en el ejercicio anterior, programar un método llamado
	 * compara, que devuelve un valor booleano (true/false) si el atributo número en
	 * la clase es igual al atributo número de la clase con la que se está
	 * comparando.
	 */

}