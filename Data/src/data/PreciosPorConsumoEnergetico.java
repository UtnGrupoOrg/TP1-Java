package data;

import java.util.ArrayList;
import entidades.*;

public class PreciosPorConsumoEnergetico {
	
	

	private static  ArrayList<ConsumoEnergetico_Precio> listaPrecios = inicializaLista();

	private static ArrayList<ConsumoEnergetico_Precio> inicializaLista() {
		ArrayList<ConsumoEnergetico_Precio> lista = new ArrayList<ConsumoEnergetico_Precio>();
		lista.add(new ConsumoEnergetico_Precio('A', 100));
		lista.add(new ConsumoEnergetico_Precio('B', 80));
		lista.add(new ConsumoEnergetico_Precio('C', 60));
		lista.add(new ConsumoEnergetico_Precio('D', 50));
		lista.add(new ConsumoEnergetico_Precio('E', 30));
		lista.add(new ConsumoEnergetico_Precio('F', 10));
		
		return lista;
	}

	public double getPrecio(char consumoEnergetico) {
		double precio=0;
		for (ConsumoEnergetico_Precio consumoEnergetico_Precio : listaPrecios) {
			if (consumoEnergetico_Precio.getConsumo()==consumoEnergetico) {
				precio = consumoEnergetico_Precio.getPrecio();
			}
		}
		return precio;
	}
	
	
	

}
