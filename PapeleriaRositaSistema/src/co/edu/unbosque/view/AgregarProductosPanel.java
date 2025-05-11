package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AgregarProductosPanel extends JPanel{
	
	private JTextField txtCategoria, txtMarca, txtDescripcion,txtProveedor,txtCantidad, txtPrecioUnitario;
	private JButton btnAgregar,btnVolver;
	private JLabel wallcreate;
	public static final String volverAgregarProductos = "volverAgregarProductos";
	public static final String agregarProductos = "agregarProductos";
	
	
	 public AgregarProductosPanel() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/registroProductos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		txtCategoria= new JTextField();
		txtCategoria.setBounds(330,225,200,30);
		txtCategoria.setFont(new Font("Arial", ALLBITS, 18));
		txtCategoria.setOpaque(false);
		txtCategoria.setBorder(null);
		
		txtMarca= new JTextField();
		txtMarca.setBounds(330,270,200,30);
		txtMarca.setFont(new Font("Arial", ALLBITS, 18));
		txtMarca.setOpaque(false);
		txtMarca.setBorder(null);
		
		txtDescripcion= new JTextField();
		txtDescripcion.setBounds(330,315,200,30);
		txtDescripcion.setFont(new Font("Arial", ALLBITS, 18));
//		txtDescripcion.setOpaque(false);
		txtDescripcion.setBorder(null);
		
		
		txtProveedor= new JTextField();
		txtProveedor.setBounds(330,360,200,30);
		txtProveedor.setFont(new Font("Arial", ALLBITS, 18));
		txtProveedor.setOpaque(false);
		txtProveedor.setBorder(null);
		
		
		txtCantidad= new JTextField();
		txtCantidad.setBounds(330,405,200,30);
		txtCantidad.setFont(new Font("Arial", ALLBITS, 18));
		txtCantidad.setOpaque(false);
		txtCantidad.setBorder(null);
		
		txtPrecioUnitario= new JTextField();
		txtPrecioUnitario.setBounds(330,450,200,30);
		txtPrecioUnitario.setFont(new Font("Arial", ALLBITS, 18));
		txtPrecioUnitario.setOpaque(false);
		txtPrecioUnitario.setBorder(null);
		
		
		
		btnVolver = new JButton();
		btnVolver.setBounds(50, 680, 85, 60);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverAgregarProductos);
		
		btnAgregar = new JButton();
		btnAgregar.setBounds(180, 530, 300, 50);
		btnAgregar.setBackground(Color.yellow);
		btnAgregar.setForeground(Color.yellow);
		btnAgregar.setOpaque(false);

		btnAgregar.setActionCommand(agregarProductos);
		
		
		
		
		
		add(wallcreate);
		add(txtCategoria);
		add(txtMarca);
		add(txtDescripcion);
		add(txtProveedor);
		add(txtCantidad);
		add(txtPrecioUnitario);
		add(btnAgregar);
		add(btnVolver);
		
		
	}


	public JTextField getTxtCategoria() {
		return txtCategoria;
	}


	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}


	public JTextField getTxtMarca() {
		return txtMarca;
	}


	public void setTxtMarca(JTextField txtMarca) {
		this.txtMarca = txtMarca;
	}


	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}


	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}


	public JTextField getTxtProveedor() {
		return txtProveedor;
	}


	public void setTxtProveedor(JTextField txtProveedor) {
		this.txtProveedor = txtProveedor;
	}


	public JTextField getTxtCantidad() {
		return txtCantidad;
	}


	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}


	public JTextField getTxtPrecioUnitario() {
		return txtPrecioUnitario;
	}


	public void setTxtPrecioUnitario(JTextField txtPrecioUnitario) {
		this.txtPrecioUnitario = txtPrecioUnitario;
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
		return volverAgregarProductos;
	}


	public static String getAgregarvendedor() {
		return agregarProductos;
	}
	 
	 

}
