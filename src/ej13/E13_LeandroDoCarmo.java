package ej13;

public class E13_LeandroDoCarmo {

	public static void main(String[] args) {
		// LETRA DEL EJERCICIO AL FINAL DEL DOCUMENTO
		int numeros[] = new int[] {0, 2, 15, 31, 5, 10, 14, 72, 22, 12};
		String palabras[] = new String[] {"manzana", "banana", "pera", "uva", "kiwi", "sandía", "mandarina", "melón", "coco", "ciruela"};
		
		System.out.println("Ambas listas emparejando por los números y las palabras por posición: ");
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i] + " - " + palabras[i]);
		}
		
		System.out.println(" ");
		System.out.println("Ambas listas emparejando por posición opuesta: ");
		
		int largo = numeros.length - 1;
		for(int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i] + " - " + palabras[largo]);
			largo--;
		}
	}

	/*
	 * LETRA DEL EJERCICIO
	 * 
	 * Hacer un programa que contenga un arreglo de 10 números enteros y otro
	 * arreglo con 10 palabras.
	 * 
	 * Mostrar en consola:	 * 
	 * 1- ambas listas emparejando por los números y las palabras por posición. (el
	 * primer número con la primera palabra y así sucesivamente) 
	 * 2- ambas listas emparejando por posición opuesta (el primer número con la última palabra, el
	 * segundo número con la penúltima palabra, y así sucesivamente)
	 */
}
