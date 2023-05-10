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
import productosVeterinaria.dominio.Raza;
import productosVeterinaria.dominio.Telefono;
import productosVeterinaria.dominio.TipoDePelo;
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
		
		assertEquals(1, nuevaProvincia.getListaDeProovedores().size());
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
	

	//Test Producto
	
	@org.junit.Test
	public void queSePuedaAgregarUnProducto() {
		Veterinaria vet = new Veterinaria();
		
		//Atributos Mordida
		
		Integer id_mordida = 1;
		String mordida_tipo = "grande";
		
		//Atributos Producto
		String nombreProducto = "Rosario Come Gatos";
		Double precioProducto = 1000.0;
		Integer codigoProducto = 00001;
		LocalDate fechaDeVencimientoProducto = LocalDate.of(2025, 9, 11);
		
		//Creación Mordida y Producto
		
		Mordida mordida = new Mordida(id_mordida,mordida_tipo);
		Producto comeGatosRosarino = new Producto(nombreProducto, precioProducto, codigoProducto, mordida, fechaDeVencimientoProducto);
	
		vet.agregarProducto(comeGatosRosarino);
		
		assertEquals(1, vet.getProductos().size());
	}
	
	@org.junit.Test
	public void queNoSePuedanCrearDosProductosIgualesEnVeterinaria() {
		
		Veterinaria vet1 = new Veterinaria();
		
		//Atributos Producto
		String nombreProducto = "Rosarino Come Gatos";
		
		Double precioProducto = 1000.0;
		
		Integer codigoProducto = 00001;
	
		LocalDate fechaDeVencimientoProducto = LocalDate.of(2025, 9, 11);
	
		
		//Creación Mordida y Producto
		
		Mordida mordida = new Mordida(1,"mediana");
	
		
		Producto comeGatosRosarino = new Producto(nombreProducto, precioProducto, codigoProducto, mordida, fechaDeVencimientoProducto);
		Producto perritoMalvado = new Producto(nombreProducto, precioProducto, codigoProducto, mordida, fechaDeVencimientoProducto);
		
		vet1.agregarProducto(comeGatosRosarino);
		vet1.agregarProducto(perritoMalvado);
		
		assertEquals(1, vet1.getProductos().size());
		
		
	}
	
	@org.junit.Test
	public void validarQueSiUnProductoEstaVencidoNoSeAgregueAVeterinaria() {
		
		Veterinaria vet1 = new Veterinaria();
		
		//Atributos Producto
		String nombreProducto = "Rosarino Come Gatos";
		
		Double precioProducto = 1000.0;
		
		Integer codigoProducto = 00001;
	
		LocalDate fechaDeVencimientoProducto = LocalDate.of(2022, 9, 11);
		
	
		
		//Creación Mordida y Producto
		
		Mordida mordida = new Mordida(1,"mediana");
	
		
		Producto comeGatosRosarino = new Producto(nombreProducto, precioProducto, codigoProducto, mordida, fechaDeVencimientoProducto);
	
		assertFalse(vet1.agregarProducto(comeGatosRosarino));
		

	}
	
	@org.junit.Test
	public void queSePuedaValidarElTipodeMordidaDeUnPerro() {
		Mordida mordida = new Mordida(1,"");
		
		LocalDate fechaDeVencimientoProducto = LocalDate.of(2022, 9, 11);
		Perro perritoMalvado = new Perro("Tomy", 100.0, 0001, mordida , fechaDeVencimientoProducto , TipoDePelo.peloDuro, Raza.MEDIANA);
		
		perritoMalvado.validarMordida();
		
		Mordida mordidaAEvaluar = perritoMalvado.getTipoMordida();
		
		assertEquals(mordidaAEvaluar.getMordida(), "Mediana");
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
		
		
		Perro perro = new Perro(nombreProducto,precio,codigo,tipoMordida,fechaVenc,tipoPelo, Raza.GRANDE);
		TipoDePelo peloEsperado=TipoDePelo.peloLiso;
		
		
		
		assertEquals(peloEsperado, perro.getTipoPelo());

	}

	
	

}
