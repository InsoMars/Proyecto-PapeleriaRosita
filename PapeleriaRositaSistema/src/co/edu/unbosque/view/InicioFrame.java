package co.edu.unbosque.view;


import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class InicioFrame extends JFrame {
	
	private InicioPanel panelInicial;
	
	
	public InicioFrame(Controller control) {
		
		
		panelInicial= new InicioPanel();
		setTitle("Sistema de Información Papeleria Rosita");
		setVisible(true);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panelInicial.getBtnAdmin().addActionListener(control);
		panelInicial.getBtnVendedor().addActionListener(control);
		panelInicial.getBtnManualUsuario().addActionListener(control);
		
		add(panelInicial);
	}


	public InicioPanel getPanelInicial() {
		return panelInicial;
	}


	public void setPanelInicial(InicioPanel panelInicial) {
		this.panelInicial = panelInicial;
	}
	
	
	

}
