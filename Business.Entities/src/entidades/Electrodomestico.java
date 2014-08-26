package entidades;

import java.util.ArrayList;

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
	private ArrayList<Peso_Precio> preciosPorPeso;
	
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

	private void inicializaPreciosPeso() {
		this.preciosPorPeso = new ArrayList<Peso_Precio>();
		this.preciosPorPeso.add(new Peso_Precio(0, 20,10));
		this.preciosPorPeso.add(new Peso_Precio(20, 50,50));
		this.preciosPorPeso.add(new Peso_Precio(50, 79,80));
		this.preciosPorPeso.add(new Peso_Precio(80,100));
		
	}
	
	public Electrodomestico() {
		this.inicializaPreciosPeso();
		
		this.precioBase = Electrodomestico.defaultPrecioBase;
		this.peso = Electrodomestico.defaultPeso;
		this.color = defaultColor;
		this.consumoEnergetico = Electrodomestico.defaultConsumo;
	}

	public Electrodomestico(double precioBase, float peso) {
		this.inicializaPreciosPeso();
		
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = defaultColor;
		this.consumoEnergetico = defaultConsumo;
	}

	public Electrodomestico(double precioBase, float peso, Color color,
			ConsumoEnergetico consumoEnergetico) {
		this.inicializaPreciosPeso();
		
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

	public double precioFinal() {
		return this.precioBase+this.consumoEnergetico.getPrecio()+this.getPrecioPeso(this.peso);
	}

	private double getPrecioPeso(float peso) {
		double precio=-1;
		for (Peso_Precio peso_Precio : preciosPorPeso) {
			
			if(peso>=peso_Precio.getPesoDesde() && (peso<=peso_Precio.getPesoHasta() || peso_Precio.getPesoHasta()== Peso_Precio.SIN_PESO_HASTA)) {
				precio = peso_Precio.getPrecio();
				break;
			}
		}
		return precio;
		
	}
	
	
	



}
