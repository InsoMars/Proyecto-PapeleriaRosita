package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class GestionProductosFrame extends JFrame {
	
	
	private GestionProductosPanel gestionProductosPanel;
	
	public GestionProductosFrame(Controller control) {
		
		gestionProductosPanel=new GestionProductosPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		gestionProductosPanel.getBtnAgregarProducto().addActionListener(control);
		gestionProductosPanel.getBtnModificarProducto().addActionListener(control);
		gestionProductosPanel.getBtnVerListaProductos().addActionListener(control);
		gestionProductosPanel.getBtnVolver().addActionListener(control);
		
		add(gestionProductosPanel);

	
	}

	public GestionProductosPanel getGestionProductosPanel() {
		return gestionProductosPanel;
	}

	public void setGestionProductosPanel(GestionProductosPanel gestionProductosPanel) {
		this.gestionProductosPanel = gestionProductosPanel;
	}

	
}
