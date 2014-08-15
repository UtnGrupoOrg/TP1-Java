package data;

import java.util.ArrayList;

import entidades.Peso_Precio;

public class PrecioPorPeso {
	
	private static ArrayList<Peso_Precio> listaPrecios = inicializaLista();

	private static ArrayList<Peso_Precio> inicializaLista() {
		listaPrecios.add(new Peso_Precio(0, 20, 10));
		listaPrecios.add(new Peso_Precio(20, 50, 50));
		listaPrecios.add(new Peso_Precio(50, 80, 80));
		listaPrecios.add(new Peso_Precio(80, 100));
		
		return listaPrecios;
	}

	public double getPrecio(float peso) {
		double precio=0;
		
		for (Peso_Precio peso_Precio : listaPrecios) {
			if (this.dentroDeRangoDePesoPrecio(peso,peso_Precio)) {
				precio = peso_Precio.getPrecio();
			}
		}
		return precio;
	}

	private boolean dentroDeRangoDePesoPrecio(float peso,
			Peso_Precio peso_Precio) {
		float desde=peso_Precio.getPesoDesde(), hasta=peso_Precio.getPesoHasta();
		boolean bool=false;
		
		if (peso > desde && (peso<hasta || hasta==-1 )) {
			bool = true;
		}
		return bool;
	}
}
