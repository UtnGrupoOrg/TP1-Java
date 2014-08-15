package logicaNegocio;

import data.PrecioPorPeso;
import data.PreciosPorConsumoEnergetico;

import entidades.Electrodomestico;

public class ElectrodomesticoLogic {
	
	private PreciosPorConsumoEnergetico oPreciosConsumo;
	private PrecioPorPeso oPreciosPeso;
	
	public ElectrodomesticoLogic() {
		this.oPreciosConsumo = new PreciosPorConsumoEnergetico();
		this.oPreciosPeso = new PrecioPorPeso();
	}
	
	public double calculaPrecioFinal(Electrodomestico electrodomestico) {
		double precio= this.oPreciosConsumo.getPrecio(electrodomestico.getConsumoEnergetico())
				+ this.oPreciosPeso.getPrecio(electrodomestico.getPeso());
		
		return precio;
	}
}
