package ej19;

import ej19.E19_ClaseMoto_LeandroDoCarmo;
import ej19.E19_ClaseAuto_LeandroDoCarmo;

public class E19_Principal_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO

		E19_ClaseMoto_LeandroDoCarmo vehiculo1 = new E19_ClaseMoto_LeandroDoCarmo("Ural");
		E19_ClaseAuto_LeandroDoCarmo vehiculo2 = new E19_ClaseAuto_LeandroDoCarmo("Mazda");
		
		System.out.println(vehiculo1.mostrarMarcaRodado());
		System.out.println(vehiculo2.mostrarMarcaRodado());
	}

	/*
	 * LETRA DEL EJERCICIO
	 * 
	 * Interfaces
	 * 
	 * Definir una interfaz llamada Veh�culo que tiene un m�todo mostrarMarcaRodado
	 * que devuelve un String
	 * 
	 * Definir 2 clases: Auto y Moto, que implementan la interfaz Veh�culo y tienen
	 * adem�s definida una constante propia, cada una con su propio valor. La
	 * constante se llama nroRuedas y vale 2 y 4 respectivamente.
	 * 
	 * Adem�s de esta constante, ambas clases tienen un atributo marca de clase
	 * String
	 * 
	 * El m�todo implementado, en la clase Auto muestra primero la marca y a
	 * continuaci�n el nro de ruedas. En cambio, este m�todo en la clase Moto
	 * muestra el n�mero de ruedas y a continuaci�n la marca
	 * 
	 * Crear una clase principal donde se instancia una variable llamada vehiculo1
	 * de clase Auto marca "Mazda" y otra variable llamada vehiculo2 de clase Moto,
	 * con marca "Ural."
	 * 
	 * El programa principal debe publicar en la consola la marca y la cantidad de
	 * ruedas de ambos veh�culos.
	 */
}
