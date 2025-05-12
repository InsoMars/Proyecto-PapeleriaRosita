package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.model.ProveedorDTO;
import co.edu.unbosque.model.persistence.ProveedorDAO;

public class ProveedorListaPanel extends JPanel {

	private JLabel wallcreate;
	private JButton btnVolver, btnModificarProveedor, btnEliminarProveedor, btnBuscarProveedor;
	public static final String ModificarProveedor = "ModificarProveedor";
	public static final String volverProveedorLista = "volverProveedorLista";
	public static final String eliminarProveedor = "eliminarProveedor";
	public static final String buscarProveedor = "buscarProveedor";
	private JTable tablaProveedores;
	private DefaultTableModel modeloTabla;
	private JScrollPane scrollTabla;
	ArrayList<ProveedorDTO> listaProv;
	private ProveedorDAO proveedorDAO;
	int fila= -1;
	


	public ProveedorListaPanel() { 
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.black);
		
		modeloTabla = new DefaultTableModel();
		tablaProveedores = new JTable(modeloTabla);
		scrollTabla = new JScrollPane(tablaProveedores);
		scrollTabla.setBounds(100, 320, 950, 300); 
		modeloTabla.addColumn("ID");
		modeloTabla.addColumn("Nombre");
		modeloTabla.addColumn("Apellido");
		modeloTabla.addColumn("Celular");
		modeloTabla.addColumn("Dirección");
		modeloTabla.addColumn("Descripción");
		actualizarTabla();

		add(scrollTabla);


		wallcreate = new JLabel();
		wallcreate.setBounds(0, 0, 1300, 800);
		Image temp = new ImageIcon("src/co/edu/unbosque/view/imagenes/listaProveedor.png").getImage();
		ImageIcon image = new ImageIcon(
				temp.getScaledInstance(wallcreate.getWidth(), wallcreate.getHeight(), Image.SCALE_SMOOTH));
		wallcreate.setIcon(image);

		btnBuscarProveedor = new JButton();
		btnBuscarProveedor.setBounds(710, 240, 80, 70);
		btnBuscarProveedor.setBackground(Color.white);
		btnBuscarProveedor.setForeground(Color.WHITE);
		btnBuscarProveedor.setOpaque(false);

		btnBuscarProveedor.setActionCommand(ModificarProveedor);

		btnModificarProveedor = new JButton();
		btnModificarProveedor.setBounds(1125, 420, 150, 80);
		btnModificarProveedor.setBackground(Color.white);
		btnModificarProveedor.setForeground(Color.WHITE);
		btnModificarProveedor.setOpaque(false);

		btnModificarProveedor.setActionCommand(ModificarProveedor);

		btnEliminarProveedor = new JButton();
		btnEliminarProveedor.setBounds(1125, 540, 150, 80);
		btnEliminarProveedor.setBackground(Color.white);
		btnEliminarProveedor.setForeground(Color.WHITE);
		btnEliminarProveedor.setOpaque(false);

		btnEliminarProveedor.setActionCommand(eliminarProveedor);

		btnVolver = new JButton();
		btnVolver.setBounds(50, 620, 100, 100);
		btnVolver.setBackground(Color.yellow);
		btnVolver.setForeground(Color.yellow);
		btnVolver.setOpaque(false);

		btnVolver.setActionCommand(volverProveedorLista);
		
		
		add(wallcreate);
		add(btnBuscarProveedor);
		add(btnModificarProveedor);
		add(btnVolver);
		add(btnEliminarProveedor);

	}
	
	public void actualizarTabla() {
	
		
		while(modeloTabla.getRowCount()>0) {
			modeloTabla.removeRow(0);
		}
		
		proveedorDAO= new ProveedorDAO();
		listaProv=proveedorDAO.consultaProveedores();
		for(ProveedorDTO p: listaProv) {
			Object prov[]= new Object[6];
			prov[0]= p.getId_proveedor();
			prov[1]= p.getNombre();
			prov[2]= p.getApellido();
			prov[3]= p.getCelular();
			prov[4]= p.getDireccion();
			prov[5]= p.getDescripcion();
			modeloTabla.addRow(prov);
		}
		tablaProveedores.setModel(modeloTabla);
	}
	
	public int getProveedorSeleccionadoId() {
	    int filaSeleccionada = tablaProveedores.getSelectedRow();
	    if (filaSeleccionada != -1) {
	        return (int) modeloTabla.getValueAt(filaSeleccionada, 0); 
	    } else {
	        return -1; 
	    }
	}
	
	
	public ProveedorDTO getProveedorSeleccionado() {
	    int fila = tablaProveedores.getSelectedRow();
	    if (fila == -1) {
	        return null;
	    }

	    ProveedorDTO p = new ProveedorDTO();
	    p.setId_proveedor((int) modeloTabla.getValueAt(fila, 0));
	    p.setNombre((String) modeloTabla.getValueAt(fila, 1));
	    p.setApellido((String) modeloTabla.getValueAt(fila, 2));
	    p.setCelular((String) modeloTabla.getValueAt(fila, 3));
	    p.setDireccion((String) modeloTabla.getValueAt(fila, 4));
	    p.setDescripcion((String) modeloTabla.getValueAt(fila, 5));

	    return p;
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

	public JButton getBtnModificarProveedor() {
		return btnModificarProveedor;
	}

	public void setBtnModificarProveedor(JButton btnModificarProveedor) {
		this.btnModificarProveedor = btnModificarProveedor;
	}

	public JButton getBtnEliminarProveedor() {
		return btnEliminarProveedor;
	}

	public void setBtnEliminarProveedor(JButton btnEliminarProveedor) {
		this.btnEliminarProveedor = btnEliminarProveedor;
	}

	public static String getModificarProveedor() {
		return ModificarProveedor;
	}

	public static String getVolver() {
		return volverProveedorLista;
	}

	public static String getEliminarProveedor() {
		return eliminarProveedor;
	}

	public JButton getBtnBuscarProveedor() {
		return btnBuscarProveedor;
	}

	public void setBtnBuscarProveedor(JButton btnBuscarProveedor) {
		this.btnBuscarProveedor = btnBuscarProveedor;
	}

	public JTable getTablaProveedores() {
		return tablaProveedores;
	}

	public void setTablaProveedores(JTable tablaProveedores) {
		this.tablaProveedores = tablaProveedores;
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}

	public JScrollPane getScrollTabla() {
		return scrollTabla;
	}

	public void setScrollTabla(JScrollPane scrollTabla) {
		this.scrollTabla = scrollTabla;
	}

	public ArrayList<ProveedorDTO> getListaProv() {
		return listaProv;
	}

	public void setListaProv(ArrayList<ProveedorDTO> listaProv) {
		this.listaProv = listaProv;
	}

	public ProveedorDAO getProveedorDAO() {
		return proveedorDAO;
	}

	public void setProveedorDAO(ProveedorDAO proveedorDAO) {
		this.proveedorDAO = proveedorDAO;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public static String getModificarproveedor() {
		return ModificarProveedor;
	}

	public static String getVolverproveedorlista() {
		return volverProveedorLista;
	}

	public static String getEliminarproveedor() {
		return eliminarProveedor;
	}

	public static String getBuscarproveedor() {
		return buscarProveedor;
	}
	
	

}
