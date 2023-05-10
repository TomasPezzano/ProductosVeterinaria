package productosVeterinaria.dominio;

import java.time.LocalDate;

public class Perro extends Producto{
	


	private TipoDePelo tipoPelo;
	private Raza raza;
	
	public Perro (String nombre, Double precio, Integer codigo, Mordida tipoMordida, LocalDate fechaDeVencimiento,TipoDePelo tipoPelo, Raza raza) {
		super(nombre, precio, codigo, tipoMordida, fechaDeVencimiento);
		
		this.tipoPelo=tipoPelo;
		this.raza = raza;
	}

	public TipoDePelo getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(TipoDePelo tipoPelo) {
		this.tipoPelo = tipoPelo;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
	public void validarMordida() {
		
		switch (this.raza) {
		
		case GRANDE:
			
			getTipoMordida().setMordida("Grande");
			
			break;
		case MEDIANA:
			
			getTipoMordida().setMordida("Mediana");
			break;
			
		case CHICA:
			
			getTipoMordida().setMordida("Chica");
			break;
		}
	
	}
}
