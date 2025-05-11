package co.edu.unbosque.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	
	private JButton btnIniciarSesion;
	private JTextField usuario;
	private JPasswordField contrasena;
	private JLabel wallcreate;
	
	public static final String iniciarSesion="iniciarSesion";
	
	
	public LoginPanel() {
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		wallcreate=new JLabel();
		wallcreate.setBounds(0,0,1300,800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/login.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);	
		
		
		
		usuario= new JTextField();
		usuario.setBounds(315,400,250,45);
		usuario.setFont(new Font("Arial", ALLBITS, 24));
		usuario.setOpaque(false);
		usuario.setBorder(null);
		
		contrasena= new JPasswordField();
		contrasena.setBounds(315,500,250,45);
		contrasena.setFont(new Font("Arial", ALLBITS, 24));
		contrasena.setOpaque(false);
		contrasena.setBorder(null);
		
		
		btnIniciarSesion=new JButton();
		btnIniciarSesion.setBounds(200,590,250,50);
		btnIniciarSesion.setBackground(Color.pink);
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setOpaque(false);
		
		btnIniciarSesion.setActionCommand(iniciarSesion);
		
		
		
		add(usuario);
		add(contrasena);
		add(wallcreate);
		add(btnIniciarSesion);
		
	
	
	}


	public JButton getBtnIniciarSesion() {
		return btnIniciarSesion;
	}


	public void setBtnIniciarSesion(JButton btnIniciarSesion) {
		this.btnIniciarSesion = btnIniciarSesion;
	}


	public JTextField getUsuario() {
		return usuario;
	}


	public void setUsuario(JTextField usuario) {
		this.usuario = usuario;
	}


	public JPasswordField getContrasena() {
		return contrasena;
	}


	public void setContrasena(JPasswordField contrasena) {
		this.contrasena = contrasena;
	}


	public JLabel getWallcreate() {
		return wallcreate;
	}


	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}


	public static String getIniciarsesion() {
		return iniciarSesion;
	}
	
	

}
