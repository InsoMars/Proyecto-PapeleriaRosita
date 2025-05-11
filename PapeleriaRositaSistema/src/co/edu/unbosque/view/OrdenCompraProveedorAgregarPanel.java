package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OrdenCompraProveedorAgregarPanel extends JPanel {

	private JLabel wallcreate;
	private JTextField txtFecha, txtProveedor, txtNumFactura, txtMonto;
	private JButton btnVolver, btnAgregarOrdenCompra;
	public static final String volverOrdenCompraProveedorAgregar = "volverOrdenCompraProveedorAgregar";
	public static final String agregarOrdenCompra = "agregarOrdenCompra";

	public OrdenCompraProveedorAgregarPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/agregarOrdenCompra.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		txtFecha = new JTextField();
		txtFecha.setBounds(370, 245, 230, 50);
		txtFecha.setFont(new Font("Arial", ALLBITS, 20));
		txtFecha.setOpaque(false);
		txtFecha.setBorder(null);
		
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(370, 310, 230, 50);
		txtProveedor.setFont(new Font("Arial", ALLBITS, 20));
		txtProveedor.setOpaque(false);
		txtProveedor.setBorder(null);
		
		txtNumFactura = new JTextField();
		txtNumFactura.setBounds(370, 380, 230, 50);
		txtNumFactura.setFont(new Font("Arial", ALLBITS, 20));
		txtNumFactura.setOpaque(false);
		txtNumFactura.setBorder(null);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(370, 450, 230, 50);
		txtMonto.setFont(new Font("Arial", ALLBITS, 20));
		txtMonto.setOpaque(false);
		txtMonto.setBorder(null);
		
		
		btnVolver = new JButton();
		btnVolver.setBounds(70, 660, 85, 60);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverOrdenCompraProveedorAgregar);
		
		btnAgregarOrdenCompra = new JButton();
		btnAgregarOrdenCompra.setBounds(230, 560, 260, 50);
		btnAgregarOrdenCompra.setBackground(Color.yellow);
		btnAgregarOrdenCompra.setForeground(Color.yellow);
		btnAgregarOrdenCompra.setOpaque(false);

		btnAgregarOrdenCompra.setActionCommand(agregarOrdenCompra);
		
		
		add(wallcreate);
		add(txtFecha);
		add(txtProveedor);
		add(txtNumFactura);
		add(txtMonto);
		add(btnAgregarOrdenCompra);
		add(btnVolver);


	}

	public JLabel getWallcreate() {
		return wallcreate;
	}

	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}

	public JTextField getTxtFecha() {
		return txtFecha;
	}

	public void setTxtFecha(JTextField txtFecha) {
		this.txtFecha = txtFecha;
	}

	public JTextField getTxtProveedor() {
		return txtProveedor;
	}

	public void setTxtProveedor(JTextField txtProveedor) {
		this.txtProveedor = txtProveedor;
	}

	public JTextField getTxtNumFactura() {
		return txtNumFactura;
	}

	public void setTxtNumFactura(JTextField txtNumFactura) {
		this.txtNumFactura = txtNumFactura;
	}

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnAgregarOrdenCompra() {
		return btnAgregarOrdenCompra;
	}

	public void setBtnAgregarOrdenCompra(JButton btnAgregarOrdenCompra) {
		this.btnAgregarOrdenCompra = btnAgregarOrdenCompra;
	}

	public static String getVolverordencompraproveedoragregar() {
		return volverOrdenCompraProveedorAgregar;
	}

	public static String getAgregarordencompra() {
		return agregarOrdenCompra;
	}
	
	

}