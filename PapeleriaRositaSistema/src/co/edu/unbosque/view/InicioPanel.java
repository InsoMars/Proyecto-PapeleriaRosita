package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicioPanel extends JPanel {
	
	private JLabel wallcreate;
	private JButton btnAdmin,btnVendedor,btnManualUsuario;
	public static final String abrirMenuAdmin="abrirMenuAdmin";
	public static final String abrirMenuVendedor="abrirMenuVendedor";
	public static final String abrirManualUsuario="abrirManualUsuario";
	
public InicioPanel() {
	

	setLayout(null);
	setVisible(true);
	setBackground(Color.black);
	
	wallcreate=new JLabel();
	wallcreate.setBounds(0,0,1300,800);
	Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/inicio.png").getImage();
	ImageIcon image = new ImageIcon(
			temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
	wallcreate.setIcon(image);
	
	btnAdmin=new JButton();
	btnAdmin.setBounds(528,500,252,60);
	btnAdmin.setBorderPainted(false);
	btnAdmin.setContentAreaFilled(false);
	
	btnAdmin.setActionCommand(abrirMenuAdmin);
	
	btnVendedor=new JButton();
	btnVendedor.setBounds(528,595,252,60);
	btnVendedor.setBorderPainted(false);
	btnVendedor.setContentAreaFilled(false);

	btnVendedor.setActionCommand(abrirMenuVendedor);
	
	btnManualUsuario=new JButton();
	btnManualUsuario.setBounds(1125,80,110,100);
	btnManualUsuario.setContentAreaFilled(false);
	btnManualUsuario.setBorderPainted(false);

	btnManualUsuario.setActionCommand(abrirManualUsuario);
	
	
	
	add(btnAdmin);
	add(btnVendedor);
	add(btnManualUsuario);
	add(wallcreate);
	
}


public JLabel getWallcreate() {
	return wallcreate;
}


public void setWallcreate(JLabel wallcreate) {
	this.wallcreate = wallcreate;
}


public JButton getBtnAdmin() {
	return btnAdmin;
}


public void setBtnAdmin(JButton btnAdmin) {
	this.btnAdmin = btnAdmin;
}


public JButton getBtnVendedor() {
	return btnVendedor;
}


public void setBtnVendedor(JButton btnVendedor) {
	this.btnVendedor = btnVendedor;
}


public JButton getBtnManualUsuario() {
	return btnManualUsuario;
}


public void setBtnManualUsuario(JButton btnManualUsuario) {
	this.btnManualUsuario = btnManualUsuario;
}


public static String getAbrirmenuadmin() {
	return abrirMenuAdmin;
}


public static String getAbrirmenuvendedor() {
	return abrirMenuVendedor;
}


public static String getAbrirmanualusuario() {
	return abrirManualUsuario;
}



}
