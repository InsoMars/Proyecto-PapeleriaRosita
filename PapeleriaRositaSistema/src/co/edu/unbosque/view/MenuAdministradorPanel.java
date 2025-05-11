package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MenuAdministradorPanel extends JPanel {
	
	private JButton btnVendedores,btnProveedores,btnOrdCompraProveedores,btnDescuentos,btnRecordatorios,btnGenReportes,btnCerrarSesion,btnVolver;
	private JLabel wallcreate;
	public static final String abrirVendedores = "abrirVendedores";
	public static final String abrirProveedores= "abrirProveedores";
	public static final String abrirCompraProveedores= "abrirCompraProveedores";
	public static final String abrirDescuentos = "abrirDescuentos";
	public static final String abrirRecordatorios= "abrirRecordatorios";
	public static final String abrirGenReportes = "abrirGenReportes";
	public static final String CerrarSesion = "CerrarSesion";
	
	
	public MenuAdministradorPanel() {
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);

		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/menuAdministrador.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnVendedores = new JButton();
		btnVendedores.setBounds(315, 280, 190, 150);
		btnVendedores.setBackground(Color.white);
		btnVendedores.setForeground(Color.WHITE);
		btnVendedores.setOpaque(false);

		btnVendedores.setActionCommand(abrirVendedores);

		btnProveedores = new JButton();
		btnProveedores.setBounds(570, 280, 180, 150);
		btnProveedores.setBackground(Color.blue);
		btnProveedores.setForeground(Color.blue);
		btnProveedores.setOpaque(false);
		
		btnProveedores.setActionCommand(abrirProveedores);

		btnGenReportes = new JButton();
		btnGenReportes.setBounds(805, 280, 200, 150);
		btnGenReportes.setBackground(Color.yellow);
		btnGenReportes.setForeground(Color.yellow);
		btnGenReportes.setOpaque(false);
		
		btnGenReportes.setActionCommand(abrirGenReportes);

		btnOrdCompraProveedores = new JButton();
		btnOrdCompraProveedores.setBounds(315, 470, 190, 150);
		btnOrdCompraProveedores.setBackground(Color.yellow);
		btnOrdCompraProveedores.setForeground(Color.yellow);
		btnOrdCompraProveedores.setOpaque(false);
		
		btnOrdCompraProveedores.setActionCommand(abrirCompraProveedores);

		btnDescuentos = new JButton();
		btnDescuentos.setBounds(570, 465, 185, 150);
		btnDescuentos.setBackground(Color.yellow);
		btnDescuentos.setForeground(Color.yellow);
		btnDescuentos.setOpaque(false);
		
		btnDescuentos.setActionCommand(abrirDescuentos);
		
		btnRecordatorios = new JButton();
		btnRecordatorios.setBounds(808, 468, 196, 150);
		btnRecordatorios.setBackground(Color.yellow);
		btnRecordatorios.setForeground(Color.yellow);
		btnRecordatorios.setOpaque(false);
		
		btnRecordatorios.setActionCommand(abrirRecordatorios);

		btnCerrarSesion = new JButton();
		btnCerrarSesion.setBounds(1100, 45, 150, 115);
		btnCerrarSesion.setBackground(Color.yellow);
		btnCerrarSesion.setForeground(Color.yellow);
		btnCerrarSesion.setOpaque(false);
		
		btnCerrarSesion.setActionCommand(CerrarSesion);
		
		btnVolver = new JButton();
		btnVolver.setBounds(80, 620, 150, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);
		
		
		
		
		add(wallcreate);
		add(btnOrdCompraProveedores);
		add(btnVendedores);
		add(btnCerrarSesion);
		add(btnDescuentos);
		add(btnGenReportes);
		add(btnProveedores);
		add(btnRecordatorios);
		add(btnCerrarSesion);
		
		
		
	}

	public JButton getBtnVendedores() {
		return btnVendedores;
	}

	public void setBtnVendedores(JButton btnVendedores) {
		this.btnVendedores = btnVendedores;
	}

	public JButton getBtnProveedores() {
		return btnProveedores;
	}

	public void setBtnProveedores(JButton btnProveedores) {
		this.btnProveedores = btnProveedores;
	}

	public JButton getBtnOrdCompraProveedores() {
		return btnOrdCompraProveedores;
	}

	public void setBtnOrdCompraProveedores(JButton btnOrdCompraProveedores) {
		this.btnOrdCompraProveedores = btnOrdCompraProveedores;
	}

	public JButton getBtnDescuentos() {
		return btnDescuentos;
	}

	public void setBtnDescuentos(JButton btnDescuentos) {
		this.btnDescuentos = btnDescuentos;
	}

	public JButton getBtnRecordatorios() {
		return btnRecordatorios;
	}

	public void setBtnRecordatorios(JButton btnRecordatorios) {
		this.btnRecordatorios = btnRecordatorios;
	}

	public JButton getBtnGenReportes() {
		return btnGenReportes;
	}

	public void setBtnGenReportes(JButton btnGenReportes) {
		this.btnGenReportes = btnGenReportes;
	}

	public JButton getBtnCerrarSesion() {
		return btnCerrarSesion;
	}

	public void setBtnCerrarSesion(JButton btnCerrarSesion) {
		this.btnCerrarSesion = btnCerrarSesion;
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

	public static String getAbrirvendedores() {
		return abrirVendedores;
	}

	public static String getAbrirproveedores() {
		return abrirProveedores;
	}

	public static String getAbrircompraproveedores() {
		return abrirCompraProveedores;
	}

	public static String getAbrirdescuentos() {
		return abrirDescuentos;
	}

	public static String getAbrirrecordatorios() {
		return abrirRecordatorios;
	}

	public static String getAbrirgenreportes() {
		return abrirGenReportes;
	}

	public static String getCerrarsesion() {
		return CerrarSesion;
	}


	
	

}
