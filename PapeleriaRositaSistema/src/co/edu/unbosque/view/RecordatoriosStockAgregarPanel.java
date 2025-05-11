package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RecordatoriosStockAgregarPanel extends JPanel {
	
	private JTextField txtIdProducto,txtUnidadesMin;
	private JButton btnAgregar,btnVolver, btnBuscarIdProducto;
	private JLabel wallcreate;
	public static final String volverRecordatoriosStockAgregar = "volverRecordatoriosStockAgregar";
	public static final String agregarRecordatorioStock = "agregarRecordatorioStock";
	public static final String BuscarIdProducto = "BuscarIdProducto";
	

public RecordatoriosStockAgregarPanel() {
	
	setLayout(null);
	setVisible(true);
	setBackground(Color.black);
	
	wallcreate = new JLabel();
	wallcreate.setBounds(0, 0, 1300, 780);
	Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/agregarRecordatorioStock.png").getImage();
	ImageIcon image = new ImageIcon(
			temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
	wallcreate.setIcon(image);
	
	
	txtIdProducto= new JTextField();
	txtIdProducto.setBounds(352,335,200,40);
	txtIdProducto.setFont(new Font("Arial", ALLBITS, 20));
	txtIdProducto.setOpaque(false);
	txtIdProducto.setBorder(null);
	
	txtUnidadesMin= new JTextField();
	txtUnidadesMin.setBounds(400,407,170,30);
	txtUnidadesMin.setFont(new Font("Arial", ALLBITS, 20));
	txtUnidadesMin.setOpaque(false);
	txtUnidadesMin.setBorder(null);
	
	btnBuscarIdProducto= new JButton();
	btnBuscarIdProducto = new JButton();
	btnBuscarIdProducto.setBounds(460, 250, 70, 60);
	btnBuscarIdProducto.setBackground(Color.yellow);
	btnBuscarIdProducto.setForeground(Color.yellow);
	btnBuscarIdProducto.setOpaque(false);

	btnBuscarIdProducto.setActionCommand(BuscarIdProducto);
	
	
	btnVolver = new JButton();
	btnVolver.setBounds(70, 650, 95, 100);
	btnVolver.setBackground(Color.yellow);
	btnVolver.setForeground(Color.yellow);
	btnVolver.setOpaque(false);

	btnVolver.setActionCommand(volverRecordatoriosStockAgregar);
	
	btnAgregar = new JButton();
	btnAgregar.setBounds(200, 515, 275, 50);
	btnAgregar.setBackground(Color.yellow);
	btnAgregar.setForeground(Color.yellow);
	btnAgregar.setOpaque(false);

	btnAgregar.setActionCommand(agregarRecordatorioStock);
	
	add(wallcreate);
	add(txtIdProducto);
	add(txtUnidadesMin);
	add(btnBuscarIdProducto);
	add(btnAgregar);
	add(btnVolver);
	





}


public JTextField getTxtIdProducto() {
	return txtIdProducto;
}


public void setTxtIdProducto(JTextField txtIdProducto) {
	this.txtIdProducto = txtIdProducto;
}


public JTextField getTxtUnidadesMin() {
	return txtUnidadesMin;
}


public void setTxtUnidadesMin(JTextField txtUnidadesMin) {
	this.txtUnidadesMin = txtUnidadesMin;
}


public JButton getBtnAgregar() {
	return btnAgregar;
}


public void setBtnAgregar(JButton btnAgregar) {
	this.btnAgregar = btnAgregar;
}


public JButton getBtnVolver() {
	return btnVolver;
}


public void setBtnVolver(JButton btnVolver) {
	this.btnVolver = btnVolver;
}


public JButton getBtnBuscarIdProducto() {
	return btnBuscarIdProducto;
}


public void setBtnBuscarIdProducto(JButton btnBuscarIdProducto) {
	this.btnBuscarIdProducto = btnBuscarIdProducto;
}


public JLabel getWallcreate() {
	return wallcreate;
}


public void setWallcreate(JLabel wallcreate) {
	this.wallcreate = wallcreate;
}


public static String getVolverrecordatoriosstockagregar() {
	return volverRecordatoriosStockAgregar;
}


public static String getAgregarrecordatoriostock() {
	return agregarRecordatorioStock;
}


public static String getBuscaridproducto() {
	return BuscarIdProducto;
}




}