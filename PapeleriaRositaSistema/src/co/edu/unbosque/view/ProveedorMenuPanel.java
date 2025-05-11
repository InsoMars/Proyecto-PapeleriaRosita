package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProveedorMenuPanel extends JPanel{
	
	
	private JButton btnAgregarProveedor,btnVerLista,btnModificarProveedor,btnVolver;
	private JLabel wallcreate;
	public static final String AgregarProveedor = "AgregarProveedor";
	public static final String VerListaProveedor = "VerListaProveedor";
	public static final String ModificarProveedor = "ModificarProveedor";
	public static final String volverProveedorMenu = "volverProveedorMenu";
	
	
	
	public ProveedorMenuPanel() {
		
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/menuProveedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		
		btnAgregarProveedor = new JButton();
		btnAgregarProveedor.setBounds(345, 385, 170, 153);
		btnAgregarProveedor.setBackground(Color.white);
		btnAgregarProveedor.setForeground(Color.WHITE);
		btnAgregarProveedor.setOpaque(false);

		btnAgregarProveedor.setActionCommand(AgregarProveedor);
	
		
		btnVerLista = new JButton();
		btnVerLista.setBounds(570, 385, 180, 153);
		btnVerLista.setBackground(Color.blue);
		btnVerLista.setForeground(Color.blue);
		btnVerLista.setOpaque(false);

		btnVerLista.setActionCommand(VerListaProveedor);
		
		
		btnModificarProveedor = new JButton();
		btnModificarProveedor.setBounds(800, 385, 180, 153);
		btnModificarProveedor.setBackground(Color.yellow);
		btnModificarProveedor.setForeground(Color.yellow);
		btnModificarProveedor.setOpaque(false);
		
		btnModificarProveedor.setActionCommand(ModificarProveedor);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverProveedorMenu);

		add(wallcreate);
		add(btnAgregarProveedor);
		add(btnModificarProveedor);
		add(btnVerLista);
		add(btnVolver);
		
		
		
		
	}



	public JButton getBtnAgregarProveedor() {
		return btnAgregarProveedor;
	}



	public void setBtnAgregarProveedor(JButton btnAgregarProveedor) {
		this.btnAgregarProveedor = btnAgregarProveedor;
	}



	public JButton getBtnVerLista() {
		return btnVerLista;
	}



	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}



	public JButton getBtnModificarProveedor() {
		return btnModificarProveedor;
	}



	public void setBtnModificarProveedor(JButton btnModificarProveedor) {
		this.btnModificarProveedor = btnModificarProveedor;
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



	public static String getAgregarproveedor() {
		return AgregarProveedor;
	}



	public static String getVerlistaproveedor() {
		return VerListaProveedor;
	}



	public static String getModificarproveedor() {
		return ModificarProveedor;
	}



	public static String getVolver() {
		return volverProveedorMenu;
	}
	
	

}
