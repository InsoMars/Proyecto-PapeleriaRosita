package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DirProductosPanel extends JPanel {
	
	private JLabel wallcreate;
	private JButton btnVolver,btnBuscarProducto;
	public static final String buscarProductos= "buscarProductos";
	public static final String volverDirProductos = "volverDirProductos";

	
	
	public DirProductosPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/directorioProductos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		btnBuscarProducto=new JButton();
		btnBuscarProducto.setBounds(830,190,70,75);
		btnBuscarProducto.setBackground(Color.white);
		btnBuscarProducto.setForeground(Color.WHITE);
		btnBuscarProducto.setOpaque(false);
		
		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverDirProductos);
		
		
		add(wallcreate);
		add(btnBuscarProducto);
		add(btnVolver);
	
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


	public JButton getBtnBuscarProducto() {
		return btnBuscarProducto;
	}


	public void setBtnBuscarProducto(JButton btnBuscarProducto) {
		this.btnBuscarProducto = btnBuscarProducto;
	}


	public static String getBuscarproductos() {
		return buscarProductos;
	}
	
	

}
