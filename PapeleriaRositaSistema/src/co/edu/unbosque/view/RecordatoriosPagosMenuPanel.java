package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecordatoriosPagosMenuPanel extends JPanel {
	
	
	private JButton btnAgregarRecordatoriosPagos,btnVerLista,btnModificarRecordatoriosPagos,btnVolver;
	private JLabel wallcreate;
	public static final String AgregarRecordatoriosPagos = "AgregarRecordatoriosPagos";
	public static final String VerListaRecordatoriosPagos = "VerListaRecordatoriosPagos";
	public static final String ModificarRecordatoriosPagos = "ModificarRecordatoriosPagos";
	public static final String volverRecordatoriosPagoMenu = "volverRecordatoriosPagoMenu";
	
	
	public RecordatoriosPagosMenuPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/recordatoriosMenuPagos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		
		btnAgregarRecordatoriosPagos = new JButton();
		btnAgregarRecordatoriosPagos.setBounds(250, 385, 200, 153);
		btnAgregarRecordatoriosPagos.setContentAreaFilled(false);
		btnAgregarRecordatoriosPagos.setBorderPainted(false);
		

		btnAgregarRecordatoriosPagos.setActionCommand(AgregarRecordatoriosPagos);
	
		
		btnVerLista = new JButton();
		btnVerLista.setBounds(490, 385, 200, 153);
		btnVerLista.setContentAreaFilled(false);
		btnVerLista.setBorderPainted(false);

		btnVerLista.setActionCommand(VerListaRecordatoriosPagos);
		
		
		btnModificarRecordatoriosPagos = new JButton();
		btnModificarRecordatoriosPagos.setBounds(730, 385, 200, 153);
		btnModificarRecordatoriosPagos.setContentAreaFilled(false);
		btnModificarRecordatoriosPagos.setBorderPainted(false);

		
		btnModificarRecordatoriosPagos.setActionCommand(ModificarRecordatoriosPagos);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorderPainted(false);

		btnVolver.setActionCommand(volverRecordatoriosPagoMenu);

		add(wallcreate);
		add(btnAgregarRecordatoriosPagos);
		add(btnModificarRecordatoriosPagos);
		add(btnVerLista);
		add(btnVolver);
		
		
	
	}


	public JButton getBtnAgregarRecordatoriosPagos() {
		return btnAgregarRecordatoriosPagos;
	}


	public void setBtnAgregarRecordatoriosPagos(JButton btnAgregarRecordatoriosPagos) {
		this.btnAgregarRecordatoriosPagos = btnAgregarRecordatoriosPagos;
	}


	public JButton getBtnVerLista() {
		return btnVerLista;
	}


	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}


	public JButton getBtnModificarRecordatoriosPagos() {
		return btnModificarRecordatoriosPagos;
	}


	public void setBtnModificarRecordatoriosPagos(JButton btnModificarRecordatoriosPagos) {
		this.btnModificarRecordatoriosPagos = btnModificarRecordatoriosPagos;
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


	public static String getAgregarRecordatoriosPagos() {
		return AgregarRecordatoriosPagos;
	}


	public static String getVerListaRecordatoriosPagos() {
		return VerListaRecordatoriosPagos;
	}


	public static String getModificarRecordatoriosPagos() {
		return ModificarRecordatoriosPagos;
	}


	public static String getVolver() {
		return volverRecordatoriosPagoMenu;
	}
	
	

}
