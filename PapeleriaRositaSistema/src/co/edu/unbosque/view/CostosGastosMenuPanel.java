package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CostosGastosMenuPanel extends JPanel{
	
	
	private JButton btnAgregarCostoGasto, btnActualizarCostoGasto,btnListarCostoGasto, btnVolver;
	private JLabel wallcreate;
	public static final String AgregarCostoGasto= "AgregarCostoGasto";
	public static final String VerListaCostoGasto = "VerListaCostoGasto";
	public static final String ModificarCostoGasto = "ModificarCostoGasto";
	public static final String volverCostosGastosMenu = "volverCostosGastosMenu";

	
	public CostosGastosMenuPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/menuCostosGastos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnAgregarCostoGasto = new JButton();
		btnAgregarCostoGasto.setBounds(355, 435, 175, 153);
		btnAgregarCostoGasto.setBackground(Color.white);
		btnAgregarCostoGasto.setForeground(Color.WHITE);
		btnAgregarCostoGasto.setOpaque(false);

		btnAgregarCostoGasto.setActionCommand(AgregarCostoGasto);

		btnActualizarCostoGasto = new JButton();
		btnActualizarCostoGasto.setBounds(570, 435, 180, 153);
		btnActualizarCostoGasto.setBackground(Color.blue);
		btnActualizarCostoGasto.setForeground(Color.blue);
		btnActualizarCostoGasto.setOpaque(false);

		btnActualizarCostoGasto.setActionCommand(VerListaCostoGasto);

		btnListarCostoGasto = new JButton();
		btnListarCostoGasto.setBounds(785, 435, 185, 153);
		btnListarCostoGasto.setBackground(Color.yellow);
		btnListarCostoGasto.setForeground(Color.yellow);
		btnListarCostoGasto.setOpaque(false);
		btnListarCostoGasto.setActionCommand(ModificarCostoGasto);

		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverCostosGastosMenu);

		add(wallcreate);
		add(btnVolver);
		add(btnAgregarCostoGasto);
		add(btnListarCostoGasto);
		add(btnActualizarCostoGasto);
	
	}


	public JButton getBtnAgregarCostoGasto() {
		return btnAgregarCostoGasto;
	}


	public void setBtnAgregarCostoGasto(JButton btnAgregarCostoGasto) {
		this.btnAgregarCostoGasto = btnAgregarCostoGasto;
	}


	public JButton getBtnActualizarCostoGasto() {
		return btnActualizarCostoGasto;
	}


	public void setBtnActualizarCostoGasto(JButton btnActualizarCostoGasto) {
		this.btnActualizarCostoGasto = btnActualizarCostoGasto;
	}


	public JButton getBtnEliminarCostoGasto() {
		return btnListarCostoGasto;
	}


	public void setBtnEliminarCostoGasto(JButton btnListarCostoGasto) {
		this.btnListarCostoGasto = btnListarCostoGasto;
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


	public static String getAgregarcostogasto() {
		return AgregarCostoGasto;
	}


	public static String getVerlistacostogasto() {
		return VerListaCostoGasto;
	}


	public static String getModificarcostogasto() {
		return ModificarCostoGasto;
	}


	public static String getVolver() {
		return volverCostosGastosMenu;
	}


	public JButton getBtnListarCostoGasto() {
		return btnListarCostoGasto;
	}


	public void setBtnListarCostoGasto(JButton btnListarCostoGasto) {
		this.btnListarCostoGasto = btnListarCostoGasto;
	}
	
	

}
