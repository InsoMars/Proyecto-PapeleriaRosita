package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecordatoriosStockMenuPanel extends JPanel {
	
	
	private JButton btnAgregarRecordatoriosStock,btnVerLista,btnModificarRecordatoriosStock,btnVolver;
	private JLabel wallcreate;
	public static final String AgregarRecordatoriosStock = "AgregarRecordatoriosStock";
	public static final String VerListaRecordatoriosStock = "VerListaRecordatoriosStock";
	public static final String ModificarRecordatoriosStock = "ModificarRecordatoriosStock";
	public static final String volverRecordatorioStockMenu = "volverRecordatorioStockMenu";
	
	
	public RecordatoriosStockMenuPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/recordatoriosMenuStock.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		
		btnAgregarRecordatoriosStock = new JButton();
		btnAgregarRecordatoriosStock.setBounds(250, 385, 200, 153);
		btnAgregarRecordatoriosStock.setBackground(Color.white);
		btnAgregarRecordatoriosStock.setForeground(Color.WHITE);
		btnAgregarRecordatoriosStock.setOpaque(false);

		btnAgregarRecordatoriosStock.setActionCommand(AgregarRecordatoriosStock);
	
		
		btnVerLista = new JButton();
		btnVerLista.setBounds(490, 385, 200, 153);
		btnVerLista.setBackground(Color.blue);
		btnVerLista.setForeground(Color.blue);
		btnVerLista.setOpaque(false);

		btnVerLista.setActionCommand(VerListaRecordatoriosStock);
		
		
		btnModificarRecordatoriosStock = new JButton();
		btnModificarRecordatoriosStock.setBounds(730, 385, 200, 153);
		btnModificarRecordatoriosStock.setBackground(Color.yellow);
		btnModificarRecordatoriosStock.setForeground(Color.yellow);
		btnModificarRecordatoriosStock.setOpaque(false);
		
		btnModificarRecordatoriosStock.setActionCommand(ModificarRecordatoriosStock);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverRecordatorioStockMenu);

		add(wallcreate);
		add(btnAgregarRecordatoriosStock);
		add(btnModificarRecordatoriosStock);
		add(btnVerLista);
		add(btnVolver);
		
		
	
	}


	public JButton getBtnAgregarRecordatoriosStock() {
		return btnAgregarRecordatoriosStock;
	}


	public void setBtnAgregarRecordatoriosStock(JButton btnAgregarRecordatoriosStock) {
		this.btnAgregarRecordatoriosStock = btnAgregarRecordatoriosStock;
	}


	public JButton getBtnVerLista() {
		return btnVerLista;
	}


	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}


	public JButton getBtnModificarRecordatoriosStock() {
		return btnModificarRecordatoriosStock;
	}


	public void setBtnModificarRecordatoriosStock(JButton btnModificarRecordatoriosStock) {
		this.btnModificarRecordatoriosStock = btnModificarRecordatoriosStock;
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


	public static String getAgregarrecordatoriosstock() {
		return AgregarRecordatoriosStock;
	}


	public static String getVerlistarecordatoriosstock() {
		return VerListaRecordatoriosStock;
	}


	public static String getModificarrecordatoriosstock() {
		return ModificarRecordatoriosStock;
	}


	public static String getVolverrecordatoriostockmenu() {
		return volverRecordatorioStockMenu;
	}

	
	

}
