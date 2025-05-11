package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DescuentosAgregarPanel extends JPanel{
	
	private JTextField txtFechaInicio,txtFechaFin, txtDescripcion, txtProcentaje;
	private JButton btnAgregar,btnVolver;
	private JLabel wallcreate;
	public static final String volverDescuentosAgregar = "volverDescuentosAgregar";
	public static final String agregarDescuento = "agregarDescuento";
	
	
	public DescuentosAgregarPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 780);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/agregarDescuentos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		txtFechaInicio= new JTextField();
		txtFechaInicio.setBounds(357,243,200,40);
		txtFechaInicio.setFont(new Font("Arial", ALLBITS, 20));
		txtFechaInicio.setOpaque(false);
		txtFechaInicio.setBorder(null);
		
		txtFechaFin= new JTextField();
		txtFechaFin.setBounds(355,310,200,30);
		txtFechaFin.setFont(new Font("Arial", ALLBITS, 20));
		txtFechaFin.setOpaque(false);
		txtFechaFin.setBorder(null);
	
		txtDescripcion= new JTextField();
		txtDescripcion.setBounds(355,375,200,30);
		txtDescripcion.setFont(new Font("Arial", ALLBITS, 20));
		txtDescripcion.setOpaque(false);
		txtDescripcion.setBorder(null);
	
		txtProcentaje= new JTextField();
		txtProcentaje.setBounds(362,445,200,30);
		txtProcentaje.setFont(new Font("Arial", ALLBITS, 20));
		txtProcentaje.setOpaque(false);
		txtProcentaje.setBorder(null);
		
		
		
		btnVolver = new JButton();
		btnVolver.setBounds(70, 650, 95, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverDescuentosAgregar);
		
		btnAgregar = new JButton();
		btnAgregar.setBounds(200, 545, 290, 50);
		btnAgregar.setBackground(Color.yellow);
		btnAgregar.setForeground(Color.yellow);
		btnAgregar.setOpaque(false);

		btnAgregar.setActionCommand(agregarDescuento);

		add(txtFechaInicio);
		
		
		add(txtFechaFin);
		add(txtDescripcion);
		add(txtProcentaje);
		add(txtDescripcion);
		add(wallcreate);
		add(btnAgregar);
		add(btnVolver);
	
	
	}


	public JTextField getTxtFechaInicio() {
		return txtFechaInicio;
	}


	public void setTxtFechaInicio(JTextField txtFechaInicio) {
		this.txtFechaInicio = txtFechaInicio;
	}


	public JTextField getTxtFechaFin() {
		return txtFechaFin;
	}


	public void setTxtFechaFin(JTextField txtFechaFin) {
		this.txtFechaFin = txtFechaFin;
	}


	public JTextField getTxtDescripcion() {
		return txtDescripcion;
	}


	public void setTxtDescripcion(JTextField txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}


	public JTextField getTxtProcentaje() {
		return txtProcentaje;
	}


	public void setTxtProcentaje(JTextField txtProcentaje) {
		this.txtProcentaje = txtProcentaje;
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
		return volverDescuentosAgregar;
	}


	public static String getAgregardescuento() {
		return agregarDescuento;
	}
	
	
	
	
	

}
