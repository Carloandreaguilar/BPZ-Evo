package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.bpz.model.entity.Banco;

public class BancoTest {

	@Test
	public void test() {
		
		Banco b=new Banco();
		assertEquals(b.getRuc(),"20545632208");

	}

}
