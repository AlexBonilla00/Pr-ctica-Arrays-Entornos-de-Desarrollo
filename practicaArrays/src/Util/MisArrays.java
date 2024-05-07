package Util;

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
}
