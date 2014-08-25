package entidades;

public class Electrodomestico {
	//variables de clase
	static final double defaultPrecioBase=100;
	static final float defaultPeso=5;
	static final Color defaultColor = new Color("blanco");
	static final ConsumoEnergetico defaultConsumo =new ConsumoEnergetico('F',10);
	
	// variables de instancia
	protected double precioBase;
	protected float peso;
	protected Color color;
	protected ConsumoEnergetico consumoEnergetico;
	
	//Metodos
	public double getPrecioBase() {
		return precioBase;
	}

	public float getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	
	public Electrodomestico() {
		this.precioBase = Electrodomestico.defaultPrecioBase;
		this.peso = Electrodomestico.defaultPeso;
		this.color = defaultColor;
		this.consumoEnergetico = Electrodomestico.defaultConsumo;
	}

	public Electrodomestico(double precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = defaultColor;
		this.consumoEnergetico = defaultConsumo;
	}

	public Electrodomestico(double precioBase, float peso, Color color,
			ConsumoEnergetico consumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		if (this.comprobarColor(color)) {
			this.color = color;
		}
		else {
			this.color = Electrodomestico.defaultColor;
		}
		if (this.comprobarConsumoEnergetico(consumoEnergetico.getLetra())) {
			this.consumoEnergetico = consumoEnergetico;
		}
		else {
			this.consumoEnergetico = Electrodomestico.defaultConsumo;
		}
	}
	
	private boolean comprobarColor(Color color) {
		switch (color.getColor().toLowerCase()) {
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

	public boolean perteneceArango(double precioDesde, double precioHasta) {
		double precio = this.precioFinal();
		if (precio>precioDesde && precio<precioHasta) {
			return true;
		}
		else return false;
	}
	



}
