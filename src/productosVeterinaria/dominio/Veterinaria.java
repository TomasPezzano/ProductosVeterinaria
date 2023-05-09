package productosVeterinaria.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class Veterinaria {
	private String nombreVeterinaria;
	private HashSet<Producto> productos = new HashSet<>();
	
	
	public Veterinaria() {
		
	}

	public Veterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	
	}

	public String getNombreVeterinaria() {
		return nombreVeterinaria;
	}

	public void setNombreVeterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	}
	
	

	public HashSet<Producto> getProductos() {
		return productos;
	}

	public void setProductos(HashSet<Producto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	

	
}
