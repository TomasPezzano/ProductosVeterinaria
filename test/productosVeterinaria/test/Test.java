package productosVeterinaria.test;

import static org.junit.Assert.*;
import static org.junit.Test.*;


import productosVeterinaria.dominio.Gato;
import productosVeterinaria.dominio.Perro;

import productosVeterinaria.dominio.Componente;
import productosVeterinaria.dominio.Mordida;
import productosVeterinaria.dominio.Proovedor;

public class Test {

	@org.junit.Test
	public void queSeCreeUnProovedorYSeAgregueAVeterinaria() {
		Long cuitProovedor = 20438613693l;
		
		Proovedor proovedor1 = new Proovedor();
			
		
	}

		
	public void queSeCreeUnPerro() {
		Perro perro = new Perro();
	}

	@org.junit.Test
	public void queSeCreeUnTipoDeMordidaYSeAgregueAMordidas() {
		Integer id_mordida = 1;
		String mordida = "chica";
		
		Mordida mordida1 = new Mordida(id_mordida,mordida);
			
	}
	
	@org.junit.Test
	public void queSePuedaCrearComponente() {
		String pais = "Argentina";
		String f_vencimiento = "01/06/1999";
		Boolean analizado = false;
		Integer cod_componente = 1;
		String descripcion = "Gordo nidalee";
		
		Componente componente1 = new Componente(pais,f_vencimiento,analizado,cod_componente,descripcion);
			
	}
	
}
