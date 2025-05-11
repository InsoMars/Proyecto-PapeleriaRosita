package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistrarCostosGastosPanel extends JPanel {

	private JTextField txtFecha, txtACategoria, txtDescripcion, txtMonto;
	private JButton btnAgregar, btnVolver;
	private JLabel wallcreate;
	public static final String volverRegCostoGasto = "volverRegCostoGasto";
	public static final String agregarCostosGastos = "agregarCostosGastos";

	public RegistrarCostosGastosPanel() {
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 780);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/registroCostoGasto.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		txtFecha = new JTextField();
		txtFecha.setBounds(357, 242, 200, 40);
		txtFecha.setFont(new Font("Arial", ALLBITS, 20));
		txtFecha.setOpaque(false);
		txtFecha.setBorder(null);


		txtACategoria = new JTextField();
		txtACategoria.setBounds(355, 310, 200, 30);
		txtACategoria.setFont(new Font("Arial", ALLBITS, 20));
		txtACategoria.setOpaque(false);
		txtACategoria.setBorder(null);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(355, 380, 200, 30);
		txtDescripcion.setFont(new Font("Arial", ALLBITS, 20));
		txtDescripcion.setOpaque(false);
		txtDescripcion.setBorder(null);

		txtMonto = new JTextField();
		txtMonto.setBounds(362, 450, 200, 30);
		txtMonto.setFont(new Font("Arial", ALLBITS, 20));
		txtMonto.setOpaque(false);
		txtMonto.setBorder(null);
		
	
		btnVolver = new JButton();
		btnVolver.setBounds(70, 650, 95, 100);
		btnVolver.setBorderPainted(false);
		btnVolver.setContentAreaFilled(false);

		btnVolver.setActionCommand(volverRegCostoGasto);

		btnAgregar = new JButton();
		btnAgregar.setBounds(230, 555, 250, 50);
		btnAgregar.setBackground(Color.yellow);
		btnAgregar.setForeground(Color.yellow);
		btnAgregar.setOpaque(false);

		btnAgregar.setActionCommand(agregarCostosGastos);

		add(txtFecha);

		add(txtACategoria);
		add(txtDescripcion);
		add(txtMonto);
		add(wallcreate);
		add(btnAgregar);
		add(btnVolver);
	}

	public static String getVolverregcostogasto() {
		return volverRegCostoGasto;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	public JTextField getTxtACategoria() {
		return txtACategoria;
	}

	public void setTxtACategoria(JTextField txtACategoria) {
		this.txtACategoria = txtACategoria;
	}

	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
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

	public static String getVolver() {
		return volverRegCostoGasto;
	}

	public static String getAgregarcostosgastos() {
		return agregarCostosGastos;
	}

}
