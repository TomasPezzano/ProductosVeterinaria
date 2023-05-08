package productosVeterinaria.test;

import static org.junit.Assert.*;

import productosVeterinaria.dominio.Mordida;
import productosVeterinaria.dominio.Proovedor;

public class Test {

	@org.junit.Test
	public void queSeCreeUnProovedorYSeAgregueAVeterinaria() {
		Long cuitProovedor = 20438613693l;
		
		Proovedor proovedor1 = new Proovedor();
			
		
	}
	
	@org.junit.Test
	public void queSeCreeUnTipoDeMordidaYSeAgregueAMordidas() {
		Integer id_mordida = 1;
		String mordida = "chica";
		
		Mordida mordida1 = new Mordida(id_mordida,mordida);
			
	}
	
	
}
