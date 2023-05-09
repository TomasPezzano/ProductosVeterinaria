package productosVeterinaria.test;

import static org.junit.Assert.*;
import static org.junit.Test.*;


import productosVeterinaria.dominio.Gato;
import productosVeterinaria.dominio.Perro;

import productosVeterinaria.dominio.Componente;
import productosVeterinaria.dominio.Mordida;
import productosVeterinaria.dominio.Proovedor;
import productosVeterinaria.dominio.Provincia;
import productosVeterinaria.dominio.Veterinaria;

public class Test {

	@org.junit.Test
	public void queSeCreeUnaProovedorYSeAgregueAProvincia() {
		Integer codigoProvincia = 21;
		String nombreProvincia = "La Rioja";
		Double valorImpuesto = 20.0;
		Long cuitProovedor = 20438613693l;
		String razonSocialProovedor = "Proovedor SA";
		String domicilioProovedor = "Kiernan 222";
		
		Provincia nuevaProvincia = new Provincia(codigoProvincia, nombreProvincia,valorImpuesto);
		Proovedor proovedor1 = new Proovedor(cuitProovedor, razonSocialProovedor, domicilioProovedor);
		
		nuevaProvincia.agregarProovedores(proovedor1);
		
		assertEquals(nuevaProvincia.getListaDeProovedores().size(), 1);
	}
	
	@org.junit.Test
	public void queSeValideElCuitDelProovedor() {
		Long cuitProovedor = 20438613693l;
		String razonSocialProovedor = "Proovedor SA";
		String domicilioProovedor = "Kiernan 222";
		
		Proovedor proovedor1 = new Proovedor(cuitProovedor, razonSocialProovedor, domicilioProovedor);
			
		assertTrue(proovedor1.validarCuit());
	}
	
	@org.junit.Test
	public void queSeCreenDosProovedoresConElMismoCuitYNoSePuedaAgregarAUnaProvincia() {
		Long cuitProovedor = 20438613693l;
		String razonSocialProovedor = "Proovedor SA";
		String domicilioProovedor = "Kiernan 222";
		Long cuitProovedor2 = 20438613693l;
		String razonSocialProovedor2 = "Proovedores SA";
		String domicilioProovedor2 = "Kiernan 224";
		Integer codigoProvincia = 21;
		String nombreProvincia = "La Rioja";
		Double valorImpuesto = 20.0;
		
		Provincia nuevaProvincia = new Provincia(codigoProvincia, nombreProvincia,valorImpuesto);
		Proovedor proovedor1 = new Proovedor(cuitProovedor, razonSocialProovedor, domicilioProovedor);
		Proovedor proovedor2 = new Proovedor(cuitProovedor2, razonSocialProovedor2, domicilioProovedor2);
			
		nuevaProvincia.agregarProovedores(proovedor1);
		nuevaProvincia.agregarProovedores(proovedor2);
		
		assertEquals(nuevaProvincia.getListaDeProovedores().size(), 1);
	}
	
	@org.junit.Test
	public void queSeValideElCodigoDeProvincia() {
		Integer codigoProvincia = 21;
		String nombreProvincia = "La Rioja";
		Double valorImpuesto = 20.0;
		
		Provincia nuevaProvincia = new Provincia(codigoProvincia, nombreProvincia,valorImpuesto);
			
		assertTrue(nuevaProvincia.validarCodigoProvincia());
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
