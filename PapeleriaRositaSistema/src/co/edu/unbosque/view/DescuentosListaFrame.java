package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class DescuentosListaFrame extends JFrame{
	
	private DescuentosListaPanel descuentosListaPanel;
	
	
	public DescuentosListaFrame(Controller control) {


		descuentosListaPanel=new DescuentosListaPanel();
		setTitle("Sistema de Información Papeleria Rosita- Descuentos");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(descuentosListaPanel);
		
		
		descuentosListaPanel.getBtnEliminarDescuentos().addActionListener(control);
		descuentosListaPanel.getBtnModificarDescuentos().addActionListener(control);
		descuentosListaPanel.getBtnVolver().addActionListener(control);
		
	
	
	}


	public DescuentosListaPanel getDescuentosListaPanel() {
		return descuentosListaPanel;
	}


	public void setDescuentosListaPanel(DescuentosListaPanel descuentosListaPanel) {
		this.descuentosListaPanel = descuentosListaPanel;
	}
	
	

}
