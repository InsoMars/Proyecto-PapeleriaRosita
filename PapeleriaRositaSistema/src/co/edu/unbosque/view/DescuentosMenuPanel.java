package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DescuentosMenuPanel extends JPanel{
	
	private JButton btnAgregarDescuentos,btnVerLista,btnModificarDescuentos, btnVolver;
	private JLabel wallcreate;
	public static final String AgregarDescuentos = "AgregarDescuentos";
	public static final String VerListaDescuentos = "VerListaDescuentos";
	public static final String ModificarDescuentos = "ModificarDescuentos";
	public static final String volverDescuentosMenu = "volverDescuentosMenu";
	
	
	public DescuentosMenuPanel() {
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/descuentos.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnAgregarDescuentos = new JButton();
		btnAgregarDescuentos.setBounds(330, 400, 200, 140);
		btnAgregarDescuentos.setBackground(Color.white);
		btnAgregarDescuentos.setForeground(Color.WHITE);
		btnAgregarDescuentos.setOpaque(false);

		btnAgregarDescuentos.setActionCommand(AgregarDescuentos);
	
		
		btnVerLista = new JButton();
		btnVerLista.setBounds(570, 380, 200, 160);
		btnVerLista.setBackground(Color.blue);
		btnVerLista.setForeground(Color.blue);
		btnVerLista.setOpaque(false);

		btnVerLista.setActionCommand(VerListaDescuentos);
		
		
		btnModificarDescuentos = new JButton();
		btnModificarDescuentos.setBounds(800, 385, 200, 153);
		btnModificarDescuentos.setBackground(Color.yellow);
		btnModificarDescuentos.setForeground(Color.yellow);
		btnModificarDescuentos.setOpaque(false);
		
		btnModificarDescuentos.setActionCommand(ModificarDescuentos);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverDescuentosMenu);

		add(wallcreate);
		add(btnAgregarDescuentos);
		add(btnModificarDescuentos);
		add(btnVerLista);
		add(btnVolver);
		
		
	
	
	
	
	
	}


	public JButton getBtnAgregarDescuentos() {
		return btnAgregarDescuentos;
	}


	public void setBtnAgregarDescuentos(JButton btnAgregarDescuentos) {
		this.btnAgregarDescuentos = btnAgregarDescuentos;
	}


	public JButton getBtnVerLista() {
		return btnVerLista;
	}


	public void setBtnVerLista(JButton btnVerLista) {
		this.btnVerLista = btnVerLista;
	}


	public JButton getBtnModificarDescuentos() {
		return btnModificarDescuentos;
	}


	public void setBtnModificarDescuentos(JButton btnModificarDescuentos) {
		this.btnModificarDescuentos = btnModificarDescuentos;
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


	public static String getAgregardescuentos() {
		return AgregarDescuentos;
	}


	public static String getVerlistadescuentos() {
		return VerListaDescuentos;
	}


	public static String getModificardescuentos() {
		return ModificarDescuentos;
	}


	public static String getVolver() {
		return volverDescuentosMenu;
	}
	
	
	
	

}
