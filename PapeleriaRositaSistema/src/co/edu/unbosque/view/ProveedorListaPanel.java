package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProveedorListaPanel extends JPanel {

	private JLabel wallcreate;
	private JButton btnVolver, btnModificarProveedor, btnEliminarProveedor, btnBuscarProveedor;
	public static final String ModificarProveedor = "ModificarProveedor";
	public static final String volverProveedorLista = "volverProveedorLista";
	public static final String eliminarProveedor = "eliminarProveedor";
	public static final String buscarProveedor = "buscarProveedor";

	public ProveedorListaPanel() { 
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listaProveedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnBuscarProveedor = new JButton();
		btnBuscarProveedor.setBounds(710, 240, 80, 70);
		btnBuscarProveedor.setBackground(Color.white);
		btnBuscarProveedor.setForeground(Color.WHITE);
		btnBuscarProveedor.setOpaque(false);

		btnBuscarProveedor.setActionCommand(ModificarProveedor);

		btnModificarProveedor = new JButton();
		btnModificarProveedor.setBounds(1125, 420, 150, 80);
		btnModificarProveedor.setBackground(Color.white);
		btnModificarProveedor.setForeground(Color.WHITE);
		btnModificarProveedor.setOpaque(false);

		btnModificarProveedor.setActionCommand(ModificarProveedor);

		btnEliminarProveedor = new JButton();
		btnEliminarProveedor.setBounds(1125, 540, 150, 80);
		btnEliminarProveedor.setBackground(Color.white);
		btnEliminarProveedor.setForeground(Color.WHITE);
		btnEliminarProveedor.setOpaque(false);

		btnEliminarProveedor.setActionCommand(eliminarProveedor);

		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverProveedorLista);

		add(wallcreate);
		add(btnBuscarProveedor);
		add(btnModificarProveedor);
		add(btnVolver);
		add(btnEliminarProveedor);

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

	public JButton getBtnModificarProveedor() {
		return btnModificarProveedor;
	}

	public void setBtnModificarProveedor(JButton btnModificarProveedor) {
		this.btnModificarProveedor = btnModificarProveedor;
	}

	public JButton getBtnEliminarProveedor() {
		return btnEliminarProveedor;
	}

	public void setBtnEliminarProveedor(JButton btnEliminarProveedor) {
		this.btnEliminarProveedor = btnEliminarProveedor;
	}

	public static String getModificarProveedor() {
		return ModificarProveedor;
	}

	public static String getVolver() {
		return volverProveedorLista;
	}

	public static String getEliminarProveedor() {
		return eliminarProveedor;
	}

}
