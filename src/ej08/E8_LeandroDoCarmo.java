package ej08;

import java.util.Scanner;

public class E8_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		String email;
		String salida = "ERROR: ";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un email: ");
		email = entrada.nextLine().toLowerCase();
		
		// CONTROL DE @
		if (email.length() < 6){
			salida += "El email debe tener al menos 6 caracteres";
		}else if(contarCaracteres(email, '@') != 1) {
			salida += "El email debe contener 1 @";
		}else if(esPrimeroUltimo(email, '@')) {
			salida += "El email no puede comenzar ni terminar en @";
		}else if(partirLuegoBuscar(email) < 1) {
			salida += "El email debe contener al menos un punto despu�s del @";
		}else if(!caracteresPermitidos(email)) {
			salida += "El email solo puede contener letras, n�meros, @ y guiones (bajo o alto)";
		}else {
			salida = "El email " + email + " est� correcto";
		}
		
		System.out.println(salida);

	}

	/**
	 * M�todo que devuelve la cantidad de veces que aparece
	 * un caracter dado en una cadena dada
	 * 
	 * @param txt Cadena de texto a recorrer
	 * @param caracter Caracter que se busca contar
	 * @return contador Cantidad de veces que aparece el caracter en la cadena
	 */
	public static int contarCaracteres(String txt, char caracter) {
		int posicion;
		int contador = 0;		
		posicion = txt.indexOf(caracter);
		while (posicion != -1) { // mientras encuentre el caracter
			contador++;
			posicion = txt.indexOf(caracter, posicion + 1);
		}
		return contador;
	}
	
	/**
	 * M�todo que dice si un caracter es el primero o el 
	 * �ltimo en una cadena dada
	 * 
	 * @param txt Cadena de texto a recorrer
	 * @param caracter Caracter a buscar
	 * @return boolean True si el caracter dado es el primero o el �ltimo de la cadena
	 */
	public static boolean esPrimeroUltimo(String txt, char caracter) {
		if(txt.charAt(0) == caracter || txt.charAt(txt.length()-1) == caracter) {
			return true;
		}
		return false;
	}
	
	/**
	 * M�todo que recibe un email y lo parte en dos
	 * bas�ndose en @, luego se basa en el m�todo contarCaracteres
	 * para contar y devolver la cantidad de veces que aparece el . (punto)
	 * en ladena posterior al @
	 *  
	 * @param email Email a dividir
	 * @return int Cantidad de veces que aparece el . (punto) en la cadena posterior al @
	 */
	public static int partirLuegoBuscar(String email) {
		String[] partes = email.split("@");
		return contarCaracteres(partes[1], '.');
	}
	
	/**
	 * Valida que email est� escrito con caracteres v�lidos
	 * 
	 * @param email Correo a verificar
	 * @return boolean True si est� todo correcto, de lo contrario False
	 */
	public static boolean caracteresPermitidos(String email) {
		String permitido = "abcdefghijklmnopqrstuvwxyz0123456789@.-_";
		for (int i = 0; i < email.length(); i++) {
	        if (permitido.indexOf(email.charAt(i)) == -1) {
	            return false;
	        }
	    }
		return true;
	}
	
	
	
	
	/*
	 * LETRA DE EJERCICIO
	Conocemos que el formato v�lido de una direcci�n de correo electr�nico es del tipo usuario@domino.zn

	Crear un programa que permita ingresar una direcci�n de correo y responda "Vale" o "No vale" de acuerdo a las siguientes pautas:

	la cadena ingresada

	debe tener una �nica @, no pudiendo ser ni el primer ni el �ltimo caracter de la cadena
	debe tener al menos un punto. Puede tener m�s de uno. Puede tener puntos anteriores a la @, pero debe tener al menos un punto posterior a la @. El primer y el �ltimo caracter de la cadena no pueden ser puntos.
	s�lo se permiten letras, d�gitos, @, punto y guiones (alto y bajo)
	No se permite usar expresiones regulares (se ver�n m�s adelante)

	Dadas las condiciones anteriores, existe un largo m�nimo para la cadena, que debe chequearse antes que cualquier otra codici�n.
	*/

}
