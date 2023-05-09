package productosVeterinaria.dominio;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Gato extends Producto {

	private final LocalDate FECHA_ELABORACION = LocalDate.of(2023, 5, 7);
	private LocalDate fechaActual=LocalDate.now();
	private long antiguedad;

	
	public Gato (String nombre, Double precio, Integer codigo, Mordida tipoMordida, LocalDate fechaDeVencimiento ) {
		super(nombre, precio, codigo, tipoMordida, fechaDeVencimiento);
		this.antiguedad=ChronoUnit.DAYS.between(FECHA_ELABORACION, fechaActual);
	}
	
	public Gato() {
		this.antiguedad=ChronoUnit.DAYS.between(FECHA_ELABORACION, fechaActual);
	}


	public LocalDate getFechaActual() {
		return fechaActual;
	}


	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}


	public long getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(long antiguedad) {
		this.antiguedad = antiguedad;
	}


	public LocalDate getFECHA_ELABORACION() {
		return FECHA_ELABORACION;
	}
	
	
}