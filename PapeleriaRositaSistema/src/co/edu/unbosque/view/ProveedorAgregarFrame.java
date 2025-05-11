package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class ProveedorAgregarFrame extends JFrame {
	
	private ProveedorAgregarPanel proveedorAgregarPanel;
	
	public ProveedorAgregarFrame(Controller control) {

	
		proveedorAgregarPanel=new ProveedorAgregarPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(proveedorAgregarPanel);
		
		proveedorAgregarPanel.getBtnAgregar().addActionListener(control);
		proveedorAgregarPanel.getBtnVolver().addActionListener(control);
	
	}

	public ProveedorAgregarPanel getProveedorAgregarPanel() {
		return proveedorAgregarPanel;
	}

	public void setProveedorAgregarPanel(ProveedorAgregarPanel proveedorAgregarPanel) {
		this.proveedorAgregarPanel = proveedorAgregarPanel;
	}

	
	
}
