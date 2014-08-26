package entidades;

public class Televisor extends Electrodomestico {
	static final float defaultResolucion=20;
	static final boolean defaultSintonizador=false;
	
	private float resolucion;
	private boolean sintonizador;
	
	public Televisor()
	{
		super();
		this.sintonizador=defaultSintonizador;
		this.resolucion=defaultResolucion;
	}
	
	public Televisor(double precio, float peso)
	{
		super();
		this.precioBase=precio;
		this.peso=peso;
	}
	
	public Televisor(float resolucion, boolean sintonizador)
	{
		super();
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
	}

	public float getResolucion() {
		return resolucion;
	}

	public boolean getSintonizador() {
		return sintonizador;
	}
	
	public double precioFinal()
	{
		double precio= super.precioFinal();
		if (this.resolucion>40) 
		{
			precio += precio*(30/100);	
		}
		if (this.sintonizador) 
		{
			precio += 50;
		}
		return precio;
	}
	
	
	
}
