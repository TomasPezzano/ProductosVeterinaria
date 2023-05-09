package productosVeterinaria.dominio;

import java.time.LocalDate;

public class Perro extends Producto{

	private TipoDePelo tipoPelo;
	
	public Perro (String nombre, Double precio, Integer codigo, Mordida tipoMordida, LocalDate fechaDeVencimiento,TipoDePelo tipoPelo) {
		super(nombre, precio, codigo, tipoMordida, fechaDeVencimiento);
		this.tipoPelo=tipoPelo;
	}

	public TipoDePelo getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(TipoDePelo tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	
	
	
}
