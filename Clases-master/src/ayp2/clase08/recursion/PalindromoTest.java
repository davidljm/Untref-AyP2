package ayp2.clase08.recursion;

import org.junit.Assert;
import org.junit.Test;

public class PalindromoTest {

	@Test
	public void unStringVacioEsUnPalindromo() {
		Assert.assertTrue(Palindromo.esPalindromo(""));
	}

	@Test
	public void unUnicoCaracterEsUnPalindromo() {
		Assert.assertTrue(Palindromo.esPalindromo("A"));
	}

	@Test
	public void unStringConDosCaracteresIgualesEsUnPalindromo() {
		Assert.assertTrue(Palindromo.esPalindromo("BB"));
	}

	@Test
	public void unStringConDosCaracteresDistintosNoEsUnPalindromo() {
		Assert.assertFalse(Palindromo.esPalindromo("BC"));
	}

	@Test
	public void unStringQueEmpiezaYTerminaConCaracteresDistintosNoEsUnPalindromo() {
		Assert.assertFalse(Palindromo.esPalindromo("BAFEC"));
	}

	@Test
	public void unPalindromoCualquiera() {
		Assert.assertTrue(Palindromo.esPalindromo("NEUQUEN"));
	}

	@Test
	public void algoQueNoEsUnPalindromo() {
		Assert.assertFalse(Palindromo.esPalindromo("ASIA"));
	}

}
