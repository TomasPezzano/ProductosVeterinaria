package productosVeterinaria.test;

import static org.junit.Assert.*;
import static org.junit.Test.*;

import java.time.LocalDate;

import productosVeterinaria.dominio.Producto;
import productosVeterinaria.dominio.Gato;
import productosVeterinaria.dominio.Perro;
import productosVeterinaria.dominio.Componente;
import productosVeterinaria.dominio.Mordida;
import productosVeterinaria.dominio.Proovedor;
import productosVeterinaria.dominio.Provincia;
import productosVeterinaria.dominio.Veterinaria;

public class Test {

	// Test Proveedor 
	
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
		Perro perro = new Perro(null, null, null, null, null);
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
	
	//Test Producto
	
	@org.junit.Test
	public void queSePuedaCrearUnProducto() {
		Veterinaria vet = new Veterinaria();
		
		//Atributos Mordida
		
		Integer id_mordida = 1;
		String mordida_tipo = "grande";
		
		//Atributos Producto
		String nombreProducto = "Rosario Come Gatos";
		Double precioProducto = 1000.0;
		Integer codigoProducto = 00001;
		LocalDate fechaDeVencimientoProducto = LocalDate.of(2001, 9, 11);
		
		//Creación Mordida y Producto
		
		Mordida mordida = new Mordida(id_mordida,mordida_tipo);
		Producto comeGatosRosarino = new Producto(nombreProducto, precioProducto, codigoProducto, mordida, fechaDeVencimientoProducto);
	
		vet.agregarProducto(comeGatosRosarino);
		
		assertEquals(1, vet.getProductos().size());
	}
	
	@org.junit.Test
	public void queNoSePuedanCrearDosProductosConElMismoCodigoEnVeterinaria() {
		
		Veterinaria vet1 = new Veterinaria();
		
		//Atributos Producto
		String nombreProducto = "Rosario Come Gatos";
		String nombreProducto2 = "Perrito Malvado";
		Double precioProducto = 1000.0;
		Double precioProducto2 = 1200.0;
		Integer codigoProducto = 00001;
		Integer codigoProducto2 = 00001;
		LocalDate fechaDeVencimientoProducto = LocalDate.of(2025, 9, 11);
		LocalDate fechaDeVencimientoProducto2 = LocalDate.of(2026, 9, 11);
		
		//Creación Mordida y Producto
		
		Mordida mordida = new Mordida(1,"mediana");
		Mordida mordida2 = new Mordida(2,"grande");
		
		Producto comeGatosRosarino = new Producto(nombreProducto, precioProducto, codigoProducto, mordida, fechaDeVencimientoProducto);
		Producto perritoMalvado = new Producto(nombreProducto2, precioProducto2, codigoProducto2, mordida2, fechaDeVencimientoProducto2);
	
		vet1.agregarProducto(comeGatosRosarino);
		vet1.agregarProducto(perritoMalvado);
		
		assertEquals(1, vet1.getProductos().size());
	}

	
	

}
