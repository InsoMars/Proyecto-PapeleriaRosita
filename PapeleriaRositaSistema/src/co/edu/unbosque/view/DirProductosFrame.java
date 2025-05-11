package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class DirProductosFrame extends JFrame {
	
	private DirProductosPanel dirProductosPanel;
	
	public DirProductosFrame(Controller control) {
		
		
		dirProductosPanel=new DirProductosPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(dirProductosPanel);
		
		dirProductosPanel.getBtnBuscarProducto().addActionListener(control);
		dirProductosPanel.getBtnVolver().addActionListener(control);
		
	}

	public DirProductosPanel getDirProductosPanel() {
		return dirProductosPanel;
	}

	public void setDirProductosPanel(DirProductosPanel dirProductosPanel) {
		this.dirProductosPanel = dirProductosPanel;
	}
	

}
