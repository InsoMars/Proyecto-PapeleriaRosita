package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RegistrarCostosGastosFrame extends JFrame {
	
	private RegistrarCostosGastosPanel registrarCostosGastosPanel;
	
	public RegistrarCostosGastosFrame(Controller control) {
		

		registrarCostosGastosPanel=new RegistrarCostosGastosPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(registrarCostosGastosPanel);
		
		registrarCostosGastosPanel.getBtnAgregar().addActionListener(control);
		registrarCostosGastosPanel.getBtnVolver().addActionListener(control);

	
	
	}

	public RegistrarCostosGastosPanel getRegistrarCostosGastosPanel() {
		return registrarCostosGastosPanel;
	}

	public void setRegistrarCostosGastosPanel(RegistrarCostosGastosPanel registrarCostosGastosPanel) {
		this.registrarCostosGastosPanel = registrarCostosGastosPanel;
	}
	
	



}
