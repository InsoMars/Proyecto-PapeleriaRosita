package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class ProveedorMenuFrame extends JFrame{
	
	
	private ProveedorMenuPanel proveedorMenuPanel;
	
	
	public ProveedorMenuFrame(Controller control) {
		
		
		proveedorMenuPanel= new ProveedorMenuPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		proveedorMenuPanel.getBtnAgregarProveedor().addActionListener(control);
		proveedorMenuPanel.getBtnModificarProveedor().addActionListener(control);
		proveedorMenuPanel.getBtnVerLista().addActionListener(control);
		proveedorMenuPanel.getBtnVolver().addActionListener(control);
		
		
		add(proveedorMenuPanel);
		

	
	
	}


	public ProveedorMenuPanel getProveedorMenuPanel() {
		return proveedorMenuPanel;
	}


	public void setProveedorMenuPanel(ProveedorMenuPanel proveedorMenuPanel) {
		this.proveedorMenuPanel = proveedorMenuPanel;
	}
	
	

}
