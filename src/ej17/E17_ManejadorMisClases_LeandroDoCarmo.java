package ej17;

import ej17.E17_MiClase_LeandroDoCarmo;

public class E17_ManejadorMisClases_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO

		E17_MiClase_LeandroDoCarmo miClaseA = new E17_MiClase_LeandroDoCarmo(1, "Gato");
		E17_MiClase_LeandroDoCarmo miClaseB = new E17_MiClase_LeandroDoCarmo(5, "Perro");

		try { // ERROR el m�todo es inaccesible porque es privado de la clase E17_MiClase_LeandroDoCarmo
			int blanco = miClaseA.valorPalabra("blanco");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		try { // ERROR el m�todo es inaccesible porque es privado de la clase E17_MiClase_LeandroDoCarmo
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
	 * A) Definir un m�todo llamado aumentaN�mero que recibe un n�mero que
	 * representa un incremento y aumenta el valor del atributo
	 * 
	 * B) Definir un m�todo llamado valorPalabra que recibe un par�metro que puede
	 * tener valor "Blanco" o "Negro", que entrega el valor de tipo String
	 * "el valor es. nnnn"
	 * 
	 * Si el par�metro recibe el valor "Blanco", nnnn es el largo del atributo
	 * palabra, medido en caracteres.
	 * 
	 * Si el par�metro recibe el valor "Negro", nnnn es el valor del atributo n�mero
	 * multiplicado por 10
	 * 
	 * Tanto para obtener uno y otro valor deben programarse funciones privadas en
	 * la clase E16_MiClase_LeandroDoCarmo
	 * 
	 * C) Desde la clase la clase manejadora, imprimir en consola el resultado de
	 * miClaseA.valorPalabra("Blanco") y miClaseB.valorPalabra("Negro")
	 */

}