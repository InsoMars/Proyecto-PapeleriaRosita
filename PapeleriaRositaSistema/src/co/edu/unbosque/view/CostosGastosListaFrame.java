package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.edu.unbosque.controller.Controller;

public class CostosGastosListaFrame extends JFrame {

	private CostosGastosListaPanel costosGastosListaPanel;

	public CostosGastosListaFrame(Controller control) {
		
	
	costosGastosListaPanel=new CostosGastosListaPanel();
			setTitle("Sistema de Información Papeleria Rosita");
	setVisible(false);
	setSize(1300,800);
	setResizable(false);
	setDefaultCloseOperation(HIDE_ON_CLOSE);
	setLocationRelativeTo(null);
	
	
	add(costosGastosListaPanel);
	
	costosGastosListaPanel.getBtnBuscarCostosGastos().addActionListener(control);
	costosGastosListaPanel.getBtnEliminarCostosGastos().addActionListener(control);
	costosGastosListaPanel.getBtnModificarCostosGastos().addActionListener(control);
	costosGastosListaPanel.getBtnVolver().addActionListener(control);
	
	}

	public CostosGastosListaPanel getCostosGastosListaPanel() {
		return costosGastosListaPanel;
	}

	public void setCostosGastosListaPanel(CostosGastosListaPanel costosGastosListaPanel) {
		this.costosGastosListaPanel = costosGastosListaPanel;
	}

}
