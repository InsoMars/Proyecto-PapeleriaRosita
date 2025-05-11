package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecordatoriosPanel extends JPanel {

	private JButton btnRecordatorioStock, btnRecordatorioPagos, btnVolver;
	private JLabel wallcreate;
	public static final String abrirbtnRecordatorioStock = "abrirbtnRecordatorioStock";
	public static final String abrirbtnRecordatorioPagos = "abrirbtnRecordatorioPagos";
	public static final String volverRecordatoriosMenu = "volverRecordatoriosMenu";

	public RecordatoriosPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/recordatorios.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnRecordatorioStock = new JButton();
		btnRecordatorioStock.setBounds(240, 300, 270, 115);
		btnRecordatorioStock.setBackground(Color.white);
		btnRecordatorioStock.setForeground(Color.WHITE);
		btnRecordatorioStock.setOpaque(false);

		btnRecordatorioStock.setActionCommand(abrirbtnRecordatorioStock);
		
		btnRecordatorioPagos = new JButton();
		btnRecordatorioPagos.setBounds(240, 430, 270, 120);
		btnRecordatorioPagos.setBackground(Color.white);
		btnRecordatorioPagos.setForeground(Color.WHITE);
		btnRecordatorioPagos.setOpaque(false);
		
		btnRecordatorioPagos.setActionCommand(abrirbtnRecordatorioPagos);

		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverRecordatoriosMenu);

		add(wallcreate);
		add(btnRecordatorioStock);
		add(btnRecordatorioPagos);
		add(btnVolver);

	}

	public JButton getbtnRecordatorioStock() {
		return btnRecordatorioStock;
	}

	public void setbtnRecordatorioStock(JButton btnRecordatorioStock) {
		this.btnRecordatorioStock = btnRecordatorioStock;
	}

	public JButton getbtnRecordatorioPagos() {
		return btnRecordatorioPagos;
	}

	public void setbtnRecordatorioPagos(JButton btnRecordatorioPagos) {
		this.btnRecordatorioPagos = btnRecordatorioPagos;
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

	public static String getAbrirbtnRecordatorioStock() {
		return abrirbtnRecordatorioStock;
	}

	public static String getAbrirbtnRecordatorioPagos() {
		return abrirbtnRecordatorioPagos;
	}

	public static String getVolver() {
		return volverRecordatoriosMenu;
	}

	
}