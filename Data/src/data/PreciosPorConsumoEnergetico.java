package data;

import java.util.ArrayList;

import entidades.*;

public class PreciosPorConsumoEnergetico {
	
	

	private static  ArrayList<ConsumoEnergetico> listaPrecios = inicializaLista();

	private static ArrayList<ConsumoEnergetico> inicializaLista() {
		ArrayList<ConsumoEnergetico> lista = new ArrayList<ConsumoEnergetico>();
		lista.add(new ConsumoEnergetico('A', 100));
		lista.add(new ConsumoEnergetico('B', 80));
		lista.add(new ConsumoEnergetico('C', 60));
		lista.add(new ConsumoEnergetico('D', 50));
		lista.add(new ConsumoEnergetico('E', 30));
		lista.add(new ConsumoEnergetico('F', 10));
		
		return lista;
	}

	
	
	

}
