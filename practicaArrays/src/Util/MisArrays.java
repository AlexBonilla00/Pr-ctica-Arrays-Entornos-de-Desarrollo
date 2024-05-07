package Util;

import java.util.Arrays;

public abstract class MisArrays {
/**
 * Calcula la supuesta media de los numeros entre 0 y 10
 * @return la media de la array
 * @throws IllegalArgumentException si los numeros no estan entre 0 y 10
 */
	public static float mediaNotas(int[] array) {

		for(int i=0; i<array.length; i++) {
			if(array[i]<0 || array[i]>10) {
				throw new IllegalArgumentException("Debe ser los numeros entre 0 y 10");
				
			}
		}
		int suma =0;
		for(int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return (float) suma / array.length;
	}
	
	/**
	 * Calcula mediana del array de numeros
	 * 
	 * param num entre 0 y 10
	 * @return La mediana del array
	 * @throws IllegalArgumentException si el array no esta entre 0 y 10
	 */
	public static float medianaNotas(int[] array) {
	for(int i=0; i<array.length; i++) {
		if(array[i]<0 || array[i]>10) {
			throw new IllegalArgumentException("Debe ser los numeros entre 0 y 10");
		}
		}
	Arrays.sort(array);
	int medio = array.length/2;
	if( array.length % 2 ==1) {
		return array[medio];
		
	}
	else {
		return (float) (array[medio-1]+array[medio])/2;
	}
	}
	

	
}

