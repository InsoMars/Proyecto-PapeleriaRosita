package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class DescuentosAgregarFrame extends JFrame{
	
	
	private DescuentosAgregarPanel descuentosAgregarPanel;
	
	
	
	public DescuentosAgregarFrame(Controller control) {

		descuentosAgregarPanel=new DescuentosAgregarPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(descuentosAgregarPanel);
		
		descuentosAgregarPanel.getBtnAgregar().addActionListener(control);
		descuentosAgregarPanel.getBtnVolver().addActionListener(control);
	
	
	}



	public DescuentosAgregarPanel getDescuentosAgregarPanel() {
		return descuentosAgregarPanel;
	}



	public void setDescuentosAgregarPanel(DescuentosAgregarPanel descuentosAgregarPanel) {
		this.descuentosAgregarPanel = descuentosAgregarPanel;
	}

	
}
