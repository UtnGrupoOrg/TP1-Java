package util;




import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import entidades.Color;
import entidades.ConsumoEnergetico;
import entidades.Electrodomestico;






public class MyTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] columnNames = {"Electrodomestico","Color","Peso","Consumo Energetico","Precio Base","Precio Final"};
	ArrayList<Electrodomestico> data;
	
	public MyTableModel(ArrayList<Electrodomestico> elecs) {
		data = new ArrayList<Electrodomestico>();
		data.addAll(elecs);
		
	}

	public int getColumnCount() {
		   return columnNames.length;
	}

	public int getRowCount() {
		   return data.size();
	}

	public String getColumnName(int col) {
		    return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		   Electrodomestico elec = data.get(row);
		   switch (col) {
		case 0: return elec; 
		case 1: return elec.getColor();	
		case 2: return elec.getPeso(); 
		case 3: return elec.getConsumoEnergetico(); 
		case 4: return elec.getPrecioBase();
		case 5: return elec.precioFinal();
		default: return "Columna no usada todavia";
			
		}
	}

	public Class<?> getColumnClass(int c) {
		   return getValueAt(0, c).getClass();
	}

		   
	public boolean isCellEditable(int row, int col) {
		        //Note that the data/cell address is constant,
		        //no matter where the cell appears onscreen.
		   if (col < 2) {
		       return false;
		   } else {
		       return true;
		   }
	}

		    /*
		     * Don't need to implement this method unless your table's
		     * data can change.
		     */
	public void setValueAt(Object value, int row, int col) {
		  	Electrodomestico elec = data.get(row);
		  	switch (col) {
			case 1: elec.setColor((Color) value);break;
			case 2: elec.setPeso((float)value);	break;
			case 3: elec.setConsumoEnergetico((ConsumoEnergetico)value); break;
			case 4: elec.setPrecioBase((double) value); break;
			default: try {
					throw new Exception("El indice col no se puede editar");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.notify();
				}
			}
		    fireTableDataChanged();
	}
	
	
		    
}
	

