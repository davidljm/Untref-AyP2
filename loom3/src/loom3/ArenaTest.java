package loom3;


import static org.junit.Assert.*;

import org.junit.Test;

public class ArenaTest {

	@Test
	public void test() throws tipoNoValidoException{
		Arena a = new Arena(1.25, TipoArena.GRUESA);
	}

}
