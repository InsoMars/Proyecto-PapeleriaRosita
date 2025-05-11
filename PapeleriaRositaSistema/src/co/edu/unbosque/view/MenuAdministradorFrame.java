package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class MenuAdministradorFrame extends JFrame {
	
	
	private MenuAdministradorPanel menuAdministradorPanel;
	
	
	
	public MenuAdministradorFrame(Controller control) {
		
		
		menuAdministradorPanel=new MenuAdministradorPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(menuAdministradorPanel);
		
		
		menuAdministradorPanel.getBtnCerrarSesion().addActionListener(control);
		menuAdministradorPanel.getBtnDescuentos().addActionListener(control);
		menuAdministradorPanel.getBtnGenReportes().addActionListener(control);
		menuAdministradorPanel.getBtnOrdCompraProveedores().addActionListener(control);
		menuAdministradorPanel.getBtnProveedores().addActionListener(control);
		menuAdministradorPanel.getBtnRecordatorios().addActionListener(control);
		menuAdministradorPanel.getBtnVendedores().addActionListener(control);
		menuAdministradorPanel.getBtnVolver().addActionListener(control);
		
	}



	public MenuAdministradorPanel getMenuAdministradorPanel() {
		return menuAdministradorPanel;
	}



	public void setMenuAdministradorPanel(MenuAdministradorPanel menuAdministradorPanel) {
		this.menuAdministradorPanel = menuAdministradorPanel;
	}
	
	

}
