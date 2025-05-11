package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class MenuVendedorFrame extends JFrame{
	
	private MenuVendedorPanel menuVendedorPanel;
	
	public MenuVendedorFrame(Controller control) {
		
		menuVendedorPanel= new MenuVendedorPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(menuVendedorPanel);
		
		menuVendedorPanel.getBtnCerrarSesion().addActionListener(control);
		menuVendedorPanel.getBtnCierreCaja().addActionListener(control);
		menuVendedorPanel.getBtnDirectorioProd().addActionListener(control);
		menuVendedorPanel.getBtnGestionProd().addActionListener(control);
		menuVendedorPanel.getBtnRegCostosGastos().addActionListener(control);
		menuVendedorPanel.getBtnVentas().addActionListener(control);
		
		
		
		
		
	}

	public MenuVendedorPanel getMenuVendedorPanel() {
		return menuVendedorPanel;
	}

	public void setMenuVendedorPanel(MenuVendedorPanel menuVendedorPanel) {
		this.menuVendedorPanel = menuVendedorPanel;
	}
	
	
	
	
	

}
