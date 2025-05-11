package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecordatoriosPagosListaPanel extends JPanel{
	
	

	private JLabel wallcreate;
	private JButton btnVolver, btnModificarRecordatoriosPagos, btnEliminarRecordatoriosPagos, btnBuscarRecordatorioPagos;	
	public static final String ModificarRecordatoriosPagos = "ModificarRecordatoriosPagos";
	public static final String volverRecordatoriosPagoLista = "volverRecordatoriosPagoLista";
	public static final String eliminarRecordatoriosPagos= "eliminarRecordatoriosPagos";	
	public static final String buscarRecordatoriosPagos= "buscarRecordatoriosPagos";
	
	public RecordatoriosPagosListaPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listaRecordatoriosPagos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnBuscarRecordatorioPagos = new JButton();
		btnBuscarRecordatorioPagos.setBounds(865, 220, 80, 70);
		btnBuscarRecordatorioPagos.setBackground(Color.white);
		btnBuscarRecordatorioPagos.setForeground(Color.WHITE);
		btnBuscarRecordatorioPagos.setOpaque(false);
		
		btnBuscarRecordatorioPagos.setActionCommand(ModificarRecordatoriosPagos);
		
		btnModificarRecordatoriosPagos = new JButton();
		btnModificarRecordatoriosPagos .setBounds(1100, 400, 150, 80);
		btnModificarRecordatoriosPagos .setBackground(Color.white);
		btnModificarRecordatoriosPagos .setForeground(Color.WHITE);
		btnModificarRecordatoriosPagos .setOpaque(false);

		btnModificarRecordatoriosPagos .setActionCommand(ModificarRecordatoriosPagos);
		
		btnEliminarRecordatoriosPagos = new JButton();
		btnEliminarRecordatoriosPagos.setBounds(1100, 520, 150, 80);
		btnEliminarRecordatoriosPagos .setBackground(Color.white);
		btnEliminarRecordatoriosPagos .setForeground(Color.WHITE);
		btnEliminarRecordatoriosPagos .setOpaque(false);
		
		btnEliminarRecordatoriosPagos.setActionCommand(eliminarRecordatoriosPagos);
		
		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverRecordatoriosPagoLista);

		
		
		add(wallcreate);
		add(btnBuscarRecordatorioPagos);
		add(btnModificarRecordatoriosPagos);
		add(btnVolver);
		add(btnEliminarRecordatoriosPagos);
	
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

	public JButton getBtnModificarRecordatoriosPagos() {
		return btnModificarRecordatoriosPagos;
	}

	public void setBtnModificarRecordatoriosPagos(JButton btnModificarRecordatoriosPagos) {
		this.btnModificarRecordatoriosPagos = btnModificarRecordatoriosPagos;
	}

	public JButton getBtnEliminarRecordatoriosPagos() {
		return btnEliminarRecordatoriosPagos;
	}

	public void setBtnEliminarRecordatoriosPagos(JButton btnEliminarRecordatoriosPagos) {
		this.btnEliminarRecordatoriosPagos = btnEliminarRecordatoriosPagos;
	}

	public JButton getBtnBuscarRecordatorioPagos() {
		return btnBuscarRecordatorioPagos;
	}

	public void setBtnBuscarRecordatorioPagos(JButton btnBuscarRecordatorioPagos) {
		this.btnBuscarRecordatorioPagos = btnBuscarRecordatorioPagos;
	}

	public static String getModificarrecordatoriosstock() {
		return ModificarRecordatoriosPagos;
	}

	public static String getVolver() {
		return volverRecordatoriosPagoLista;
	}

	public static String getEliminarrecordatoriosstock() {
		return eliminarRecordatoriosPagos;
	}

	public static String getBuscarrecordatoriosstock() {
		return buscarRecordatoriosPagos;
	}
	
	

}


