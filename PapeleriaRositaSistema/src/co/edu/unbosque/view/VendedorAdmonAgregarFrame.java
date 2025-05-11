package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VendedorAdmonAgregarFrame extends JFrame{
	
	private VendedorAdmongregarPanel vendedorAgregarPanel;
	
	
	public VendedorAdmonAgregarFrame(Controller control) {
	
		vendedorAgregarPanel= new VendedorAdmongregarPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(vendedorAgregarPanel);
		
		
		vendedorAgregarPanel.getBtnAgregar().addActionListener(control);
		vendedorAgregarPanel.getBtnVolver().addActionListener(control);
		
		
	}


	public VendedorAdmongregarPanel getVendedorAgregarPanel() {
		return vendedorAgregarPanel;
	}


	public void setVendedorAgregarPanel(VendedorAdmongregarPanel vendedorAgregarPanel) {
		this.vendedorAgregarPanel = vendedorAgregarPanel;
	}
	
	

}
