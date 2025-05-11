package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class OrdenCompraProveedorListaFrame extends JFrame{
	
	private OrdenCompraProveedorListaPanel ordenCompraProveedorListaPanel;
	
	
	public OrdenCompraProveedorListaFrame(Controller control) {

	ordenCompraProveedorListaPanel=new OrdenCompraProveedorListaPanel();
	setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
	setVisible(false);
	setSize(1300,800);
	setResizable(false);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	setLocationRelativeTo(null);
	
	add(ordenCompraProveedorListaPanel);
	
	ordenCompraProveedorListaPanel.getBtnBuscarOrdenCompra().addActionListener(control);
	ordenCompraProveedorListaPanel.getBtnEliminarOrdenCompra().addActionListener(control);
	ordenCompraProveedorListaPanel.getBtnModificarOrdenCompra().addActionListener(control);
	ordenCompraProveedorListaPanel.getBtnvolver().addActionListener(control);
	
	
	
	}


	public OrdenCompraProveedorListaPanel getOrdenCompraProveedorListaPanel() {
		return ordenCompraProveedorListaPanel;
	}


	public void setOrdenCompraProveedorListaPanel(OrdenCompraProveedorListaPanel ordenCompraProveedorListaPanel) {
		this.ordenCompraProveedorListaPanel = ordenCompraProveedorListaPanel;
	}
	
	

}
