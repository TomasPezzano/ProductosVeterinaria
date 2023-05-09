package productosVeterinaria.test;

import static org.junit.Assert.*;
import static org.junit.Test.*;

import java.time.LocalDate;

import productosVeterinaria.dominio.Producto;
import productosVeterinaria.dominio.Gato;
import productosVeterinaria.dominio.Perro;
import productosVeterinaria.dominio.Componente;
import productosVeterinaria.dominio.Mordida;
import productosVeterinaria.dominio.PaisDeProcedencia;
import productosVeterinaria.dominio.Proovedor;
import productosVeterinaria.dominio.Provincia;
import productosVeterinaria.dominio.Telefono;
import productosVeterinaria.dominio.TipoDePelo;
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
	public void queSePuedaAgregarUnTelefonoValidoAUnProovedor() {
		Long cuitProovedor = 20438613693l;
		String razonSocialProovedor = "Proovedor SA";
		String domicilioProovedor = "Kiernan 222";
		
		Telefono telefono = new Telefono("+541134236477");
		Proovedor proovedor1 = new Proovedor(cuitProovedor, razonSocialProovedor, domicilioProovedor);
		
		proovedor1.agregarTelefono(telefono);
		
		assertEquals(proovedor1.getListaDeTelefonos().size(), 1);
	}
	
	@org.junit.Test
	public void queNoSePuedanAgregarDosTelefonosIgualesAUnProovedor() {
		Long cuitProovedor = 20438613693l;
		String razonSocialProovedor = "Proovedor SA";
		String domicilioProovedor = "Kiernan 222";
		
		Telefono telefono = new Telefono("+541134236477");
		Telefono telefono2 = new Telefono("+541134236477");
		Proovedor proovedor1 = new Proovedor(cuitProovedor, razonSocialProovedor, domicilioProovedor);
		
		proovedor1.agregarTelefono(telefono);
		proovedor1.agregarTelefono(telefono2);
		
		assertEquals(proovedor1.getListaDeTelefonos().size(), 1);
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

	@org.junit.Test
	public void queSeCreeUnaProvinciaYSeAgregueAUnPais() {
		Integer codigoProvincia = 21;
		String nombreProvincia = "La Rioja";
		Double valorImpuesto = 20.0;
		
		String nombrePais = "Argentina";
		Integer codigoPais = 23;
		
		PaisDeProcedencia pais = new PaisDeProcedencia(nombrePais, codigoPais);
		Provincia nuevaProvincia = new Provincia(codigoProvincia, nombreProvincia,valorImpuesto);
		
		pais.agregarProvincia(nuevaProvincia);
		
		assertEquals(pais.getProvincias().size(), 1);
	}
	
	@org.junit.Test
	public void queSeCreenDosProvinciasConElMismomCodigoYNoSeAgregueAUnPais() {
		Integer codigoProvincia = 21;
		String nombreProvincia = "La Rioja";
		Double valorImpuesto = 20.0;
		
		Integer codigoProvincia2 = 21;
		String nombreProvincia2 = "Buenos Aires";
		Double valorImpuesto2 = 25.0;
		
		String nombrePais = "Argentina";
		Integer codigoPais = 23;
		
		PaisDeProcedencia pais = new PaisDeProcedencia(nombrePais, codigoPais);
		Provincia nuevaProvincia = new Provincia(codigoProvincia, nombreProvincia,valorImpuesto);
		Provincia nuevaProvincia2 = new Provincia(codigoProvincia2, nombreProvincia2,valorImpuesto2);
		
		pais.agregarProvincia(nuevaProvincia);
		pais.agregarProvincia(nuevaProvincia2);
		
		assertEquals(pais.getProvincias().size(), 1);
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
	
	@org.junit.Test
	public void queSeValideLosDiasDeAntiguedadDelProductoTipoGato() {
		Gato gato = new Gato(); 
		long datoesperado=2;
		
		assertEquals(datoesperado, gato.getAntiguedad());
			
	}
	
	@org.junit.Test
	public void queSeValideSiElPerroEsDeDeterminadoTipoDePelo() {
		String nombreProducto="desinfectante";
		Double precio = 20.0;
		Integer codigo =2;
		Mordida tipoMordida= new Mordida(1,"bite");
		LocalDate fechaVenc= LocalDate.of(2023, 6, 20);
		TipoDePelo tipoPelo= TipoDePelo.peloLiso;
		
		
		Perro perro = new Perro(nombreProducto,precio,codigo,tipoMordida,fechaVenc,tipoPelo);
		TipoDePelo peloEsperado=TipoDePelo.peloLiso;
		
		
		
		assertEquals(peloEsperado, perro.getTipoPelo());
	}

	
	

}
