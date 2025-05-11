package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.unbosque.controller.Controller;

public class ProveedorListaFrame extends JFrame {
	
	
private ProveedorListaPanel ProveedorListaPanel;
	
	
	public ProveedorListaFrame(Controller control) {
		
		

		ProveedorListaPanel=new ProveedorListaPanel();
		setTitle("Sistema de Información Papeleria Rosita- Proveedor");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(ProveedorListaPanel);
		
		
		ProveedorListaPanel.getBtnEliminarProveedor().addActionListener(control);
		ProveedorListaPanel.getBtnModificarProveedor().addActionListener(control);
		ProveedorListaPanel.getBtnVolver().addActionListener(control);
		
	}


	public ProveedorListaPanel getProveedorListaPanel() {
		return ProveedorListaPanel;
	}


	public void setProveedorListaPanel(ProveedorListaPanel ProveedorListaPanel) {
		this.ProveedorListaPanel = ProveedorListaPanel;
	}
	
	

}


	
	

