package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VendedorAdmonListaFrame extends JFrame {
	
	private VendedorAdmonListaPanel vendedorListaPanel;
	
	
	public VendedorAdmonListaFrame(Controller control) {

		vendedorListaPanel=new VendedorAdmonListaPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(vendedorListaPanel);
		
		
		vendedorListaPanel.getBtnEliminarVendedor().addActionListener(control);
		vendedorListaPanel.getBtnModificarVendedor().addActionListener(control);
		vendedorListaPanel.getBtnVolver().addActionListener(control);
		
	}


	public VendedorAdmonListaPanel getVendedorListaPanel() {
		return vendedorListaPanel;
	}


	public void setVendedorListaPanel(VendedorAdmonListaPanel vendedorListaPanel) {
		this.vendedorListaPanel = vendedorListaPanel;
	}
	
	

}
