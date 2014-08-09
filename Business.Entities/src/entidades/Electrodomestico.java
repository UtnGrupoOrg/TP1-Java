package entidades;

public class Electrodomestico {
	//variables de clase
	static final double defaultPrecioBase=100;
	static final float defaultPeso=5;
	static final Color defaultColor = new Color("blanco");
	static final ConsumoEnergetico defaultConsumo = new ConsumoEnergetico('F');
	// variables de instancia
	protected double precioBase;
	protected float peso;
	protected Color color;
	protected ConsumoEnergetico consumoEnergetico;
	
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
			this.color = new Color(color);
		}
		else {
			this.color = Electrodomestico.defaultColor;
		}
		if (this.comprobarConsumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = new ConsumoEnergetico(consumoEnergetico);
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
