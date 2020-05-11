package ej11;

public class E11_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		int a = 0;
		int b = 10;

		
		System.out.println("De A a B en orden creciente: " + ordenCreciente(a, b));
		System.out.println("De B a A en orden decreciente: " + ordenDecreciente(a, b));
		System.out.println("Pares de A a B en orden creciente: " + paresOrdenCreciente(a, b));
		System.out.println("Impares de B a A en orden decreciente: " + imparesOrdenDecreciente(a, b));
		System.out.println("Pares de A a triple de B en orden creciente: " + paresOrdenCreciente(a, b * 3));
		System.out.println("Impares de la mitad de B a A en orden decreciente: " + imparesOrdenDecreciente(a, b / 2));
	}

	/**
	 * Devuelve un texto que contiene la numeraci�n de A a B en orden creciente
	 * 
	 * @param a int N�mero inicial
	 * @param b int N�mero final
	 * @return ret String con los n�meros
	 */
	public static String ordenCreciente(int a, int b) {
		String ret = "";
		for (int i = a; i <= b; i++) {
			ret += (i != b) ? i + "," : i;
		}
		return ret;
	}

	/**
	 * Devuelve un texto que contiene la numeraci�n de B a A en orden decreciente
	 * 
	 * @param a int N�mero final
	 * @param b int N�mero inicial
	 * @return ret String con los n�meros
	 */
	public static String ordenDecreciente(int a, int b) {
		String ret = "";
		for (int i = b; i >= a; i--) {
			ret += (i != a) ? i + "," : i;
		}
		return ret;
	}

	/**
	 * Devuelve un texto que contiene los n�meros pares entre A y B en orden
	 * creciente
	 * 
	 * @param a int N�mero inicial
	 * @param b int N�mero final
	 * @return ret String con los n�meros
	 */
	public static String paresOrdenCreciente(int a, int b) {
		String ret = "";
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				ret += (i != b) ? i + "," : i;
			}
		}
		return ret;
	}

	/**
	 * Devuelve un texto que contiene los n�meros impares entre B y A en orden
	 * decreciente
	 * 
	 * @param a int N�mero final
	 * @param b int N�mero inicial
	 * @return ret String con los n�meros
	 */
	public static String imparesOrdenDecreciente(int a, int b) {
		String ret = "";
		for (int i = b; i >= a; i--) {
			if (i % 2 != 0) {
				ret += (i != a) ? i + "," : i;
			}
		}
		return ret;
	}

	/*
	 * 
	 * LETRA DEL EJERCICIO
	 * 
	 * Crear un programa que inicialice 2 variables:
	 * 
	 * int a=0;
	 * 
	 * int b=10;
	 * 
	 * Utilizando las sentencia for, desplegar los n�meros entre a y b,
	 * 
	 * en orden creciente en orden decreciente s�lo los n�meros pares en orden
	 * creciente s�lo los n�mero impares en orden decreciente Adem�s
	 * 
	 * que muestre en consola la suma de los n�meros pares entre a y el triple de b
	 * que muestre en consola la cantidad de n�meros impares entre a y la mitad de b
	 * 
	 */

}
