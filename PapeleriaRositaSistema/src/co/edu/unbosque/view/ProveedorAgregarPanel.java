package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProveedorAgregarPanel extends JPanel {
	
	private JTextField txtNombre,txtApellido, txtCelular, txtDireccion,txtDescripcion;
	private JButton btnAgregar,btnVolver;
	private JLabel wallcreate;
	public static final String volverProveedorAgregar = "volverProveedorAgregar";
	public static final String agregarProveedor = "agregarProveedor";
	
	
	public ProveedorAgregarPanel() {
	
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 780);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/registroProveedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		txtNombre= new JTextField();
		txtNombre.setBounds(357,240,200,40);
		txtNombre.setFont(new Font("Arial", ALLBITS, 20));
		txtNombre.setOpaque(false);
		txtNombre.setBorder(null);
		
		txtApellido= new JTextField();
		txtApellido.setBounds(355,307,200,30);
		txtApellido.setFont(new Font("Arial", ALLBITS, 20));
		txtApellido.setOpaque(false);
		txtApellido.setBorder(null);
	
		txtCelular= new JTextField();
		txtCelular.setBounds(355,372,200,30);
		txtCelular.setFont(new Font("Arial", ALLBITS, 20));
		txtCelular.setOpaque(false);
		txtCelular.setBorder(null);
	
		txtDireccion= new JTextField();
		txtDireccion.setBounds(362,434,200,30);
		txtDireccion.setFont(new Font("Arial", ALLBITS, 20));
		txtDireccion.setOpaque(false);
		txtDireccion.setBorder(null);
//		
		txtDescripcion= new JTextField();
		txtDescripcion.setBounds(364,495,200,30);
		txtDescripcion.setFont(new Font("Arial", ALLBITS, 20));
		txtDescripcion.setOpaque(false);
		txtDescripcion.setBorder(null);
		
		
		
		btnVolver = new JButton();
		btnVolver.setBounds(70, 650, 95, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverProveedorAgregar);
		
		btnAgregar = new JButton();
		btnAgregar.setBounds(230, 555, 250, 50);
		btnAgregar.setBackground(Color.yellow);
		btnAgregar.setForeground(Color.yellow);
		btnAgregar.setOpaque(false);

		btnAgregar.setActionCommand(agregarProveedor);

		add(txtNombre);
		
		
		add(txtApellido);
		add(txtCelular);
		add(txtDireccion);
		add(txtDescripcion);
		add(wallcreate);
		add(btnAgregar);
		add(btnVolver);

		
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtApellido() {
		return txtApellido;
	}


	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}


	public JTextField getTxtCelular() {
		return txtCelular;
	}


	public void setTxtCelular(JTextField txtCelular) {
		this.txtCelular = txtCelular;
	}


	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
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


	public static String getVolver() {
		return volverProveedorAgregar;
	}


	public static String getAgregarproveedor() {
		return agregarProveedor;
	}
	
	

}
