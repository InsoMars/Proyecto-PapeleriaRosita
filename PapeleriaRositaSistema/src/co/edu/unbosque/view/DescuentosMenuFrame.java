package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class DescuentosMenuFrame extends JFrame {
	
	private DescuentosMenuPanel descuentosMenuPanel;
	
	
	public DescuentosMenuFrame(Controller control) {
		
		descuentosMenuPanel=new DescuentosMenuPanel();
		
		setTitle("Sistema de Información Papeleria Rosita- Proveedor");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(descuentosMenuPanel);
		
		
		descuentosMenuPanel.getBtnAgregarDescuentos().addActionListener(control);
		descuentosMenuPanel.getBtnModificarDescuentos().addActionListener(control);
		descuentosMenuPanel.getBtnVerLista().addActionListener(control);
		descuentosMenuPanel.getBtnVolver().addActionListener(control);
	}


	public DescuentosMenuPanel getDescuentosMenuPanel() {
		return descuentosMenuPanel;
	}


	public void setDescuentosMenuPanel(DescuentosMenuPanel descuentosMenuPanel) {
		this.descuentosMenuPanel = descuentosMenuPanel;
	}

}
