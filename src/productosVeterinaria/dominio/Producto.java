package productosVeterinaria.dominio;

import java.time.LocalDate;

public class Producto {
	
	private String nombre;
	private Double precio;
	private Integer codigo;
	private Mordida tipoMordida;
	private LocalDate fechaDeVencimiento;
	
	public Producto(String nombre, Double precio, Integer codigo, Mordida tipoMordida, LocalDate fechaDeVencimiento){
		
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.tipoMordida = tipoMordida;
		this.fechaDeVencimiento = fechaDeVencimiento;

		
	}
	
	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Mordida getTipoMordida() {
		return tipoMordida;
	}

	public void setTipoMordida(Mordida tipoMordida) {
		this.tipoMordida = tipoMordida;
	}

	public LocalDate getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	
	
}
