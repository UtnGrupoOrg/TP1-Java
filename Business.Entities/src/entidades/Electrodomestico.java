package entidades;

public class Electrodomestico {
	//variables de clase
	static final double defaultPrecioBase=100;
	static final float defaultPeso=5;
	static final String defaultColor = "blanco";
	static final char defaultConsumo ='F';
	
	// variables de instancia
	protected double precioBase;
	protected float peso;
	protected String color;
	protected char consumoEnergetico;
	
	//Metodos
	public double getPrecioBase() {
		return precioBase;
	}

	public float getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	
	public Electrodomestico() {
		this.precioBase = Electrodomestico.defaultPrecioBase;
		this.peso = Electrodomestico.defaultPeso;
		this.color = Electrodomestico.defaultColor;
		this.consumoEnergetico = Electrodomestico.defaultConsumo;
	}

	public Electrodomestico(double precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = Electrodomestico.defaultColor;
		this.consumoEnergetico = Electrodomestico.defaultConsumo;
	}

	public Electrodomestico(double precioBase, float peso, String color,
			char consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		if (this.comprobarColor(color)) {
			this.color = color;
		}
		else {
			this.color = Electrodomestico.defaultColor;
		}
		if (this.comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = consumoEnergetico;
		}
		else {
			this.consumoEnergetico = Electrodomestico.defaultConsumo;
		}
	}
	
	private boolean comprobarColor(String color) {
		switch (color.toLowerCase()) {
		case "blanco": return true;
		case "negro": return true;
		case "rojo": return true;
		case "azul": return true;
		case "gris": return true;

		default: return false;
		}
	
	}
	
	private boolean comprobarConsumoEnergetico(char consum) {
		char consumo = Character.toUpperCase(consum);
		if (consumo>='A' && consumo<='F') {
			return true;
		}
		else {
			return false;
		}
	}
	



}
