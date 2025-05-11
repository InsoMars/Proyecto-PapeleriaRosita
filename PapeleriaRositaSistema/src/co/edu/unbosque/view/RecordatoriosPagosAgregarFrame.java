package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosPagosAgregarFrame extends JFrame{
	
	private RecordatoriosPagosAgregarPanel recordatoriosPagosAgregarPanel;
	
	
public RecordatoriosPagosAgregarFrame(Controller control) {
		
	recordatoriosPagosAgregarPanel=new RecordatoriosPagosAgregarPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(recordatoriosPagosAgregarPanel);
		
		
		recordatoriosPagosAgregarPanel.getBtnAgregar().addActionListener(control);
		recordatoriosPagosAgregarPanel.getBtnVolver().addActionListener(control);
		
		
	}


public RecordatoriosPagosAgregarPanel getRecordatoriosPagosAgregarPanel() {
	return recordatoriosPagosAgregarPanel;
}


public void setRecordatoriosPagosAgregarPanel(RecordatoriosPagosAgregarPanel recordatoriosPagosAgregarPanel) {
	this.recordatoriosPagosAgregarPanel = recordatoriosPagosAgregarPanel;
}
	


	


}
