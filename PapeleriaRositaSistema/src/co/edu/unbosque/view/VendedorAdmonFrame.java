package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class VendedorAdmonFrame extends JFrame {
	
	private VendedorAdmonPanel vendedorPanel;
	
	public VendedorAdmonFrame(Controller control) {
	
		vendedorPanel=new VendedorAdmonPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		vendedorPanel.getBtnAgregarVendedor().addActionListener(control);
		vendedorPanel.getBtnModificarVendedor().addActionListener(control);
		vendedorPanel.getBtnVerLista().addActionListener(control);
		vendedorPanel.getBtnVolver().addActionListener(control);
		
		add(vendedorPanel);
	}

	public VendedorAdmonPanel getVendedorPanel() {
		return vendedorPanel;
	}

	public void setVendedorPanel(VendedorAdmonPanel vendedorPanel) {
		this.vendedorPanel = vendedorPanel;
	}

}
