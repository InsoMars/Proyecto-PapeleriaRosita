package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class ProductosListaFrame extends JFrame {

	
	private ProductosListaPanel productosListaPanel;
	
	
	public ProductosListaFrame(Controller control) {
		
		
		productosListaPanel=new ProductosListaPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(productosListaPanel);
		
		
		productosListaPanel.getBtnEliminarProductos().addActionListener(control);
		productosListaPanel.getBtnModificarProducto().addActionListener(control);
		productosListaPanel.getBtnVolver().addActionListener(control);
		

	
	
	}


	public ProductosListaPanel getProductosListaPanel() {
		return productosListaPanel;
	}


	public void setProductosListaPanel(ProductosListaPanel productosListaPanel) {
		this.productosListaPanel = productosListaPanel;
	}
	
	
}
