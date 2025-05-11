package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GestionProductosPanel extends JPanel {

	private JLabel wallcreate;
	private JButton btnAgregarProducto, btnVerListaProductos, btnModificarProducto, btnVolver;
	public static final String AgregarProducto = "AgregarProducto";
	public static final String VerListaProductos = "VerListaProductos";
	public static final String ModificarProducto = "ModificarProducto";
	public static final String volverGestionProductos = "volverGestionProductos";

	public GestionProductosPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/gestionProductosMenu.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnAgregarProducto = new JButton();
		btnAgregarProducto.setBounds(355, 435, 175, 153);
		btnAgregarProducto.setBackground(Color.white);
		btnAgregarProducto.setForeground(Color.WHITE);
		btnAgregarProducto.setOpaque(false);

		btnAgregarProducto.setActionCommand(AgregarProducto);

		btnVerListaProductos = new JButton();
		btnVerListaProductos.setBounds(570, 435, 180, 153);
		btnVerListaProductos.setBackground(Color.blue);
		btnVerListaProductos.setForeground(Color.blue);
		btnVerListaProductos.setOpaque(false);

		btnVerListaProductos.setActionCommand(VerListaProductos);

		btnModificarProducto = new JButton();
		btnModificarProducto.setBounds(785, 435, 185, 153);
		btnModificarProducto.setBackground(Color.yellow);
		btnModificarProducto.setForeground(Color.yellow);
		btnModificarProducto.setOpaque(false);
		btnModificarProducto.setActionCommand(ModificarProducto);

		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverGestionProductos);

		add(wallcreate);
		add(btnVolver);
		add(btnAgregarProducto);
		add(btnModificarProducto);
		add(btnVerListaProductos);

	}

	public JLabel getWallcreate() {
		return wallcreate;
	}

	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}

	public JButton getBtnAgregarProducto() {
		return btnAgregarProducto;
	}

	public void setBtnAgregarProducto(JButton btnAgregarProducto) {
		this.btnAgregarProducto = btnAgregarProducto;
	}

	public JButton getBtnVerListaProductos() {
		return btnVerListaProductos;
	}

	public void setBtnVerListaProductos(JButton btnVerListaProductos) {
		this.btnVerListaProductos = btnVerListaProductos;
	}

	public JButton getBtnModificarProducto() {
		return btnModificarProducto;
	}

	public void setBtnModificarProducto(JButton btnModificarProducto) {
		this.btnModificarProducto = btnModificarProducto;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public static String getAgregarproducto() {
		return AgregarProducto;
	}

	public static String getVerlistaproductos() {
		return VerListaProductos;
	}

	public static String getModificarproducto() {
		return ModificarProducto;
	}

	public static String getVolver() {
		return volverGestionProductos;
	}
	
	
}