package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuVendedorPanel extends JPanel {

	private JLabel wallcreate;
	private JButton btnVentas, btnDirectorioProd, btnGestionProd, btnRegCostosGastos, btnCierreCaja, btnCerrarSesion,btnVolver;
	public static final String abrirVendedorVentas = "abrirVendedorVentas";
	public static final String abrirVendedorDirectorioProd = "abrirVendedorDirectorioProd";
	public static final String abrirVendedorGestionProd = "abrirVendedorGestionProd";
	public static final String abrirVendedorRegCostosGastos = "abrirVendedorRegCostosGastos";
	public static final String abrirVendedorCierreCaja = "abrirVendedorCierreCaja";
	public static final String vendedorCerrarSesion = "vendedorCerrarSesion";
	public static final String volverMenuVendedor= "volverMenuVendedor";
	

	public MenuVendedorPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/menuVendedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnVentas = new JButton();
		btnVentas.setBounds(305, 250, 200, 180);
		btnVentas.setBackground(Color.white);
		btnVentas.setForeground(Color.WHITE);
		btnVentas.setOpaque(false);

		btnVentas.setActionCommand(abrirVendedorVentas);

		btnDirectorioProd = new JButton();
		btnDirectorioProd.setBounds(540, 250, 200, 180);
		btnDirectorioProd.setBackground(Color.blue);
		btnDirectorioProd.setForeground(Color.blue);
		btnDirectorioProd.setOpaque(false);
		
		btnDirectorioProd.setActionCommand(abrirVendedorDirectorioProd);

		btnGestionProd = new JButton();
		btnGestionProd.setBounds(765, 250, 200, 180);
		btnGestionProd.setBackground(Color.yellow);
		btnGestionProd.setForeground(Color.yellow);
		btnGestionProd.setOpaque(false);
		
		btnGestionProd.setActionCommand(abrirVendedorGestionProd);

		btnRegCostosGastos = new JButton();
		btnRegCostosGastos.setBounds(405, 472, 200, 180);
		btnRegCostosGastos.setBackground(Color.yellow);
		btnRegCostosGastos.setForeground(Color.yellow);
		btnRegCostosGastos.setOpaque(false);
		
		btnRegCostosGastos.setActionCommand(abrirVendedorRegCostosGastos);

		btnCierreCaja = new JButton();
		btnCierreCaja.setBounds(650, 472, 210, 180);
		btnCierreCaja.setBackground(Color.yellow);
		btnCierreCaja.setForeground(Color.yellow);
		btnCierreCaja.setOpaque(false);
		
		btnCierreCaja.setActionCommand(abrirVendedorCierreCaja);

		btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(1120, 50, 140, 105);
		btnCerrarSesion.setBackground(Color.yellow);
		btnCerrarSesion.setForeground(Color.yellow);
		btnCerrarSesion.setOpaque(false);
		
		btnCerrarSesion.setActionCommand(vendedorCerrarSesion);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);
		
		btnVolver.setActionCommand(volverMenuVendedor);



		add(wallcreate);
		add(btnVentas);
		add(btnDirectorioProd);
		add(btnGestionProd);
		add(btnRegCostosGastos);
		add(btnCierreCaja);
		add(btnCerrarSesion);
		add(btnVolver);
	}


	public JLabel getWallcreate() {
		return wallcreate;
	}


	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}


	public JButton getBtnVentas() {
		return btnVentas;
	}


	public void setBtnVentas(JButton btnVentas) {
		this.btnVentas = btnVentas;
	}


	public JButton getBtnDirectorioProd() {
		return btnDirectorioProd;
	}


	public void setBtnDirectorioProd(JButton btnDirectorioProd) {
		this.btnDirectorioProd = btnDirectorioProd;
	}


	public JButton getBtnGestionProd() {
		return btnGestionProd;
	}


	public void setBtnGestionProd(JButton btnGestionProd) {
		this.btnGestionProd = btnGestionProd;
	}


	public JButton getBtnRegCostosGastos() {
		return btnRegCostosGastos;
	}


	public void setBtnRegCostosGastos(JButton btnRegCostosGastos) {
		this.btnRegCostosGastos = btnRegCostosGastos;
	}


	public JButton getBtnCierreCaja() {
		return btnCierreCaja;
	}


	public void setBtnCierreCaja(JButton btnCierreCaja) {
		this.btnCierreCaja = btnCierreCaja;
	}


	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}


	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
	}


	public JButton getBtnVolver() {
		return btnVolver;
	}


	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}


	public static String getAbrirvendedorventas() {
		return abrirVendedorVentas;
	}


	public static String getAbrirvendedordirectorioprod() {
		return abrirVendedorDirectorioProd;
	}


	public static String getAbrirvendedorgestionprod() {
		return abrirVendedorGestionProd;
	}


	public static String getAbrirvendedorregcostosgastos() {
		return abrirVendedorRegCostosGastos;
	}


	public static String getAbrirvendedorcierrecaja() {
		return abrirVendedorCierreCaja;
	}


	public static String getVendedorcerrarsesion() {
		return vendedorCerrarSesion;
	}


	public static String getVolvermenuvendedor() {
		return volverMenuVendedor;
	}
	
	


}
