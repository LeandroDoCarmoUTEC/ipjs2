package ej09;

import java.util.Scanner;

public class E9_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO 
		
		String texto;
		char caracter;
		int numero;
		int posicion = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese texto: ");
		texto = entrada.nextLine();
		
		System.out.println("Ingrese caracter: ");
		caracter = entrada.next().charAt(0);
		
		System.out.println("Ingrese numero: ");
		numero = entrada.nextInt();
		
		// compruebo que el n�mero sea igual o menor al largo del texto
		try {
			numeroComparaLargo(numero, texto); 
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		
		// obtengo la posici�n en la que se encuentra el caracter ingresado en el texto tambi�n ingresado
		try {
			posicion =  estaEn(texto, caracter); 
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		
		System.out.printf("El caracter que se encuentra en la posici�n correspondiente al n�mero ingresado (%d) es: %s \r\n", numero, texto.toUpperCase().charAt(numero));
		System.out.printf("La posici�n del caracter ingresado, en el texto ingresado es: %d \r\n", posicion);		
		
		

	}
	
	/**
	 * Valida que el caracter est� en en texto dado
	 * 
	 * @param texto Cadena de texto a recorrer
	 * @param caracter Caracter a buscar en la cadena
	 * @return int Posici�n del caracter si es que lo encuentra
	 * @throws Exception 
	 */
	public static int estaEn(String texto, char caracter) throws Exception {
		int posicion = texto.indexOf(caracter); 
        if (posicion < 0) {
            throw new Exception("ERROR: El caracter no se encuentra en el texto dado\r\n");
        }else {
        	return posicion + 1;
        }
	}
	
	/**
	 * Valida que el n�mero dado sea igual o menor al largo del texto, tambi�n se fija
	 * que no sea un n�mero negativo
	 * @param numero Numero a validar
	 * @param texto Texto a comparar
	 * @return boolean True si el n�mero es mayor o igual a cero y menor o igual al largo del texto
	 * @throws Exception 
	 */
	public static boolean numeroComparaLargo(int numero, String texto) throws Exception {
		if(numero > texto.length() || numero < 0) {
			throw new Exception("ERROR: El n�mero ingresado no puede ser mayor al largo del texto y tampoco puede ser un n�mero negativo\r\n");
		}else {
			return true;
		}
	}
	
	
	
	
	
	/*
	LETRA DEL EJERCICIO
	
	Crear un programa que permita ingresar una cadena, un caracter y un n�mero entero.
	El programa debe:
	devolver  el  caracter que se encuentre en la posici�n definida por el n�mero ingresado, en may�sculas.
	devolver la posici�n en que se encuentra el caracter siendo 1 la primera posici�n (no 0)
	Tener en cuenta que es posible que el caracter ingresado no se encuentre en la cadena y que tampoco 
	haya un caracter en la posici�n indicada por el n�mero ingresado
	 */

}
