package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosStockListaFrame  extends JFrame{

private RecordatoriosStockListaPanel recordatoriosStockListaPanel;
	
	
	public RecordatoriosStockListaFrame(Controller control) {

		recordatoriosStockListaPanel=new RecordatoriosStockListaPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(recordatoriosStockListaPanel);
		
		
		recordatoriosStockListaPanel.getBtnEliminarRecordatoriosStock().addActionListener(control);
		recordatoriosStockListaPanel.getBtnModificarRecordatoriosStock().addActionListener(control);
		recordatoriosStockListaPanel.getBtnVolver().addActionListener(control);
		
	}


	public RecordatoriosStockListaPanel getRecordatoriosStockListaPanel() {
		return recordatoriosStockListaPanel;
	}


	public void setRecordatoriosStockListaPanel(RecordatoriosStockListaPanel recordatoriosStockListaPanel) {
		this.recordatoriosStockListaPanel = recordatoriosStockListaPanel;
	}



	

}
