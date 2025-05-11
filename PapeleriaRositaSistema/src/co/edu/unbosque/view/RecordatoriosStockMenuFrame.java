package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosStockMenuFrame extends JFrame {
	
	private RecordatoriosStockMenuPanel recordatoriosStockMenuPanel;
	
	
	public RecordatoriosStockMenuFrame(Controller control) {

	recordatoriosStockMenuPanel=new RecordatoriosStockMenuPanel();
	
	setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
	setVisible(false);
	setSize(1300,800);
	setResizable(false);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	setLocationRelativeTo(null);
	
	add(recordatoriosStockMenuPanel);
	
	
	recordatoriosStockMenuPanel.getBtnAgregarRecordatoriosStock().addActionListener(control);
	recordatoriosStockMenuPanel.getBtnModificarRecordatoriosStock().addActionListener(control);
	recordatoriosStockMenuPanel.getBtnVerLista().addActionListener(control);
	recordatoriosStockMenuPanel.getBtnVolver().addActionListener(control);
	
	}


	public RecordatoriosStockMenuPanel getRecordatoriosStockMenuPanel() {
		return recordatoriosStockMenuPanel;
	}


	public void setRecordatoriosStockMenuPanel(RecordatoriosStockMenuPanel recordatoriosStockMenuPanel) {
		this.recordatoriosStockMenuPanel = recordatoriosStockMenuPanel;
	}

}
