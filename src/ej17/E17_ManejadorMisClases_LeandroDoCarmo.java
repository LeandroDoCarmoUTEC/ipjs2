package ej17;

import ej17.E17_MiClase_LeandroDoCarmo;

public class E17_ManejadorMisClases_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO

		E17_MiClase_LeandroDoCarmo miClaseA = new E17_MiClase_LeandroDoCarmo(1, "Gato");
		E17_MiClase_LeandroDoCarmo miClaseB = new E17_MiClase_LeandroDoCarmo(5, "Perro");

		try { // ERROR el método es inaccesible porque es privado de la clase E17_MiClase_LeandroDoCarmo
			int blanco = miClaseA.valorPalabra("blanco");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		try { // ERROR el método es inaccesible porque es privado de la clase E17_MiClase_LeandroDoCarmo
			int blanco = miClaseB.valorPalabra("negro");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	
	/*
	 * 
	 * LETRA DEL EJERCICIO
	 * 
	 * Sobre las clases creadas en el ejercicio anterior, realizar:
	 * 
	 * A) Definir un método llamado aumentaNúmero que recibe un número que
	 * representa un incremento y aumenta el valor del atributo
	 * 
	 * B) Definir un método llamado valorPalabra que recibe un parámetro que puede
	 * tener valor "Blanco" o "Negro", que entrega el valor de tipo String
	 * "el valor es. nnnn"
	 * 
	 * Si el parámetro recibe el valor "Blanco", nnnn es el largo del atributo
	 * palabra, medido en caracteres.
	 * 
	 * Si el parámetro recibe el valor "Negro", nnnn es el valor del atributo número
	 * multiplicado por 10
	 * 
	 * Tanto para obtener uno y otro valor deben programarse funciones privadas en
	 * la clase E16_MiClase_LeandroDoCarmo
	 * 
	 * C) Desde la clase la clase manejadora, imprimir en consola el resultado de
	 * miClaseA.valorPalabra("Blanco") y miClaseB.valorPalabra("Negro")
	 */

}