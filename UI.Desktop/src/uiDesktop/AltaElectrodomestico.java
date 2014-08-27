package uiDesktop;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AltaElectrodomestico extends JDialog {

	private final JPanel cpPanel = new JPanel();
	private JComboBox cbxElectrodomestico;
	/*
	public static void main(String[] args) {
		try {
			AltaElectrodomestico dialog = new AltaElectrodomestico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	
	public AltaElectrodomestico(JFrame frame) {
		super(frame);
		this.setLocationRelativeTo(frame);
		this.setModal(true);
		setBounds(100, 100, 529, 396);
		getContentPane().setLayout(new BorderLayout());
		cpPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(cpPanel, BorderLayout.CENTER);
		
		JLabel lblSeleccion = new JLabel("Seleccionar Electrodomestico");
		lblSeleccion.setFont(new Font("Arial", Font.PLAIN, 14));
		
		cbxElectrodomestico = new JComboBox();
		cbxElectrodomestico.setFont(new Font("Arial", Font.PLAIN, 13));
		this.inicia();
		GroupLayout gl_cpPanel = new GroupLayout(cpPanel);
		gl_cpPanel.setHorizontalGroup(
			gl_cpPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_cpPanel.createSequentialGroup()
					.addGap(171)
					.addGroup(gl_cpPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(cbxElectrodomestico, Alignment.LEADING, 0, 186, Short.MAX_VALUE)
						.addComponent(lblSeleccion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(146))
		);
		gl_cpPanel.setVerticalGroup(
			gl_cpPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_cpPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeleccion)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbxElectrodomestico, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(250, Short.MAX_VALUE))
		);
		cpPanel.setLayout(gl_cpPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnAceptar = new JButton("Aceptar");
				btnAceptar.setActionCommand("OK");
				buttonPane.add(btnAceptar);
				getRootPane().setDefaultButton(btnAceptar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
	public void inicia()
	{
		this.cbxElectrodomestico.addItem("Lavarropas");
		this.cbxElectrodomestico.addItem("Televisor");
	}
}
