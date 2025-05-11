package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VendedorAdmonPanel extends JPanel {

	private JButton btnAgregarVendedor, btnVerLista, btnModificarVendedor, btnVolver;
	private JLabel wallcreate;
	public static final String AgregarVendedor = "AgregarVendedor";
	public static final String VerListaVendedor = "VerListaVendedor";
	public static final String ModificarVendedor = "ModificarVendedor";
	public static final String volverVendedor= "volverVendedor";

	public VendedorAdmonPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/vendedores.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnAgregarVendedor = new JButton();
		btnAgregarVendedor.setBounds(325, 375, 190, 153);
		btnAgregarVendedor.setBackground(Color.white);
		btnAgregarVendedor.setForeground(Color.WHITE);
		btnAgregarVendedor.setOpaque(false);

		btnAgregarVendedor.setActionCommand(AgregarVendedor);

		btnVerLista = new JButton();
		btnVerLista.setBounds(560, 377, 180, 153);
		btnVerLista.setBackground(Color.blue);
		btnVerLista.setForeground(Color.blue);
		btnVerLista.setOpaque(false);

		btnVerLista.setActionCommand(VerListaVendedor);

		btnModificarVendedor = new JButton();
		btnModificarVendedor.setBounds(785, 375, 185, 153);
		btnModificarVendedor.setBackground(Color.yellow);
		btnModificarVendedor.setForeground(Color.yellow);
		btnModificarVendedor.setOpaque(false);
		btnModificarVendedor.setActionCommand(ModificarVendedor);

		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverVendedor);

		add(wallcreate);
		add(btnVolver);
		add(btnAgregarVendedor);
		add(btnModificarVendedor);
		add(btnVerLista);
		

	}

	public JButton getBtnAgregarVendedor() {
		return btnAgregarVendedor;
	}

	public void setBtnAgregarVendedor(JButton btnAgregarVendedor) {
		this.btnAgregarVendedor = btnAgregarVendedor;
	}

	public JButton getBtnVerLista() {
		return btnVerLista;
	}

	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}

	public JButton getBtnModificarVendedor() {
		return btnModificarVendedor;
	}

	public void setBtnModificarVendedor(JButton btnModificarVendedor) {
		this.btnModificarVendedor = btnModificarVendedor;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JLabel getWallcreate() {
		return wallcreate;
	}

	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}

	public static String getAgregarvendedor() {
		return AgregarVendedor;
	}

	public static String getVerlistavendedor() {
		return VerListaVendedor;
	}

	public static String getModificarvendedor() {
		return ModificarVendedor;
	}

	public static String getVolvervendedor() {
		return volverVendedor;
	}
	


}
