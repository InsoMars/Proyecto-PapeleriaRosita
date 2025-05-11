package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosStockAgregarFrame extends JFrame{
	
	private RecordatoriosStockAgregarPanel RecordatoriosStockAgregarPanel;

	public RecordatoriosStockAgregarFrame(Controller control) {
		
		RecordatoriosStockAgregarPanel=new RecordatoriosStockAgregarPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(RecordatoriosStockAgregarPanel);
		
		
		RecordatoriosStockAgregarPanel.getBtnAgregar().addActionListener(control);
		RecordatoriosStockAgregarPanel.getBtnVolver().addActionListener(control);
		RecordatoriosStockAgregarPanel.getBtnBuscarIdProducto().addActionListener(control);
		
		
	}
	

	public RecordatoriosStockAgregarPanel getRecordatoriosStockAgregarPanel() {
		return RecordatoriosStockAgregarPanel;
	}

	public void setRecordatoriosStockAgregarPanel(RecordatoriosStockAgregarPanel recordatoriosStockAgregarPanel) {
		RecordatoriosStockAgregarPanel = recordatoriosStockAgregarPanel;
	}

	
	
	
}
