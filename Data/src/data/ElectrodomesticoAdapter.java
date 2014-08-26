package data;

import java.util.ArrayList;

import entidades.Color;
import entidades.ConsumoEnergetico;
import entidades.Electrodomestico;

public class ElectrodomesticoAdapter {
	private static ArrayList<Electrodomestico> electrodomesticos;
	
	public ElectrodomesticoAdapter() {
		ElectrodomesticoAdapter.electrodomesticos = new ArrayList<Electrodomestico>();
		electrodomesticos.add(new Electrodomestico(50,5,new Color("blanco"),new ConsumoEnergetico('A', 20)));
	}
	
	public ArrayList<Electrodomestico> getAll() {
		return electrodomesticos;
	}

	public void guardarElectroomestico(Electrodomestico electrodomestico) {
		electrodomesticos.add(electrodomestico);
	}

	public ArrayList<Electrodomestico> getAll(double precioDesde,
			double precioHasta) {
		
		ArrayList<Electrodomestico> electrodomesticosEnRango = new ArrayList<Electrodomestico>();
		
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico.perteneceArango(precioDesde , precioHasta)) { 
				electrodomesticosEnRango.add(electrodomestico);
			}
		}
		
		return electrodomesticosEnRango;
	}

	
	
	

}

	
