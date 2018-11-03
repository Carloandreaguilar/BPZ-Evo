package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.bpz.model.entity.Cargo;
import pe.edu.bpz.model.entity.Empleado;

public class CargoTest {

	@Test
	public void test() {
		long id=1;
		Cargo c= new Cargo(id,"Kenzo",15648.20);
		
		assertEquals("",c, c.crear(id,"Diego",0.01));
	}

}
