package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class AgregarProductosFrame extends JFrame {
	
	private AgregarProductosPanel agregarProductosPanel;
	
	
	public AgregarProductosFrame(Controller control) {
		
		agregarProductosPanel= new AgregarProductosPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(agregarProductosPanel);
		
		
		agregarProductosPanel.getBtnAgregar().addActionListener(control);
		agregarProductosPanel.getBtnVolver().addActionListener(control);

	
	
	}


	public AgregarProductosPanel getAgregarProductosPanel() {
		return agregarProductosPanel;
	}


	public void setAgregarProductosPanel(AgregarProductosPanel agregarProductosPanel) {
		this.agregarProductosPanel = agregarProductosPanel;
	}
	
	

}
