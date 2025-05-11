package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosPagosListaFrame extends JFrame {
	
private RecordatoriosPagosListaPanel recordatoriosPagosListaPanel;
	
	
	public RecordatoriosPagosListaFrame(Controller control) {

		recordatoriosPagosListaPanel=new RecordatoriosPagosListaPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(recordatoriosPagosListaPanel);
		
		
		recordatoriosPagosListaPanel.getBtnEliminarRecordatoriosPagos().addActionListener(control);
		recordatoriosPagosListaPanel.getBtnModificarRecordatoriosPagos().addActionListener(control);
		recordatoriosPagosListaPanel.getBtnVolver().addActionListener(control);
		
	}


	public RecordatoriosPagosListaPanel getRecordatoriosPagosListaPanel() {
		return recordatoriosPagosListaPanel;
	}


	public void setRecordatoriosPagosListaPanel(RecordatoriosPagosListaPanel recordatoriosPagosListaPanel) {
		this.recordatoriosPagosListaPanel = recordatoriosPagosListaPanel;
	}



	

}


