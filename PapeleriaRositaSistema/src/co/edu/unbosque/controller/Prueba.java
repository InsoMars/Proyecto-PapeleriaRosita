package co.edu.unbosque.controller;
import javax.swing.*;


public class Prueba {


	    public static void main(String[] args) {
	        JTextField nombreField = new JTextField();
	        JTextField edadField = new JTextField();
	        String[] opcionesGenero = {"Masculino", "Femenino", "Otro"};
	        JComboBox<String> generoBox = new JComboBox<>(opcionesGenero);

	        Object[] mensaje = {
	            "Nombre:", nombreField,
	            "Edad:", edadField,
	            "Género:", generoBox
	        };

	        int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Formulario", JOptionPane.OK_CANCEL_OPTION);

	        if (opcion == JOptionPane.OK_OPTION) {
	            String nombre = nombreField.getText();
	            String edad = edadField.getText();
	            String genero = (String) generoBox.getSelectedItem();

	            JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad + "\nGénero: " + genero);
	        } else {
	            JOptionPane.showMessageDialog(null, "Formulario cancelado");
	        }
	    }
	}


