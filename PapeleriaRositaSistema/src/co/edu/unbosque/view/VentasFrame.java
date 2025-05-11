package co.edu.unbosque.view;

import java.awt.Panel;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VentasFrame extends JFrame{
	
	private VentasPanel ventasPanel;
	
	public VentasFrame(Controller control) {
		// TODO Auto-generated constructor stub
		
		ventasPanel=new VentasPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		ventasPanel.getBtnAgregarArticulo().addActionListener(control);
		ventasPanel.getBtnBorrarArticulo().addActionListener(control);
		ventasPanel.getBtnCancelarCompra().addActionListener(control);
		ventasPanel.getBtnDevoluciones().addActionListener(control);
		ventasPanel.getBtnLimpiar().addActionListener(control);
		ventasPanel.getBtnRegVenta().addActionListener(control);
		ventasPanel.getBtnvolverVentas().addActionListener(control);
		
		add(ventasPanel);
		
	}
	
	

	public VentasPanel getVentasPanel() {
		return ventasPanel;
	}

	public void setVentasPanel(VentasPanel ventasPanel) {
		this.ventasPanel = ventasPanel;
	}
	
	

}
