package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReportesAdminPanel extends JPanel {
	
	
	private JLabel wallcreate;
	private JButton btnVolver,btnReporteGanancias, btnReporteInventario, btnReporteDirProveedores, btnReporteVentas, btnReporteGastos, btnReporteIngEg, btnReporteCostos;
	public static final String volverReportes = "volverReportes";
	public static final String abrirReporteGanancias = "abrirReporteGanancias";
	public static final String abrirReporteInventario = "abrirReporteInventario";
	public static final String abrirReporteDirProveedores= "abrirReporteDirProveedores";	
	public static final String abrirReporteVentas= "abrirReporteVentas";
	public static final String abrirReporteGastos= "abrirReporteGastos";
	public static final String abrirReporteIngEg= "abrirReporteIngEg";
	public static final String abrirReporteCostos= "abrirReporteCostos";
	
	
	public ReportesAdminPanel() {

		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		
		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/generacionReportes.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);
		
		
		btnReporteGanancias=new JButton();
		btnReporteGanancias.setBounds(210, 370, 180, 60);
		btnReporteGanancias.setBackground(Color.white);
		btnReporteGanancias.setForeground(Color.WHITE);
		btnReporteGanancias.setOpaque(false);
		
		btnReporteInventario=new JButton();
		btnReporteInventario.setBounds(430, 370, 180, 70);
		btnReporteInventario.setBackground(Color.white);
		btnReporteInventario.setForeground(Color.WHITE);
		btnReporteInventario.setOpaque(false);
		
		btnReporteDirProveedores=new JButton();
		btnReporteDirProveedores = new JButton();
		btnReporteDirProveedores.setBounds(650, 368, 240, 70);
		btnReporteDirProveedores .setBackground(Color.white);
		btnReporteDirProveedores .setForeground(Color.WHITE);
		btnReporteDirProveedores .setOpaque(false);
		
		btnReporteVentas= new JButton();
		btnReporteVentas=new JButton();
		btnReporteVentas = new JButton();
		btnReporteVentas.setBounds(920, 368, 187, 70);
		btnReporteVentas .setBackground(Color.white);
		btnReporteVentas .setForeground(Color.WHITE);
		btnReporteVentas .setOpaque(false);
		
		
		btnReporteGastos=new JButton();
		btnReporteGastos.setBounds(305, 483, 180, 60);
		btnReporteGastos.setBackground(Color.white);
		btnReporteGastos.setForeground(Color.WHITE);
		btnReporteGastos.setOpaque(false);
		
		btnReporteIngEg=new JButton();
		btnReporteIngEg = new JButton();
		btnReporteIngEg.setBounds(535, 483, 230, 60);
		btnReporteIngEg .setBackground(Color.white);
		btnReporteIngEg .setForeground(Color.WHITE);
		btnReporteIngEg .setOpaque(false);
		
		btnReporteCostos=new JButton();
		btnReporteCostos = new JButton();
		btnReporteCostos.setBounds(815, 483, 180, 60);
		btnReporteCostos .setBackground(Color.white);
		btnReporteCostos .setForeground(Color.WHITE);
		btnReporteCostos .setOpaque(false);
		
		
		btnVolver = new JButton();
		btnVolver.setBounds(60, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverReportes);
		
		
		add(wallcreate);
		add(btnReporteGanancias);
		add(btnReporteInventario);
		add(btnReporteDirProveedores);
		add(btnReporteVentas);
		add(btnReporteGastos);
		add(btnReporteIngEg);
		add(btnReporteCostos);
		add(btnVolver);
	
	}


	


	public static String getVolverreportes() {
		return volverReportes;
	}





	public static String getAbrirreporteganancias() {
		return abrirReporteGanancias;
	}





	public static String getAbrirreporteinventario() {
		return abrirReporteInventario;
	}





	public static String getAbrirreportedirproveedores() {
		return abrirReporteDirProveedores;
	}





	public static String getAbrirreporteventas() {
		return abrirReporteVentas;
	}





	public static String getAbrirreportegastos() {
		return abrirReporteGastos;
	}





	public static String getAbrirreporteingeg() {
		return abrirReporteIngEg;
	}





	public static String getAbrirreportecostos() {
		return abrirReporteCostos;
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


	public JButton getBtnReporteGanancias() {
		return btnReporteGanancias;
	}


	public void setBtnReporteGanancias(JButton btnReporteGanancias) {
		this.btnReporteGanancias = btnReporteGanancias;
	}


	public JButton getBtnReporteInventario() {
		return btnReporteInventario;
	}


	public void setBtnReporteInventario(JButton btnReporteInventario) {
		this.btnReporteInventario = btnReporteInventario;
	}


	public JButton getBtnReporteDirProveedores() {
		return btnReporteDirProveedores;
	}


	public void setBtnReporteDirProveedores(JButton btnReporteDirProveedores) {
		this.btnReporteDirProveedores = btnReporteDirProveedores;
	}


	public JButton getBtnReporteVentas() {
		return btnReporteVentas;
	}


	public void setBtnReporteVentas(JButton btnReporteVentas) {
		this.btnReporteVentas = btnReporteVentas;
	}


	public JButton getBtnReporteGastos() {
		return btnReporteGastos;
	}


	public void setBtnReporteGastos(JButton btnReporteGastos) {
		this.btnReporteGastos = btnReporteGastos;
	}


	public JButton getBtnReporteIngEg() {
		return btnReporteIngEg;
	}


	public void setBtnReporteIngEg(JButton btnReporteIngEg) {
		this.btnReporteIngEg = btnReporteIngEg;
	}


	public JButton getBtnReporteCostos() {
		return btnReporteCostos;
	}


	public void setBtnReporteCostos(JButton btnReporteCostos) {
		this.btnReporteCostos = btnReporteCostos;
	}


	public static String getVolver() {
		return volverReportes;
	}
	
	

}
