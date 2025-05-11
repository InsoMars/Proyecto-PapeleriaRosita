package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RecordatoriosPagosAgregarPanel extends JPanel {

	private JTextField txtFechaPago, txtAcreedor, txtMonto, txtDescripcion;
	private JButton btnAgregar, btnVolver;
	private JLabel wallcreate;
	public static final String volverRecordatoriosPagoAgregar = "volverRecordatoriosPagoAgregar";
	public static final String agregarRecordatorioPagos = "agregarRecordatorioPagos";

	public RecordatoriosPagosAgregarPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 780);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/agregarRecordatorioPagos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		txtFechaPago = new JTextField();
		txtFechaPago.setBounds(352, 240, 200, 40);
		txtFechaPago.setFont(new Font("Arial", ALLBITS, 20));
		txtFechaPago.setOpaque(false);
		txtFechaPago.setBorder(null);

		txtAcreedor = new JTextField();
		txtAcreedor.setBounds(352, 310, 170, 30);
		txtAcreedor.setFont(new Font("Arial", ALLBITS, 20));
		txtAcreedor.setOpaque(false);
		txtAcreedor.setBorder(null);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(352, 375, 170, 30);
		txtDescripcion.setFont(new Font("Arial", ALLBITS, 20));
		txtDescripcion.setOpaque(false);
		txtDescripcion.setBorder(null);

		txtMonto = new JTextField();
		txtMonto.setBounds(352, 448, 170, 30);
		txtMonto.setFont(new Font("Arial", ALLBITS, 20));
		txtMonto.setOpaque(false);
		txtMonto.setBorder(null);

		btnVolver = new JButton();
		btnVolver.setBounds(70, 650, 95, 100);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorderPainted(false);

		btnVolver.setActionCommand(volverRecordatoriosPagoAgregar);

		btnAgregar = new JButton();
		btnAgregar.setBounds(200, 546, 275, 50);
		btnAgregar.setContentAreaFilled(false);
		btnAgregar.setBorderPainted(false);

		btnAgregar.setActionCommand(agregarRecordatorioPagos);

		add(txtDescripcion);
		add(txtMonto);
		add(txtFechaPago);
		add(txtAcreedor);
		add(btnAgregar);
		add(btnVolver);
		add(wallcreate);

	}

	public JTextField getTxtFechaPago() {
		return txtFechaPago;
	}

	public void setTxtFechaPago(JTextField txtFechaPago) {
		this.txtFechaPago = txtFechaPago;
	}

	public JTextField getTxtAcreedor() {
		return txtAcreedor;
	}

	public void setTxtAcreedor(JTextField txtAcreedor) {
		this.txtAcreedor = txtAcreedor;
	}

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}

	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}

	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
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

	public static String getVolverrecordatoriospagoagregar() {
		return volverRecordatoriosPagoAgregar;
	}

	public static String getAgregarrecordatoriopagos() {
		return agregarRecordatorioPagos;
	}

}
