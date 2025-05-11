package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentasPanel extends JPanel{
	
	private  JTextField barraBusqueda ;
	private JButton btnAgregarArticulo,btnBorrarArticulo;
	private JButton btnCancelarCompra,btnLimpiar,btnDevoluciones,btnRegVenta,btnvolverVentas;
	private JLabel wallcreate;
	public static final String agregarArticulo="agregarArticulo";
	public static final String borrarArticulo="borrarArticulo";
	public static final String cancelarCompra="cancelarCompra";
	public static final String limpiar="limpiar";
	public static final String registrarDevolucion="registrarDevolucion";
	public static final String registrarVenta="registrarVenta";
	public static final String volverVentas = "volverVentas";

	
	
	public VentasPanel() {
		
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/ventasVendedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnAgregarArticulo = new JButton();
		btnAgregarArticulo.setBounds(760, 265, 450, 106);
		btnAgregarArticulo.setBackground(Color.white);
		btnAgregarArticulo.setForeground(Color.WHITE);
		btnAgregarArticulo.setOpaque(false);
		
		btnAgregarArticulo.setActionCommand(agregarArticulo);
		
		btnBorrarArticulo = new JButton();
		btnBorrarArticulo .setBounds(760, 397, 150, 110);
		btnBorrarArticulo .setBackground(Color.white);
		btnBorrarArticulo .setForeground(Color.WHITE);
		btnBorrarArticulo .setOpaque(false);

		btnBorrarArticulo .setActionCommand(borrarArticulo);
		
		btnCancelarCompra = new JButton();
		btnCancelarCompra.setBounds(920, 395, 150, 110);
		btnCancelarCompra .setBackground(Color.white);
		btnCancelarCompra .setForeground(Color.WHITE);
		btnCancelarCompra .setOpaque(false);
		
		btnCancelarCompra .setActionCommand(cancelarCompra);
		
		
		
		btnLimpiar=new JButton();
		btnLimpiar.setBounds(1080, 395, 140, 110);
		btnLimpiar .setBackground(Color.white);
		btnLimpiar .setForeground(Color.WHITE);
		btnLimpiar .setOpaque(false);
		btnLimpiar .setActionCommand(limpiar);
		
		btnDevoluciones = new JButton();
		btnDevoluciones .setBounds(760, 530, 150, 110);
		btnDevoluciones .setBackground(Color.white);
		btnDevoluciones .setForeground(Color.WHITE);
		btnDevoluciones .setOpaque(false);

		btnDevoluciones .setActionCommand(registrarDevolucion);
		
		
		btnRegVenta= new JButton();
		btnRegVenta .setBounds(920, 530, 300, 110);
		btnRegVenta .setBackground(Color.white);
		btnRegVenta .setForeground(Color.WHITE);
		btnRegVenta .setOpaque(false);

		btnRegVenta .setActionCommand(registrarVenta);
		
		
		btnvolverVentas = new JButton();
		btnvolverVentas.setBounds(50, 620, 100, 100);
		btnvolverVentas.setBackground(Color.yellow);
		btnvolverVentas.setForeground(Color.yellow);
		btnvolverVentas.setOpaque(false);

		btnvolverVentas.setActionCommand(volverVentas);

		
		
		add(wallcreate);
		add(btnAgregarArticulo);
		add(btnBorrarArticulo);
		add(btnDevoluciones);
		add(btnRegVenta);
		add(btnLimpiar);
		add(btnvolverVentas);
		add(btnCancelarCompra);

	
	
	
	}



	public JTextField getBarraBusqueda() {
		return barraBusqueda;
	}



	public void setBarraBusqueda(JTextField barraBusqueda) {
		this.barraBusqueda = barraBusqueda;
	}



	public JButton getBtnAgregarArticulo() {
		return btnAgregarArticulo;
	}



	public void setBtnAgregarArticulo(JButton btnAgregarArticulo) {
		this.btnAgregarArticulo = btnAgregarArticulo;
	}



	public JButton getBtnBorrarArticulo() {
		return btnBorrarArticulo;
	}



	public void setBtnBorrarArticulo(JButton btnBorrarArticulo) {
		this.btnBorrarArticulo = btnBorrarArticulo;
	}



	public JButton getBtnCancelarCompra() {
		return btnCancelarCompra;
	}



	public void setBtnCancelarCompra(JButton btnCancelarCompra) {
		this.btnCancelarCompra = btnCancelarCompra;
	}



	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}



	public void setBtnLimpiar(JButton btnLimpiar) {
		this.btnLimpiar = btnLimpiar;
	}



	public JButton getBtnDevoluciones() {
		return btnDevoluciones;
	}



	public void setBtnDevoluciones(JButton btnDevoluciones) {
		this.btnDevoluciones = btnDevoluciones;
	}



	public JButton getBtnRegVenta() {
		return btnRegVenta;
	}



	public void setBtnRegVenta(JButton btnRegVenta) {
		this.btnRegVenta = btnRegVenta;
	}



	public JButton getBtnvolverVentas() {
		return btnvolverVentas;
	}



	public void setBtnvolverVentas(JButton btnvolverVentas) {
		this.btnvolverVentas = btnvolverVentas;
	}



	public JLabel getWallcreate() {
		return wallcreate;
	}



	public void setWallcreate(JLabel wallcreate) {
		this.wallcreate = wallcreate;
	}



	public static String getAgregararticulo() {
		return agregarArticulo;
	}



	public static String getBorrararticulo() {
		return borrarArticulo;
	}



	public static String getCancelarcompra() {
		return cancelarCompra;
	}



	public static String getLimpiar() {
		return limpiar;
	}



	public static String getRegistrardevolucion() {
		return registrarDevolucion;
	}



	public static String getRegistrarventa() {
		return registrarVenta;
	}



	public static String getVolverventas() {
		return volverVentas;
	}
	

	
}
