package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class CostosGastosMenuFrame extends JFrame{
	
	
	private CostosGastosMenuPanel costosGastosMenuPanel; 
	
	public CostosGastosMenuFrame(Controller control) {
		
		costosGastosMenuPanel=new CostosGastosMenuPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(costosGastosMenuPanel);
		
		costosGastosMenuPanel.getBtnActualizarCostoGasto().addActionListener(control);
		costosGastosMenuPanel.getBtnAgregarCostoGasto().addActionListener(control);
		costosGastosMenuPanel.getBtnEliminarCostoGasto().addActionListener(control);
		costosGastosMenuPanel.getBtnVolver().addActionListener(control);
		

	
	}

	public CostosGastosMenuPanel getCostosGastosMenuPanel() {
		return costosGastosMenuPanel;
	}

	public void setCostosGastosMenuPanel(CostosGastosMenuPanel costosGastosMenuPanel) {
		this.costosGastosMenuPanel = costosGastosMenuPanel;
	}
	
	
	

}
