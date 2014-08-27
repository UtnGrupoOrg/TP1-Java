package uiDesktop;


import javax.swing.JFrame;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;


import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableModel;



import util.MyTableModel;





import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import logicaNegocio.ElectrodomesticoLogic;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frame;
	
	private ElectrodomesticoLogic controlador;
	private JScrollPane scrollPane;
	private TableModel tableModel;
	

	/**
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 */
	public Inicio() {
		
		controlador = new ElectrodomesticoLogic();
		tableModel = new MyTableModel(controlador.getAll());
		initialize();
		
	}
	
	public void show() {
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
			}
		});
		frame.setResizable(false);
		frame.setBounds(100, 100, 565, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnAcciones = new JMenu("Acciones");
		menuBar.add(mnAcciones);
		
		JMenuItem mntmAgregarElectrodomestico = new JMenuItem("Agregar Electrodomestico");
		mnAcciones.add(mntmAgregarElectrodomestico);
		
		JMenuItem mntmModificarElectrodomestico = new JMenuItem("Modificar Electrodomestico");
		mnAcciones.add(mntmModificarElectrodomestico);
		
		JMenuItem mntmEliminarElectrodomestico = new JMenuItem("Eliminar Electrodomestico");
		mnAcciones.add(mntmEliminarElectrodomestico);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AltaElectrodomestico alta=new AltaElectrodomestico();
				alta.show();
			}
		});
		btnAgregar.setBounds(32, 237, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(133, 237, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(332, 237, 89, 23);
		frame.getContentPane().add(btnEliminar);
		
		scrollPane = new JScrollPane(new JTable(tableModel));
		scrollPane.setBounds(6, 6, 547, 219);
		frame.getContentPane().add(scrollPane);
	}
}
