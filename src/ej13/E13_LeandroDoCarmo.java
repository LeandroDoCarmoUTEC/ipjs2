package ej13;

public class E13_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		int numeros[] = new int[] {0, 2, 15, 31, 5, 10, 14, 72, 22, 12};
		String palabras[] = new String[] {"manzana", "banana", "pera", "uva", "kiwi", "sand�a", "mandarina", "mel�n", "coco", "ciruela"};
		
		System.out.println("Ambas listas emparejando por los n�meros y las palabras por posici�n: ");
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i] + " - " + palabras[i]);
		}
		
		System.out.println(" ");
		System.out.println("Ambas listas emparejando por posici�n opuesta: ");
		
		int largo = numeros.length - 1;
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i] + " - " + palabras[largo]);
			largo--;
		}
	}

	/*
	 * LETRA DEL EJERCICIO
	 * 
	 * Hacer un programa que contenga un arreglo de 10 n�meros enteros y otro
	 * arreglo con 10 palabras.
	 * 
	 * Mostrar en consola:	 * 
	 * 1- ambas listas emparejando por los n�meros y las palabras por posici�n. (el
	 * primer n�mero con la primera palabra y as� sucesivamente) 
	 * 2- ambas listas emparejando por posici�n opuesta (el primer n�mero con la �ltima palabra, el
	 * segundo n�mero con la pen�ltima palabra, y as� sucesivamente)
	 */
}
