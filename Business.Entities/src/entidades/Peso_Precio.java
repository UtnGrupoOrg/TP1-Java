package entidades;

public class Peso_Precio {
	static final float SIN_PESO_HASTA =-1;
	
	private float pesoDesde;
	private float pesoHasta;
	private double precio;
	
	
	public float getPesoHasta() {
		return pesoHasta;
	}
	
	public float getPesoDesde() {
		return pesoDesde;
	}
	public double getPrecio() {
		return precio;
	}
	public Peso_Precio(float pesoDesde,float pesoHasta, double precio) {
		this.pesoDesde = pesoDesde;
		this.pesoHasta = pesoHasta;
		this.precio = precio;
	}
	
	public Peso_Precio(float pesoDesde, double precio) {
		this.pesoDesde = pesoDesde;
		this.pesoHasta = SIN_PESO_HASTA;
		this.precio = precio;
	}

	
	
	
}
