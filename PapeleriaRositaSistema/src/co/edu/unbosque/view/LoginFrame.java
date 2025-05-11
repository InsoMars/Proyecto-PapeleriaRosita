package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class LoginFrame extends JFrame {
	
	private LoginPanel loginPanel;
	
	public LoginFrame(Controller control) {
		// TODO Auto-generated constructor stub
		
		loginPanel=new LoginPanel();
		setTitle("Sistema de Información Papeleria Rosita");
		setVisible(false);
		setSize(1300,800);
		setResizable(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		loginPanel.getBtnIniciarSesion().addActionListener(control);
		
		add(loginPanel);
		
	}

	public LoginPanel getLoginPanel() {
		return loginPanel;
	}

	public void setLoginPanel(LoginPanel loginPanel) {
		this.loginPanel = loginPanel;
	}
	
	

}
