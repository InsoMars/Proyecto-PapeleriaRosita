package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VendedorAdmonListaPanel extends JPanel {
	
	private JLabel wallcreate;
	private JButton btnVolver, btnModificarVendedor, btnEliminarVendedor, btnBuscarVendedor;	
	public static final String ModificarVendedor = "ModificarVendedor";
	public static final String volverListaVendedor= "volver";
	public static final String eliminarVendedor= "eliminarVendedor";	
	public static final String buscarVendedor= "buscarVendedor";
	
	
	public VendedorAdmonListaPanel() {
		
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listaVendedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnBuscarVendedor = new JButton();
		btnBuscarVendedor.setBounds(710, 240, 80, 70);
		btnBuscarVendedor.setBackground(Color.white);
		btnBuscarVendedor.setForeground(Color.WHITE);
		btnBuscarVendedor.setOpaque(false);
		
		btnBuscarVendedor.setActionCommand(ModificarVendedor);
		
		btnModificarVendedor = new JButton();
		btnModificarVendedor .setBounds(1125, 420, 150, 80);
		btnModificarVendedor .setBackground(Color.white);
		btnModificarVendedor .setForeground(Color.WHITE);
		btnModificarVendedor .setOpaque(false);

		btnModificarVendedor .setActionCommand(ModificarVendedor);
		
		btnEliminarVendedor = new JButton();
		btnEliminarVendedor.setBounds(1125, 540, 150, 80);
		btnEliminarVendedor .setBackground(Color.white);
		btnEliminarVendedor .setForeground(Color.WHITE);
		btnEliminarVendedor .setOpaque(false);
		
		btnEliminarVendedor.setActionCommand(eliminarVendedor);
		
		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
//		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverListaVendedor);

		
		
		add(wallcreate);
		add(btnBuscarVendedor);
		add(btnModificarVendedor);
		add(btnVolver);
		add(btnEliminarVendedor);
		
		
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


	public JButton getBtnModificarVendedor() {
		return btnModificarVendedor;
	}


	public void setBtnModificarVendedor(JButton btnModificarVendedor) {
		this.btnModificarVendedor = btnModificarVendedor;
	}


	public JButton getBtnEliminarVendedor() {
		return btnEliminarVendedor;
	}


	public void setBtnEliminarVendedor(JButton btnEliminarVendedor) {
		this.btnEliminarVendedor = btnEliminarVendedor;
	}


	public static String getModificarvendedor() {
		return ModificarVendedor;
	}


	public static String getVolver() {
		return volverListaVendedor;
	}


	public static String getEliminarvendedor() {
		return eliminarVendedor;
	}
	
	

}
