package productosVeterinaria.dominio;

import java.time.LocalDate;

public class Gato extends Producto {

	private LocalDate fechaElaboracion;
	private LocalDate antiguedad;

	
	public Gato (String nombre, Double precio, Integer codigo, Mordida tipoMordida, LocalDate fechaDeVencimiento ) {
		super(nombre, precio, codigo, tipoMordida, fechaDeVencimiento);
	}
}