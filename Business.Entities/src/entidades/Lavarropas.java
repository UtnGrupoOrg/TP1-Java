package entidades;

public class Lavarropas extends Electrodomestico {
	//variable de clase. Elementos por defecto
	static final float defaultCarga=5;
	
	//atributo
	private float carga;
	
	public Lavarropas()
	{
		this.carga=defaultCarga;
		this.color=defaultColor;
		this.consumoEnergetico=defaultConsumo;
		this.peso=defaultPeso;
		this.precioBase=defaultPrecioBase;
	}
	
	public Lavarropas(double precio, float peso)
	{
		this.carga=defaultCarga;
		this.color=defaultColor;
		this.consumoEnergetico=defaultConsumo;
		this.precioBase=precio;
		this.peso=peso;
	}
	
	public Lavarropas(float carga)
	{
		super();
		this.carga=carga;
	}

	public float getCarga() {
		return carga;
	}
	
	public void precioFinal()
	{
		if (this.carga>30) {
			this.precioBase=this.getPrecioBase()+50;		
		}
	}
	

	
}
