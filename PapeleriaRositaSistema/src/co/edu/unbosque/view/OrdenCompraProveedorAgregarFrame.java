package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class OrdenCompraProveedorAgregarFrame extends JFrame {
	
	private OrdenCompraProveedorAgregarPanel ordenAgregarCompraProveedorPanel;
	
	
	public OrdenCompraProveedorAgregarFrame(Controller control) {
		
		ordenAgregarCompraProveedorPanel=new OrdenCompraProveedorAgregarPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(ordenAgregarCompraProveedorPanel);
		
		ordenAgregarCompraProveedorPanel.getBtnAgregarOrdenCompra().addActionListener(control);
		ordenAgregarCompraProveedorPanel.getBtnVolver().addActionListener(control);

	
	
	}


	public OrdenCompraProveedorAgregarPanel getOrdenAgregarCompraProveedorPanel() {
		return ordenAgregarCompraProveedorPanel;
	}


	public void setOrdenAgregarCompraProveedorPanel(OrdenCompraProveedorAgregarPanel ordenAgregarCompraProveedorPanel) {
		this.ordenAgregarCompraProveedorPanel = ordenAgregarCompraProveedorPanel;
	}

	

}
