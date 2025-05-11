package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrdenCompraProveedorPanel extends JPanel {
	
	private JLabel wallcreate;
	private JButton btnVolver,btnAgregarOrdenProveedor, btnModificarOrdenProveedor, btnVerListaOrdenProveedor;	
	public static final String ModificarOrdenProveedor = "ModificarOrdenProveedor";
	public static final String volverOrdenCompraProveedorMenu = "volverOrdenCompraProveedorMenu";
	public static final String AgregarOrdenProveedor= "agregarOrdenProveedor";	
	public static final String verListaOrdenProveedor= "verListaOrdenProveedor";
	
	
	
	public OrdenCompraProveedorPanel() {
	
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 790);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/ordenCompraProveedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnAgregarOrdenProveedor= new JButton();
		btnAgregarOrdenProveedor.setBounds(350, 400, 180, 150);
		btnAgregarOrdenProveedor.setContentAreaFilled(false);
		btnAgregarOrdenProveedor.setBorderPainted(false);
		
		btnAgregarOrdenProveedor.setActionCommand(AgregarOrdenProveedor);
		
		btnModificarOrdenProveedor = new JButton();
		btnModificarOrdenProveedor .setBounds(567, 400, 180, 150);
		btnModificarOrdenProveedor .setBorderPainted(false);
		btnModificarOrdenProveedor .setContentAreaFilled(false);

		btnModificarOrdenProveedor .setActionCommand(ModificarOrdenProveedor);
		
		btnVerListaOrdenProveedor = new JButton();
		btnVerListaOrdenProveedor.setBounds(780, 400, 170, 150);
		btnVerListaOrdenProveedor .setBorderPainted(false);
		btnVerListaOrdenProveedor .setContentAreaFilled(false);
		
		btnVerListaOrdenProveedor.setActionCommand(verListaOrdenProveedor);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 100, 100);
		btnVolver.setBorderPainted(false);
		btnVolver.setContentAreaFilled(false);
	

		btnVolver.setActionCommand(volverOrdenCompraProveedorMenu);
		
		
		add(btnAgregarOrdenProveedor);
		add(btnModificarOrdenProveedor);
		add(btnVerListaOrdenProveedor);
		add(btnVolver);
		add(wallcreate);

		
	}
	
	



	public JLabel getWallcreate() {
		return wallcreate;
	}



	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}



	public JButton getBtnVolver() {
		return btnVolver;
	}



	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}



	public JButton getBtnAgregarOrdenProveedor() {
		return btnAgregarOrdenProveedor;
	}



	public void setBtnAgregarOrdenProveedor(JButton btnAgregarOrdenProveedor) {
		this.btnAgregarOrdenProveedor = btnAgregarOrdenProveedor;
	}



	public JButton getBtnModificarOrdenProveedor() {
		return btnModificarOrdenProveedor;
	}



	public void setBtnModificarOrdenProveedor(JButton btnModificarOrdenProveedor) {
		this.btnModificarOrdenProveedor = btnModificarOrdenProveedor;
	}



	public JButton getBtnVerListaOrdenProveedor() {
		return btnVerListaOrdenProveedor;
	}



	public void setBtnVerListaOrdenProveedor(JButton btnVerListaOrdenProveedor) {
		this.btnVerListaOrdenProveedor = btnVerListaOrdenProveedor;
	}



	public static String getModificarordenproveedor() {
		return ModificarOrdenProveedor;
	}



	public static String getVolver() {
		return volverOrdenCompraProveedorMenu;
	}



	public static String getAgregarordenproveedor() {
		return AgregarOrdenProveedor;
	}



	public static String getVerlistaordenproveedor() {
		return verListaOrdenProveedor;
	}
	
	
	
	
	
	

}
