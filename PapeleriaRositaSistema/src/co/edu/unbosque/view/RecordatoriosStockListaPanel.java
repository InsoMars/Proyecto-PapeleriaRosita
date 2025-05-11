package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecordatoriosStockListaPanel extends JPanel {
	
	private JLabel wallcreate;
	private JButton btnVolver, btnModificarRecordatoriosStock, btnEliminarRecordatoriosStock, btnBuscarRecordatorioStock;	
	public static final String ModificarRecordatoriosStock = "ModificarRecordatoriosStock";
	public static final String volverRecordatoriosStockLista = "volverRecordatoriosStockLista";
	public static final String eliminarRecordatoriosStock= "eliminarRecordatoriosStock";	
	public static final String buscarRecordatoriosStock= "buscarRecordatoriosStock";
	
	public RecordatoriosStockListaPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listaRecordatoriosStock.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnBuscarRecordatorioStock = new JButton();
		btnBuscarRecordatorioStock.setBounds(865, 220, 80, 70);
		btnBuscarRecordatorioStock.setBackground(Color.white);
		btnBuscarRecordatorioStock.setForeground(Color.WHITE);
		btnBuscarRecordatorioStock.setOpaque(false);
		
		btnBuscarRecordatorioStock.setActionCommand(ModificarRecordatoriosStock);
		
		btnModificarRecordatoriosStock = new JButton();
		btnModificarRecordatoriosStock .setBounds(1100, 400, 150, 80);
		btnModificarRecordatoriosStock .setBackground(Color.white);
		btnModificarRecordatoriosStock .setForeground(Color.WHITE);
		btnModificarRecordatoriosStock .setOpaque(false);

		btnModificarRecordatoriosStock .setActionCommand(ModificarRecordatoriosStock);
		
		btnEliminarRecordatoriosStock = new JButton();
		btnEliminarRecordatoriosStock.setBounds(1100, 520, 150, 80);
		btnEliminarRecordatoriosStock .setBackground(Color.white);
		btnEliminarRecordatoriosStock .setForeground(Color.WHITE);
		btnEliminarRecordatoriosStock .setOpaque(false);
		
		btnEliminarRecordatoriosStock.setActionCommand(eliminarRecordatoriosStock);
		
		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverRecordatoriosStockLista);

		
		
		add(wallcreate);
		add(btnBuscarRecordatorioStock);
		add(btnModificarRecordatoriosStock);
		add(btnVolver);
		add(btnEliminarRecordatoriosStock);
		
	
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

	public JButton getBtnModificarRecordatoriosStock() {
		return btnModificarRecordatoriosStock;
	}

	public void setBtnModificarRecordatoriosStock(JButton btnModificarRecordatoriosStock) {
		this.btnModificarRecordatoriosStock = btnModificarRecordatoriosStock;
	}

	public JButton getBtnEliminarRecordatoriosStock() {
		return btnEliminarRecordatoriosStock;
	}

	public void setBtnEliminarRecordatoriosStock(JButton btnEliminarRecordatoriosStock) {
		this.btnEliminarRecordatoriosStock = btnEliminarRecordatoriosStock;
	}

	public JButton getBtnBuscarRecordatorioStock() {
		return btnBuscarRecordatorioStock;
	}

	public void setBtnBuscarRecordatorioStock(JButton btnBuscarRecordatorioStock) {
		this.btnBuscarRecordatorioStock = btnBuscarRecordatorioStock;
	}

	public static String getModificarrecordatoriosstock() {
		return ModificarRecordatoriosStock;
	}

	public static String getVolver() {
		return volverRecordatoriosStockLista;
	}

	public static String getEliminarrecordatoriosstock() {
		return eliminarRecordatoriosStock;
	}

	public static String getBuscarrecordatoriosstock() {
		return buscarRecordatoriosStock;
	}
	
	

}
