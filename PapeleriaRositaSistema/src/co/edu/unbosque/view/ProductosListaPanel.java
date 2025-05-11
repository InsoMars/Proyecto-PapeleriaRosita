package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProductosListaPanel extends JPanel {
	
	
	private JLabel wallcreate;
	private JButton btnVolver,btnAgregarNuevoProducto, btnEliminarProductos, btnModificarProducto;	
	public static final String ModificarProductos = "ModificarProductos";
	public static final String AgregarNuevoProducto="AgregarNuevoProducto";
	public static final String volverProductosLista = "volverProductosLista";
	public static final String eliminarProductos= "eliminarProductos";	
	public static final String modificarProductos= "modificarProductos";

	
	public ProductosListaPanel() {
		
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listadoProductos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnAgregarNuevoProducto=new JButton();
		btnAgregarNuevoProducto.setBounds(1090, 362, 190, 70);
		btnAgregarNuevoProducto.setBackground(Color.white);
		btnAgregarNuevoProducto.setForeground(Color.WHITE);
		btnAgregarNuevoProducto.setOpaque(false);
		btnAgregarNuevoProducto.setActionCommand(AgregarNuevoProducto);
		
		
		btnModificarProducto = new JButton();
		btnModificarProducto.setBounds(855, 190, 80, 70);
		btnModificarProducto.setBackground(Color.white);
		btnModificarProducto.setForeground(Color.WHITE);
		btnModificarProducto.setOpaque(false);
		
		btnModificarProducto.setActionCommand(ModificarProductos);
		
		
		
		btnEliminarProductos = new JButton();
		btnEliminarProductos.setBounds(1115, 570, 150, 80);
		btnEliminarProductos .setBackground(Color.white);
		btnEliminarProductos .setForeground(Color.WHITE);
		btnEliminarProductos .setOpaque(false);
		
		btnEliminarProductos.setActionCommand(eliminarProductos);
		
		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverProductosLista);

		
		
		add(wallcreate);
		add(btnAgregarNuevoProducto);
		add(btnModificarProducto);
		add(btnVolver);
		add(btnEliminarProductos);
	

	
		
	}


	public JLabel getWallcreate() {
		return wallcreate;
	}


	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}


	public JButton getBtnVolver() {
		return btnVolver;
	}


	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}





	public JButton getBtnAgregarNuevoProducto() {
		return btnAgregarNuevoProducto;
	}


	public void setBtnAgregarNuevoProducto(JButton btnAgregarNuevoProducto) {
		this.btnAgregarNuevoProducto = btnAgregarNuevoProducto;
	}


	public JButton getBtnEliminarProductos() {
		return btnEliminarProductos;
	}


	public void setBtnEliminarProductos(JButton btnEliminarProductos) {
		this.btnEliminarProductos = btnEliminarProductos;
	}


	public JButton getBtnModificarProducto() {
		return btnModificarProducto;
	}


	public void setBtnModificarProducto(JButton btnModificarProducto) {
		this.btnModificarProducto = btnModificarProducto;
	}




	public static String getAgregarnuevoproducto() {
		return AgregarNuevoProducto;
	}


	public static String getVolver() {
		return volverProductosLista;
	}


	public static String getEliminarproductos() {
		return eliminarProductos;
	}


	public static String getModificarproductos() {
		return modificarProductos;
	}
	
	
	
	
}