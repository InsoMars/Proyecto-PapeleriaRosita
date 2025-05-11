package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrdenCompraProveedorListaPanel extends JPanel {

	private JLabel wallcreate;
	private JButton btnvolver, btnModificarOrdenCompra, btnEliminarOrdenCompra, btnBuscarOrdenCompra;
	public static final String ModificarOrdenCompra = "ModificarOrdenCompra";
	public static final String volverOrdenCompraProveedorLista = "volverOrdenCompraProveedorLista";
	public static final String eliminarOrdenCompra = "eliminarOrdenCompra";
	public static final String buscarOrdenCompra = "buscarOrdenCompra";

	public OrdenCompraProveedorListaPanel() {
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/ordenCompraLista.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnBuscarOrdenCompra = new JButton();
		btnBuscarOrdenCompra.setBounds(870, 225, 80, 70);
		btnBuscarOrdenCompra.setBackground(Color.white);
		btnBuscarOrdenCompra.setForeground(Color.WHITE);
		btnBuscarOrdenCompra.setOpaque(false);

		btnBuscarOrdenCompra.setActionCommand(ModificarOrdenCompra);

		btnModificarOrdenCompra = new JButton();
		btnModificarOrdenCompra.setBounds(1100, 400, 150, 80);
		btnModificarOrdenCompra.setBackground(Color.white);
		btnModificarOrdenCompra.setForeground(Color.WHITE);
		btnModificarOrdenCompra.setOpaque(false);

		btnModificarOrdenCompra.setActionCommand(ModificarOrdenCompra);

		btnEliminarOrdenCompra = new JButton();
		btnEliminarOrdenCompra.setBounds(1100, 520, 150, 80);
		btnEliminarOrdenCompra.setBackground(Color.white);
		btnEliminarOrdenCompra.setForeground(Color.WHITE);
		btnEliminarOrdenCompra.setOpaque(false);

		btnEliminarOrdenCompra.setActionCommand(eliminarOrdenCompra);

		btnvolver = new JButton();
		btnvolver.setBounds(50, 590, 100, 100);
		btnvolver.setBackground(Color.yellow);
		btnvolver.setForeground(Color.yellow);
		btnvolver.setOpaque(false);

		btnvolver.setActionCommand(volverOrdenCompraProveedorLista);
		
		
		
		add(wallcreate);
		add(btnBuscarOrdenCompra);
		add(btnEliminarOrdenCompra);
		add(btnModificarOrdenCompra);
		add(btnvolver);


	}

	public JLabel getWallcreate() {
		return wallcreate;
	}

	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}

	public JButton getBtnvolver() {
		return btnvolver;
	}

	public void setBtnvolverOrdenCompraProveedorLista(JButton btnvolver) {
		this.btnvolver = btnvolver;
	}

	public JButton getBtnModificarOrdenCompra() {
		return btnModificarOrdenCompra;
	}

	public void setBtnModificarOrdenCompra(JButton btnModificarOrdenCompra) {
		this.btnModificarOrdenCompra = btnModificarOrdenCompra;
	}

	public JButton getBtnEliminarOrdenCompra() {
		return btnEliminarOrdenCompra;
	}

	public void setBtnEliminarOrdenCompra(JButton btnEliminarOrdenCompra) {
		this.btnEliminarOrdenCompra = btnEliminarOrdenCompra;
	}

	public JButton getBtnBuscarOrdenCompra() {
		return btnBuscarOrdenCompra;
	}

	public void setBtnBuscarOrdenCompra(JButton btnBuscarOrdenCompra) {
		this.btnBuscarOrdenCompra = btnBuscarOrdenCompra;
	}

	public static String getModificarordencompra() {
		return ModificarOrdenCompra;
	}

	public static String getvolverOrdenCompraProveedorLista() {
		return volverOrdenCompraProveedorLista;
	}

	public static String getEliminarordencompra() {
		return eliminarOrdenCompra;
	}

	public static String getBuscarordencompra() {
		return buscarOrdenCompra;
	}
	
	
}
