package productosVeterinaria.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Telefono {
	private String numeroTelefono;
	
	public Telefono() {
		
	}
	
	public Telefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	public Boolean validarTelefono() {
		if(numeroTelefono.contains("+") && numeroTelefono.length() == 13) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroTelefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefono other = (Telefono) obj;
		return Objects.equals(numeroTelefono, other.numeroTelefono);
	}
	
	
}
