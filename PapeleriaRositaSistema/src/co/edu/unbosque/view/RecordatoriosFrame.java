package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class RecordatoriosFrame  extends JFrame{
	
	private RecordatoriosPanel recordatoriosMenuPanel;
	
	public RecordatoriosFrame(Controller control) {

		recordatoriosMenuPanel= new RecordatoriosPanel();
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		add(recordatoriosMenuPanel);
		
		recordatoriosMenuPanel.getBtnVolver().addActionListener(control);;
		recordatoriosMenuPanel.getbtnRecordatorioPagos().addActionListener(control);
		recordatoriosMenuPanel.getbtnRecordatorioStock().addActionListener(control);
		
		
		
		
		
		
		
		
	}

	public RecordatoriosPanel getRecordatoriosMenuPanel() {
		return recordatoriosMenuPanel;
	}

	public void setRecordatoriosMenuPanel(RecordatoriosPanel recordatoriosMenuPanel) {
		this.recordatoriosMenuPanel = recordatoriosMenuPanel;
	}


	
	
	
	
	

}
