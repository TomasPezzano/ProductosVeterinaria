package productosVeterinaria.dominio;

import java.time.LocalDate;

public class Perro extends Producto{

	public Perro (String nombre, Double precio, Integer codigo, Mordida tipoMordida, LocalDate fechaDeVencimiento ) {
		super(nombre, precio, codigo, tipoMordida, fechaDeVencimiento);
	}
}
