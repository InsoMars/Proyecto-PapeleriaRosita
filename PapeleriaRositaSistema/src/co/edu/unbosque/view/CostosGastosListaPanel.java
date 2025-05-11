package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CostosGastosListaPanel extends JPanel {

	private JLabel wallcreate;
	private JButton btnVolver, btnModificarCostosGastos, btnEliminarCostosGastos, btnBuscarCostosGastos;
	public static final String ModificarCostosGastos = "ModificarCostosGastos";
	public static final String volverCostosGastos = "volverCostosGastos";
	public static final String eliminarCostosGastos = "eliminarCostosGastos";
	public static final String buscarCostosGastos = "buscarCostosGastos";

	public CostosGastosListaPanel() {
		// TODO Auto-generated constructor stub
	setLayout(null);
	setVisible(true);
	setBackground(Color.black);
	
	
	wallcreate = new JLabel();
	wallcreate.setBounds(0, 0, 1300, 800);
	Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/costoGastoLista.png").getImage();
	ImageIcon image = new ImageIcon(
			temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
	wallcreate.setIcon(image);
	
	
	btnBuscarCostosGastos = new JButton();
	btnBuscarCostosGastos.setBounds(865, 225, 80, 70);
	btnBuscarCostosGastos.setBackground(Color.white);
	btnBuscarCostosGastos.setForeground(Color.WHITE);
	btnBuscarCostosGastos.setOpaque(false);
	
	btnBuscarCostosGastos.setActionCommand(ModificarCostosGastos);
	
	btnModificarCostosGastos = new JButton();
	btnModificarCostosGastos .setBounds(1100, 400, 150, 80);
	btnModificarCostosGastos .setBackground(Color.white);
	btnModificarCostosGastos .setForeground(Color.WHITE);
	btnModificarCostosGastos .setOpaque(false);

	btnModificarCostosGastos .setActionCommand(ModificarCostosGastos);
	
	btnEliminarCostosGastos = new JButton();
	btnEliminarCostosGastos.setBounds(1100, 520, 150, 80);
	btnEliminarCostosGastos .setBackground(Color.white);
	btnEliminarCostosGastos .setForeground(Color.WHITE);
	btnEliminarCostosGastos .setOpaque(false);
	
	btnEliminarCostosGastos.setActionCommand(eliminarCostosGastos);
	
	btnVolver = new JButton();
	btnVolver.setBounds(50, 620, 100, 100);
	btnVolver.setBackground(Color.yellow);
	btnVolver.setForeground(Color.yellow);
	btnVolver.setOpaque(false);

	btnVolver.setActionCommand(volverCostosGastos);

	
	
	add(wallcreate);
	add(btnBuscarCostosGastos);
	add(btnModificarCostosGastos);
	add(btnVolver);
	add(btnEliminarCostosGastos);
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

	public JButton getBtnModificarCostosGastos() {
		return btnModificarCostosGastos;
	}

	public void setBtnModificarCostosGastos(JButton btnModificarCostosGastos) {
		this.btnModificarCostosGastos = btnModificarCostosGastos;
	}

	public JButton getBtnEliminarCostosGastos() {
		return btnEliminarCostosGastos;
	}

	public void setBtnEliminarCostosGastos(JButton btnEliminarCostosGastos) {
		this.btnEliminarCostosGastos = btnEliminarCostosGastos;
	}

	public JButton getBtnBuscarCostosGastos() {
		return btnBuscarCostosGastos;
	}

	public void setBtnBuscarCostosGastos(JButton btnBuscarCostosGastos) {
		this.btnBuscarCostosGastos = btnBuscarCostosGastos;
	}

	public static String getModificarcostosgastos() {
		return ModificarCostosGastos;
	}

	public static String getVolvercostosgastos() {
		return volverCostosGastos;
	}

	public static String getEliminarcostosgastos() {
		return eliminarCostosGastos;
	}

	public static String getBuscarcostosgastos() {
		return buscarCostosGastos;
	}
	
}