package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.MisArrays;

class TestMedia {

	@Test
	void testMediaNotas1() {
		
		int[] array1 = {5,8,7,9,10};
		float mediaEsperada1 =7.8f;
		float mediaObtenida1 = MisArrays.mediaNotas(array1);
		assertEquals(mediaEsperada1, mediaObtenida1,0.001);
	
		
	}
	@Test
	void testMediaNotas2() {
		int[] array2 = {4,5,6};
		float mediaEsperada2 =5.0f;
		float mediaObtenida2 = MisArrays.mediaNotas(array2);
		assertEquals(mediaEsperada2, mediaObtenida2,0.001);
	}
	@Test
	void testMediaNotas3() {
		int[] array3 ={ -225, 18, 12, 19, 10 };
		assertThrows(IllegalArgumentException.class, () -> MisArrays.mediaNotas(array3));	
	}
}
