package logicaNegocio;

import java.util.ArrayList;



import data.*;
import entidades.Electrodomestico;


public class ElectrodomesticoLogic {
	private ElectrodomesticoAdapter daoElectrodomestico;
	
	
	public ElectrodomesticoLogic() {
		this.daoElectrodomestico = new ElectrodomesticoAdapter();
		
	}
	
	public ArrayList<Electrodomestico> getAll() {
		return daoElectrodomestico.getAll();
	}
	
	public ArrayList<Electrodomestico> getAll(double precioDesde,double precioHasta) {
		return daoElectrodomestico.getAll( precioDesde, precioHasta);
	}
	
	public void guardarElectrodomestico(Electrodomestico electrodomestico) {
		this.daoElectrodomestico.guardarElectroomestico(electrodomestico);
	}
	
	

}
