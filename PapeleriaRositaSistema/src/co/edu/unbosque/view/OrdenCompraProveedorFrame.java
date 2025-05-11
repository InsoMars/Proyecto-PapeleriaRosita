package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class OrdenCompraProveedorFrame extends JFrame {

	private OrdenCompraProveedorPanel ordenCompraProveedorPanel;

	public OrdenCompraProveedorFrame(Controller control) {

		ordenCompraProveedorPanel = new OrdenCompraProveedorPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300, 800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);

		add(ordenCompraProveedorPanel);

		ordenCompraProveedorPanel.getBtnAgregarOrdenProveedor().addActionListener(control);
		ordenCompraProveedorPanel.getBtnModificarOrdenProveedor().addActionListener(control);
		ordenCompraProveedorPanel.getBtnVerListaOrdenProveedor().addActionListener(control);
		ordenCompraProveedorPanel.getBtnVolver().addActionListener(control);

	}

	
	
	public OrdenCompraProveedorPanel getOrdenCompraProveedorPanel() {
		return ordenCompraProveedorPanel;
	}

	public void setOrdenCompraProveedorPanel(OrdenCompraProveedorPanel ordenCompraProveedorPanel) {
		this.ordenCompraProveedorPanel = ordenCompraProveedorPanel;
	}

}
