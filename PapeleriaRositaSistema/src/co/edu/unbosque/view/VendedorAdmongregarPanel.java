package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VendedorAdmongregarPanel extends JPanel {
	
	
	private JTextField txtNombre, txtApellido, txtCedula,txtCelular,txtEmail, txtDireccion,txtEps, txtSalario;
	private JPasswordField contrasenaVendedor;
	private JButton btnAgregar,btnVolver;
	private JLabel wallcreate;
	public static final String volverVendedorAgregar = "volverVendedorAgregar";
	public static final String agregarVendedor = "agregarVendedor";
	
	
	public VendedorAdmongregarPanel() {
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/agregarVendedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		txtNombre= new JTextField();
		txtNombre.setBounds(330,180,200,30);
		txtNombre.setFont(new Font("Arial", ALLBITS, 18));
		txtNombre.setOpaque(false);
		txtNombre.setBorder(null);
		
		txtApellido= new JTextField();
		txtApellido.setBounds(330,225,200,30);
		txtApellido.setFont(new Font("Arial", ALLBITS, 18));
		txtApellido.setOpaque(false);
		txtApellido.setBorder(null);
		
		txtCedula= new JTextField();
		txtCedula.setBounds(330,270,200,30);
		txtCedula.setFont(new Font("Arial", ALLBITS, 18));
		txtCedula.setOpaque(false);
		txtCedula.setBorder(null);
		
		
		txtCelular= new JTextField();
		txtCelular.setBounds(330,315,200,30);
		txtCelular.setFont(new Font("Arial", ALLBITS, 18));
		txtCelular.setOpaque(false);
		txtCelular.setBorder(null);
		
		
		txtEmail= new JTextField();
		txtEmail.setBounds(330,360,200,30);
		txtEmail.setFont(new Font("Arial", ALLBITS, 18));
		txtEmail.setOpaque(false);
		txtEmail.setBorder(null);
		
		txtDireccion= new JTextField();
		txtDireccion.setBounds(330,405,200,30);
		txtDireccion.setFont(new Font("Arial", ALLBITS, 18));
		txtDireccion.setOpaque(false);
		txtDireccion.setBorder(null);
		
		
		txtEps= new JTextField();
		txtEps.setBounds(330,450,200,30);
		txtEps.setFont(new Font("Arial", ALLBITS, 18));
		txtEps.setOpaque(false);
		txtEps.setBorder(null);
		
		txtSalario= new JTextField();
		txtSalario.setBounds(330,495,200,30);
		txtSalario.setFont(new Font("Arial", ALLBITS, 18));
		txtSalario.setOpaque(false);
		txtSalario.setBorder(null);
		
		contrasenaVendedor= new JPasswordField();
		contrasenaVendedor.setBounds(330,540,200,30);
		contrasenaVendedor.setFont(new Font("Arial", ALLBITS, 18));
		contrasenaVendedor.setOpaque(false);
		contrasenaVendedor.setBorder(null);
		
		btnVolver = new JButton();
		btnVolver.setBounds(20, 680, 85, 60);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverVendedorAgregar);
		
		btnAgregar = new JButton();
		btnAgregar.setBounds(200, 610, 280, 50);
		btnAgregar.setBackground(Color.yellow);
		btnAgregar.setForeground(Color.yellow);
		btnAgregar.setOpaque(false);

		btnAgregar.setActionCommand(agregarVendedor);
		
		
		
		
		
		add(wallcreate);
		add(txtNombre);
		add(txtApellido);
		add(txtCedula);
		add(txtCelular);
		add(txtEmail);
		add(txtEps);
		add(txtSalario);
		add(txtDireccion);
		add(contrasenaVendedor);
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


	public JTextField getTxtCedula() {
		return txtCedula;
	}


	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}


	public JTextField getTxtCelular() {
		return txtCelular;
	}


	public void setTxtCelular(JTextField txtCelular) {
		this.txtCelular = txtCelular;
	}


	public JTextField getTxtEmail() {
		return txtEmail;
	}


	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}


	public JTextField getTxtDireccion() {
		return txtDireccion;
	}


	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}


	public JTextField getTxtEps() {
		return txtEps;
	}


	public void setTxtEps(JTextField txtEps) {
		this.txtEps = txtEps;
	}


	public JTextField getTxtSalario() {
		return txtSalario;
	}


	public void setTxtSalario(JTextField txtSalario) {
		this.txtSalario = txtSalario;
	}


	public JPasswordField getContrasenaVendedor() {
		return contrasenaVendedor;
	}


	public void setContrasenaVendedor(JPasswordField contrasenaVendedor) {
		this.contrasenaVendedor = contrasenaVendedor;
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
		return volverVendedorAgregar;
	}


	public static String getAgregarvendedor() {
		return agregarVendedor;
	}
	
	

}
