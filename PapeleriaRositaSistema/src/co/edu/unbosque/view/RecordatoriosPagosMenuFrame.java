package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosPagosMenuFrame extends JFrame {
	
	private RecordatoriosPagosMenuPanel recordatoriosPagosMenuPanel;
	
	
	public RecordatoriosPagosMenuFrame(Controller control) {

	recordatoriosPagosMenuPanel=new RecordatoriosPagosMenuPanel();
	
	setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
	setVisible(false);
	setSize(1300,800);
	setResizable(false);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	setLocationRelativeTo(null);
	
	add(recordatoriosPagosMenuPanel);
	
	
	recordatoriosPagosMenuPanel.getBtnAgregarRecordatoriosPagos().addActionListener(control);
	recordatoriosPagosMenuPanel.getBtnModificarRecordatoriosPagos().addActionListener(control);
	recordatoriosPagosMenuPanel.getBtnVerLista().addActionListener(control);
	recordatoriosPagosMenuPanel.getBtnVolver().addActionListener(control);
	
	}


	public RecordatoriosPagosMenuPanel getRecordatoriosPagosMenuPanel() {
		return recordatoriosPagosMenuPanel;
	}


	public void setRecordatoriosPagosMenuPanel(RecordatoriosPagosMenuPanel recordatoriosPagosMenuPanel) {
		this.recordatoriosPagosMenuPanel = recordatoriosPagosMenuPanel;
	}

}
