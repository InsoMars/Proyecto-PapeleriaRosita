package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class ReportesAdminFrame extends JFrame {
	
	private ReportesAdminPanel reportesAdminPanel;
	
	
	public ReportesAdminFrame(Controller control) {
		// TODO Auto-generated constructor stub
		
		reportesAdminPanel=new ReportesAdminPanel();
		
		setTitle("Sistema de Información Papeleria Rosita- VENDEDOR");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		add(reportesAdminPanel);
		
		
		reportesAdminPanel.getBtnReporteCostos().addActionListener(control);
		reportesAdminPanel.getBtnReporteDirProveedores().addActionListener(control);
		reportesAdminPanel.getBtnReporteGanancias().addActionListener(control);
		reportesAdminPanel.getBtnReporteGastos().addActionListener(control);
		reportesAdminPanel.getBtnReporteIngEg().addActionListener(control);
		reportesAdminPanel.getBtnReporteInventario().addActionListener(control);
		reportesAdminPanel.getBtnReporteVentas().addActionListener(control);
		reportesAdminPanel.getBtnVolver().addActionListener(control);
		
	}


	public ReportesAdminPanel getReportesAdminPanel() {
		return reportesAdminPanel;
	}


	public void setReportesAdminPanel(ReportesAdminPanel reportesAdminPanel) {
		this.reportesAdminPanel = reportesAdminPanel;
	}
	
	

}
