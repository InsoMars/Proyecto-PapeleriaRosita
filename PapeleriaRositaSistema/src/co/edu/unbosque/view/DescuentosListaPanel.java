package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DescuentosListaPanel extends JPanel {
	
	
	private JLabel wallcreate;
	private JButton btnVolver, btnModificarDescuentos, btnEliminarDescuentos, btnBuscarDescuentos;
	public static final String ModificarDescuentos = "ModificarDescuentos";
	public static final String volverDescuentosListaDescuentosLista = "volverDescuentosListaDescuentosLista";
	public static final String eliminarDescuentos = "eliminarDescuentos";
	public static final String buscarDescuentos = "buscarDescuentos";

	public DescuentosListaPanel() { 
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listaDescuentos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnBuscarDescuentos = new JButton();
		btnBuscarDescuentos.setBounds(810, 210, 80, 70);
		btnBuscarDescuentos.setBackground(Color.white);
		btnBuscarDescuentos.setForeground(Color.WHITE);
		btnBuscarDescuentos.setOpaque(false);

		btnBuscarDescuentos.setActionCommand(ModificarDescuentos);

		btnModificarDescuentos = new JButton();
		btnModificarDescuentos.setBounds(1100, 400, 150, 80);
		btnModificarDescuentos.setBackground(Color.white);
		btnModificarDescuentos.setForeground(Color.WHITE);
		btnModificarDescuentos.setOpaque(false);

		btnModificarDescuentos.setActionCommand(ModificarDescuentos);

		btnEliminarDescuentos = new JButton();
		btnEliminarDescuentos.setBounds(1100, 520, 150, 80);
		btnEliminarDescuentos.setBackground(Color.white);
		btnEliminarDescuentos.setForeground(Color.WHITE);
		btnEliminarDescuentos.setOpaque(false);

		btnEliminarDescuentos.setActionCommand(eliminarDescuentos);

		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverDescuentosListaDescuentosLista);

		add(wallcreate);
		add(btnBuscarDescuentos);
		add(btnModificarDescuentos);
		add(btnVolver);
		add(btnEliminarDescuentos);

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

	public JButton getBtnModificarDescuentos() {
		return btnModificarDescuentos;
	}

	public void setBtnModificarDescuentos(JButton btnModificarDescuentos) {
		this.btnModificarDescuentos = btnModificarDescuentos;
	}

	public JButton getBtnEliminarDescuentos() {
		return btnEliminarDescuentos;
	}

	public void setBtnEliminarDescuentos(JButton btnEliminarDescuentos) {
		this.btnEliminarDescuentos = btnEliminarDescuentos;
	}

	public static String getModificarDescuentos() {
		return ModificarDescuentos;
	}

	public static String getVolver() {
		return volverDescuentosListaDescuentosLista;
	}

	public static String getEliminarDescuentos() {
		return eliminarDescuentos;
	}

}



