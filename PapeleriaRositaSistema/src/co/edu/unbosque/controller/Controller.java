package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Printable;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.unbosque.model.ProveedorDTO;
import co.edu.unbosque.model.persistence.ProveedorDAO;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View gui;
	private ProveedorDTO proveedorDTO;
	private ProveedorDAO proveedorDAO;

	public Controller() {

		gui = new View(this);
		proveedorDTO= new ProveedorDTO();
		proveedorDAO= new ProveedorDAO();
		

	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		// Inicio de ejecucion del programa

		if (evento.getActionCommand().equals(gui.getFrameInicial().getPanelInicial().abrirManualUsuario)) {

			System.out.println("Falta manual usuario");
		}
		if (evento.getActionCommand().equals(gui.getFrameInicial().getPanelInicial().abrirMenuAdmin)) {

			gui.getLoginFrame().setVisible(true);
			gui.getFrameInicial().setVisible(false);
		}
		if (evento.getActionCommand().equals(gui.getFrameInicial().getPanelInicial().abrirMenuVendedor)) {

			gui.getLoginFrame().setVisible(true);
			gui.getFrameInicial().setVisible(false);
		}

		// Verificar que rol tiene para mostrar los menus

		if (evento.getActionCommand().equals(gui.getLoginFrame().getLoginPanel().iniciarSesion)) {

			// Vendedor

			if (gui.getLoginFrame().getLoginPanel().getUsuario().getText().equals("v")) {

				gui.getMenuVendedorFrame().setVisible(true);
				gui.getLoginFrame().setVisible(false);
			}

			// admin

			if (gui.getLoginFrame().getLoginPanel().getUsuario().getText().equals("a")) {

				gui.getMenuAdministradorFrame().setVisible(true);
				gui.getLoginFrame().setVisible(false);
			}

		}

		// Menu administrador

		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().abrirVendedores)) {

			gui.getVendedorAdmonFrame().setVisible(true);
			gui.getMenuAdministradorFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().abrirRecordatorios)) {

			gui.getMenuAdministradorFrame().setVisible(false);
			gui.getRecordatoriosMenuFrame().setVisible(true);
		}

		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().abrirProveedores)) {

			gui.getMenuAdministradorFrame().setVisible(false);
			gui.getProveedorMenuFrame().setVisible(true);

		}
		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().abrirGenReportes)) {

			gui.getMenuAdministradorFrame().setVisible(false);
			gui.getReportesAdminFrame().setVisible(true);
		}
		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().abrirDescuentos)) {

			gui.getMenuAdministradorFrame().setVisible(false);
			gui.getDescuentosMenuFrame().setVisible(true);
		}

		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().abrirCompraProveedores)) {

			gui.getMenuAdministradorFrame().setVisible(false);
			gui.getOrdenCompraProveedorFrame().setVisible(true);
		}
		if (evento.getActionCommand()
				.equals(gui.getMenuAdministradorFrame().getMenuAdministradorPanel().CerrarSesion)) {

			gui.getFrameInicial().setVisible(true);
			gui.getMenuAdministradorFrame().setVisible(false);

		}

		// VENTANAS DE LAS OPCIONES DE MENU ADMINISTRADOR

		// 1. VENDEDORES

		if (evento.getActionCommand().equals(gui.getVendedorAdmonFrame().getVendedorPanel().AgregarVendedor)) {

			gui.getvendedorAdmonAgregarFrame().setVisible(true);
			gui.getVendedorAdmonFrame().setVisible(false);

		}
		if (evento.getActionCommand().equals(gui.getVendedorAdmonFrame().getVendedorPanel().VerListaVendedor)) {

			gui.getvendedorAdmonListaFrame().setVisible(true);
			gui.getVendedorAdmonFrame().setVisible(false);

		}
		if (evento.getActionCommand().equals(gui.getVendedorAdmonFrame().getVendedorPanel().ModificarVendedor)) {

			gui.getvendedorAdmonListaFrame().setVisible(true);
			gui.getVendedorAdmonFrame().setVisible(false);

		}

		if (evento.getActionCommand().equals(gui.getVendedorAdmonFrame().getVendedorPanel().volverVendedor)) {

			gui.getVendedorAdmonFrame().setVisible(false);
			gui.getMenuAdministradorFrame().setVisible(true);
		}

		// 1.1 AGREGAR VENDEDOR

		if (evento.getActionCommand()
				.equals(gui.getvendedorAdmonAgregarFrame().getVendedorAgregarPanel().agregarVendedor)) {

			System.out.println("La logica de agregar");
		}
		if (evento.getActionCommand()
				.equals(gui.getvendedorAdmonAgregarFrame().getVendedorAgregarPanel().volverVendedorAgregar)) {

			gui.getvendedorAdmonAgregarFrame().setVisible(false);
			gui.getVendedorAdmonFrame().setVisible(true);

		}

		// 1.2 VER LISTA DE VENDEDORES y MODIFICAR VENDEDOR

		if (evento.getActionCommand().equals(gui.getvendedorAdmonListaFrame().getVendedorListaPanel().buscarVendedor)) {

		}

		if (evento.getActionCommand()
				.equals(gui.getvendedorAdmonListaFrame().getVendedorListaPanel().ModificarVendedor)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getvendedorAdmonListaFrame().getVendedorListaPanel().eliminarVendedor)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getvendedorAdmonListaFrame().getVendedorListaPanel().volverListaVendedor)) {

			gui.getvendedorAdmonListaFrame().setVisible(false);
			gui.getVendedorAdmonFrame().setVisible(true);

		}

		// 2. PROVEEDORES MENU PRINCIPAL

		if (evento.getActionCommand().equals(gui.getProveedorMenuFrame().getProveedorMenuPanel().AgregarProveedor)) {

			gui.getProveedorAgregarFrame().setVisible(true);
			gui.getProveedorMenuFrame().setVisible(false);

		}

		if (evento.getActionCommand().equals(gui.getProveedorMenuFrame().getProveedorMenuPanel().VerListaProveedor)) {

			gui.getProveedorListaFrame().setVisible(true);
			gui.getProveedorListaFrame().getProveedorListaPanel().actualizarTabla();
			gui.getProveedorMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand().equals(gui.getProveedorMenuFrame().getProveedorMenuPanel().ModificarProveedor)) {

			gui.getProveedorListaFrame().setVisible(true);
			gui.getProveedorMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand().equals(gui.getProveedorMenuFrame().getProveedorMenuPanel().volverProveedorMenu)) {

			gui.getMenuAdministradorFrame().setVisible(true);
			gui.getProveedorMenuFrame().setVisible(false);

		}

		// 1.1 AGREGAR PROVEEDOR

		if (evento.getActionCommand()
				.equals(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().agregarProveedor)) {
			
			
			try {
				proveedorDTO.setNombre(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().getTxtNombre().getText());
				proveedorDTO.setApellido(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().getTxtApellido().getText());
				proveedorDTO.setCelular(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().getTxtCelular().getText());
				proveedorDTO.setDireccion(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().getTxtDireccion().getText());
				proveedorDTO.setDescripcion(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().getTxtDescripcion().getText());
				if(proveedorDAO.insertarProveedor(proveedorDTO)) {
					gui.getProveedorAgregarFrame().getProveedorAgregarPanel().limpiar();
					JOptionPane.showMessageDialog(null, "SE AGREGO EL PROVEEDOR CORRECTAMENTE");
				}else {
					JOptionPane.showMessageDialog(null, "ERRROR");

					
				}
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERRROR");
			}

		}
		if (evento.getActionCommand()
				.equals(gui.getProveedorAgregarFrame().getProveedorAgregarPanel().volverProveedorAgregar)) {

			gui.getProveedorAgregarFrame().setVisible(false);
			gui.getProveedorMenuFrame().setVisible(true);

		}

		// 1.2 VER LISTA DE VENDEDORES y MODIFICAR PROVEEDOR

		if (evento.getActionCommand().equals(gui.getProveedorListaFrame().getProveedorListaPanel().buscarProveedor)) {

		}

		if (evento.getActionCommand()
				.equals(gui.getProveedorListaFrame().getProveedorListaPanel().ModificarProveedor)) {
			
			 ProveedorDTO seleccionado = gui.getProveedorListaFrame().getProveedorListaPanel().getProveedorSeleccionado();
			    
			    if (seleccionado == null) {
			        JOptionPane.showMessageDialog(null, "Selecciona un proveedor para modificar");
			        return;
			    }

			    // Crear campos de entrada prellenados
			    JTextField nombreField = new JTextField(seleccionado.getNombre());
			    JTextField apellidoField = new JTextField(seleccionado.getApellido());
			    JTextField celularField = new JTextField(seleccionado.getCelular());
			    JTextField direccionField = new JTextField(seleccionado.getDireccion());
			    JTextField descripcionField = new JTextField(seleccionado.getDescripcion());

			    Object[] mensaje = {
			        "Nombre:", nombreField,
			        "Apellido:", apellidoField,
			        "Celular:", celularField,
			        "Dirección:", direccionField,
			        "Descripción:", descripcionField
			    };

			    int opcion = JOptionPane.showConfirmDialog(null, mensaje, "Modificar Proveedor", JOptionPane.OK_CANCEL_OPTION);

			    if (opcion == JOptionPane.OK_OPTION) {
			        seleccionado.setNombre(nombreField.getText());
			        seleccionado.setApellido(apellidoField.getText());
			        seleccionado.setCelular(celularField.getText());
			        seleccionado.setDireccion(direccionField.getText());
			        seleccionado.setDescripcion(descripcionField.getText());

			        if (proveedorDAO.actualizarProveedor(seleccionado)) {
			            gui.getProveedorListaFrame().getProveedorListaPanel().actualizarTabla();
			            JOptionPane.showMessageDialog(null, "Proveedor modificado con éxito");
			        } else {
			            JOptionPane.showMessageDialog(null, "Error al modificar el proveedor");
			        }
			    }

		}
		if (evento.getActionCommand().equals(gui.getProveedorListaFrame().getProveedorListaPanel().eliminarProveedor)) {
			
			if (evento.getActionCommand().equals(gui.getProveedorListaFrame().getProveedorListaPanel().eliminarProveedor)) {
			    int id = gui.getProveedorListaFrame().getProveedorListaPanel().getProveedorSeleccionadoId();
			    if (id != -1) {
			        if (proveedorDAO.eliminarProveedor(id)) {
			            gui.getProveedorListaFrame().getProveedorListaPanel().actualizarTabla();
			            JOptionPane.showMessageDialog(null, "Se eliminó correctamente el proveedor");
			        } else {
			            JOptionPane.showMessageDialog(null, "Error al eliminar el proveedor");
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "Por favor, seleccione un proveedor para eliminar");
			    }
			}


		}
		if (evento.getActionCommand()
				.equals(gui.getProveedorListaFrame().getProveedorListaPanel().volverProveedorLista)) {

			gui.getProveedorMenuFrame().setVisible(true);
			gui.getProveedorListaFrame().setVisible(false);

		}

		// GENERACION DE REPORTES

		if (evento.getActionCommand().equals(gui.getReportesAdminFrame().getReportesAdminPanel().abrirReporteCostos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getReportesAdminFrame().getReportesAdminPanel().abrirReporteDirProveedores)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getReportesAdminFrame().getReportesAdminPanel().abrirReporteGanancias)) {

		}
		if (evento.getActionCommand().equals(gui.getReportesAdminFrame().getReportesAdminPanel().abrirReporteGastos)) {

		}
		if (evento.getActionCommand().equals(gui.getReportesAdminFrame().getReportesAdminPanel().abrirReporteIngEg)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getReportesAdminFrame().getReportesAdminPanel().abrirReporteInventario)) {

		}
		if (evento.getActionCommand().equals(gui.getReportesAdminFrame().getReportesAdminPanel().volverReportes)) {

			gui.getReportesAdminFrame().setVisible(false);
			gui.getMenuAdministradorFrame().setVisible(true);
		}

		// ORDEN DE COMPRA A PROVEEDORES

		if (evento.getActionCommand()
				.equals(gui.getOrdenCompraProveedorFrame().getOrdenCompraProveedorPanel().AgregarOrdenProveedor)) {

			gui.getOrdenCompraProveedorAgregarFrame().setVisible(true);
			gui.getOrdenCompraProveedorFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getOrdenCompraProveedorFrame().getOrdenCompraProveedorPanel().ModificarOrdenProveedor)) {

			gui.getOrdenCompraProveedorFrame().setVisible(false);
			gui.getOrdenCompraProveedorListaFrame().setVisible(true);

		}
		if (evento.getActionCommand()
				.equals(gui.getOrdenCompraProveedorFrame().getOrdenCompraProveedorPanel().verListaOrdenProveedor)) {

			gui.getOrdenCompraProveedorFrame().setVisible(false);
			gui.getOrdenCompraProveedorListaFrame().setVisible(true);

		}
		if (evento.getActionCommand().equals(
				gui.getOrdenCompraProveedorFrame().getOrdenCompraProveedorPanel().volverOrdenCompraProveedorMenu)) {

			gui.getMenuAdministradorFrame().setVisible(true);
			gui.getOrdenCompraProveedorFrame().setVisible(false);

		}

		// 1.1 Agregar ORDEN DE COMPRA A PROVEEDORES

		if (evento.getActionCommand().equals(
				gui.getOrdenCompraProveedorAgregarFrame().getOrdenAgregarCompraProveedorPanel().agregarOrdenCompra)) {

		}

		if (evento.getActionCommand().equals(gui.getOrdenCompraProveedorAgregarFrame()
				.getOrdenAgregarCompraProveedorPanel().volverOrdenCompraProveedorAgregar)) {

			gui.getOrdenCompraProveedorAgregarFrame().setVisible(false);
			gui.getOrdenCompraProveedorFrame().setVisible(true);

		}

		// 1.2 VER LISTA DE ORDENES DE COMPRA y ORDENES DE COMPRA

		if (evento.getActionCommand().equals(
				gui.getOrdenCompraProveedorListaFrame().getOrdenCompraProveedorListaPanel().buscarOrdenCompra)) {

		}
		if (evento.getActionCommand().equals(
				gui.getOrdenCompraProveedorListaFrame().getOrdenCompraProveedorListaPanel().ModificarOrdenCompra)) {

		}
		if (evento.getActionCommand().equals(
				gui.getOrdenCompraProveedorListaFrame().getOrdenCompraProveedorListaPanel().eliminarOrdenCompra)) {

		}
		if (evento.getActionCommand().equals(gui.getOrdenCompraProveedorListaFrame()
				.getOrdenCompraProveedorListaPanel().volverOrdenCompraProveedorLista)) {

			gui.getOrdenCompraProveedorFrame().setVisible(true);
			gui.getOrdenCompraProveedorListaFrame().setVisible(false);

		}

		// DESCUENTOS

		if (evento.getActionCommand().equals(gui.getDescuentosMenuFrame().getDescuentosMenuPanel().AgregarDescuentos)) {

			gui.getDescuentosAgregarFrame().setVisible(true);
			gui.getDescuentosMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getDescuentosMenuFrame().getDescuentosMenuPanel().ModificarDescuentos)) {

			gui.getDescuentosMenuFrame().setVisible(false);
			gui.getDescuentosListaFrame().setVisible(true);

		}
		if (evento.getActionCommand()
				.equals(gui.getDescuentosMenuFrame().getDescuentosMenuPanel().VerListaDescuentos)) {

			gui.getDescuentosMenuFrame().setVisible(false);
			gui.getDescuentosListaFrame().setVisible(true);

		}
		if (evento.getActionCommand()
				.equals(gui.getDescuentosMenuFrame().getDescuentosMenuPanel().volverDescuentosMenu)) {

			gui.getMenuAdministradorFrame().setVisible(true);
			gui.getDescuentosMenuFrame().setVisible(false);

		}

		// 1.1 AGREGAR Descuentos

		if (evento.getActionCommand()
				.equals(gui.getDescuentosAgregarFrame().getDescuentosAgregarPanel().agregarDescuento)) {

		}

		if (evento.getActionCommand()
				.equals(gui.getDescuentosAgregarFrame().getDescuentosAgregarPanel().volverDescuentosAgregar)) {

			gui.getDescuentosAgregarFrame().setVisible(false);
			gui.getDescuentosMenuFrame().setVisible(true);

		}

		// 1.2 VER LISTA DE DESCUENTOS y MODIFICAR VENDEDOR

		if (evento.getActionCommand()
				.equals(gui.getDescuentosListaFrame().getDescuentosListaPanel().buscarDescuentos)) {

		}

		if (evento.getActionCommand()
				.equals(gui.getDescuentosListaFrame().getDescuentosListaPanel().ModificarDescuentos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getDescuentosListaFrame().getDescuentosListaPanel().eliminarDescuentos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getDescuentosListaFrame().getDescuentosListaPanel().volverDescuentosListaDescuentosLista)) {

			gui.getDescuentosMenuFrame().setVisible(true);
			gui.getDescuentosListaFrame().setVisible(false);

		}

		// RECORDATORIOS

		if (evento.getActionCommand()
				.equals(gui.getRecordatoriosMenuFrame().getRecordatoriosMenuPanel().abrirbtnRecordatorioPagos)) {

			gui.getRecordatoriosPagosMenuFrame().setVisible(true);
			gui.getRecordatoriosMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getRecordatoriosMenuFrame().getRecordatoriosMenuPanel().abrirbtnRecordatorioStock)) {

			gui.getRecordatoriosMenuFrame().setVisible(false);
			gui.getRecordatoriosStockMenuFrame().setVisible(true);

		}
		if (evento.getActionCommand()
				.equals(gui.getRecordatoriosMenuFrame().getRecordatoriosMenuPanel().volverRecordatoriosMenu)) {

			gui.getRecordatoriosMenuFrame().setVisible(false);
			gui.getMenuAdministradorFrame().setVisible(true);

		}

		// Recordatorios STOCK

		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockMenuFrame().getRecordatoriosStockMenuPanel().AgregarRecordatoriosStock)) {

			gui.getRecordatoriosStockAgregarFrame().setVisible(true);
			gui.getRecordatoriosStockMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockMenuFrame().getRecordatoriosStockMenuPanel().ModificarRecordatoriosStock)) {

			gui.getRecordatoriosStockMenuFrame().setVisible(false);
			gui.getRecordatoriosStockListaFrame().setVisible(true);

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockMenuFrame().getRecordatoriosStockMenuPanel().VerListaRecordatoriosStock)) {

			gui.getRecordatoriosStockMenuFrame().setVisible(false);
			gui.getRecordatoriosStockListaFrame().setVisible(true);

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockMenuFrame().getRecordatoriosStockMenuPanel().volverRecordatorioStockMenu)) {

			gui.getRecordatoriosMenuFrame().setVisible(true);
			gui.getRecordatoriosStockMenuFrame().setVisible(false);

		}

		// 1. Agregar recordatorio stock

		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockAgregarFrame().getRecordatoriosStockAgregarPanel().agregarRecordatorioStock)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getRecordatoriosStockAgregarFrame().getRecordatoriosStockAgregarPanel().BuscarIdProducto)) {

		}
		if (evento.getActionCommand().equals(gui.getRecordatoriosStockAgregarFrame()
				.getRecordatoriosStockAgregarPanel().volverRecordatoriosStockAgregar)) {

			gui.getRecordatoriosStockAgregarFrame().setVisible(false);
			gui.getRecordatoriosStockMenuFrame().setVisible(true);

		}

		// 2. Modificar y listar recordatorios stock

		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockListaFrame().getRecordatoriosStockListaPanel().buscarRecordatoriosStock)) {

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockListaFrame().getRecordatoriosStockListaPanel().ModificarRecordatoriosStock)) {

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosStockListaFrame().getRecordatoriosStockListaPanel().eliminarRecordatoriosStock)) {

		}
		if (evento.getActionCommand().equals(gui.getRecordatoriosStockListaFrame()
				.getRecordatoriosStockListaPanel().volverRecordatoriosStockLista)) {

			gui.getRecordatoriosStockMenuFrame().setVisible(true);
			gui.getRecordatoriosStockListaFrame().setVisible(false);

		}

		// Recordatorios PAGOS

		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosMenuFrame().getRecordatoriosPagosMenuPanel().AgregarRecordatoriosPagos)) {

			gui.getRecordatoriosPagosAgregarFrame().setVisible(true);
			gui.getRecordatoriosPagosMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosMenuFrame().getRecordatoriosPagosMenuPanel().ModificarRecordatoriosPagos)) {

			gui.getRecordatoriosPagosMenuFrame().setVisible(false);
			gui.getRecordatoriosPagosListaFrame().setVisible(true);

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosMenuFrame().getRecordatoriosPagosMenuPanel().VerListaRecordatoriosPagos)) {

			gui.getRecordatoriosPagosMenuFrame().setVisible(false);
			gui.getRecordatoriosPagosListaFrame().setVisible(true);

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosMenuFrame().getRecordatoriosPagosMenuPanel().volverRecordatoriosPagoMenu)) {

			gui.getMenuAdministradorFrame().setVisible(true);
			gui.getRecordatoriosPagosMenuFrame().setVisible(false);

		}

		// 1. Agregar recordatorio pagos

		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosAgregarFrame().getRecordatoriosPagosAgregarPanel().agregarRecordatorioPagos)) {

		}
		if (evento.getActionCommand().equals(gui.getRecordatoriosPagosAgregarFrame()
				.getRecordatoriosPagosAgregarPanel().volverRecordatoriosPagoAgregar)) {

			gui.getRecordatoriosPagosAgregarFrame().setVisible(false);
			gui.getRecordatoriosPagosMenuFrame().setVisible(true);

		}

		// 2. Modificar y listar recordatorios pagos

		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosListaFrame().getRecordatoriosPagosListaPanel().buscarRecordatoriosPagos)) {

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosListaFrame().getRecordatoriosPagosListaPanel().ModificarRecordatoriosPagos)) {

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosListaFrame().getRecordatoriosPagosListaPanel().eliminarRecordatoriosPagos)) {

		}
		if (evento.getActionCommand().equals(
				gui.getRecordatoriosPagosListaFrame().getRecordatoriosPagosListaPanel().volverRecordatoriosPagoLista)) {

			gui.getRecordatoriosPagosMenuFrame().setVisible(true);
			gui.getRecordatoriosPagosListaFrame().setVisible(false);

		}

		///////// ROL VENDEDOOOOOOOOOOOR/////////////////////////

		// Menu principal del vendedor

		if (evento.getActionCommand()
				.equals(gui.getMenuVendedorFrame().getMenuVendedorPanel().abrirVendedorCierreCaja)) {

		}

		if (evento.getActionCommand()
				.equals(gui.getMenuVendedorFrame().getMenuVendedorPanel().abrirVendedorDirectorioProd)) {

			gui.getDirProductosFrame().setVisible(true);
			gui.getMenuVendedorFrame().setVisible(false);

		}

		if (evento.getActionCommand()
				.equals(gui.getMenuVendedorFrame().getMenuVendedorPanel().abrirVendedorGestionProd)) {

			gui.getGestionProductosFrame().setVisible(true);
			gui.getMenuVendedorFrame().setVisible(false);

		}

		if (evento.getActionCommand()
				.equals(gui.getMenuVendedorFrame().getMenuVendedorPanel().abrirVendedorRegCostosGastos)) {

			gui.getCostosGastosMenuFrame().setVisible(true);
			gui.getMenuVendedorFrame().setVisible(false);

		}

		if (evento.getActionCommand().equals(gui.getMenuVendedorFrame().getMenuVendedorPanel().abrirVendedorVentas)) {

			gui.getVentasFrame().setVisible(true);
			gui.getMenuVendedorFrame().setVisible(false);

		}

/////////// VENTASSSSS////////////////////////

		if (evento.getActionCommand().equals(gui.getVentasFrame().getVentasPanel().agregarArticulo)) {

		}
		if (evento.getActionCommand().equals(gui.getVentasFrame().getVentasPanel().borrarArticulo)) {

		}

		if (evento.getActionCommand().equals(gui.getVentasFrame().getVentasPanel().limpiar)) {

		}
		if (evento.getActionCommand().equals(gui.getVentasFrame().getVentasPanel().registrarDevolucion)) {

		}
		if (evento.getActionCommand().equals(gui.getVentasFrame().getVentasPanel().registrarVenta)) {

		}
		if (evento.getActionCommand().equals(gui.getVentasFrame().getVentasPanel().volverVentas)) {

			gui.getMenuVendedorFrame().setVisible(true);
			gui.getVentasFrame().setVisible(false);

		}

///////////////////// directorio productos

		if (evento.getActionCommand().equals(gui.getDirProductosFrame().getDirProductosPanel().buscarProductos)) {

		}
		if (evento.getActionCommand().equals(gui.getDirProductosFrame().getDirProductosPanel().volverDirProductos)) {

			gui.getDirProductosFrame().setVisible(false);
			gui.getMenuVendedorFrame().setVisible(true);
		}

///////////////// gestion de productos/////////////////////

		if (evento.getActionCommand().equals(gui.getGestionProductosFrame().getGestionProductosPanel().AgregarProducto))

		{

			gui.getAgregarProductosFrame().setVisible(true);
			gui.getGestionProductosFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getGestionProductosFrame().getGestionProductosPanel().ModificarProducto)) {

			gui.getProductosListaFrame().setVisible(true);
			gui.getGestionProductosFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getGestionProductosFrame().getGestionProductosPanel().VerListaProductos)) {

			gui.getProductosListaFrame().setVisible(true);
			gui.getGestionProductosFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getGestionProductosFrame().getGestionProductosPanel().volverGestionProductos)) {

			gui.getGestionProductosFrame().setVisible(false);
			gui.getMenuVendedorFrame().setVisible(true);

		}

		//////////////// gestion de productos menu////////

		// 1. agregar

		if (evento.getActionCommand()
				.equals(gui.getAgregarProductosFrame().getAgregarProductosPanel().agregarProductos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getAgregarProductosFrame().getAgregarProductosPanel().volverAgregarProductos)) {

			gui.getAgregarProductosFrame().setVisible(false);
			gui.getGestionProductosFrame().setVisible(true);

		}

		// 2.Modificar y Listar

		if (evento.getActionCommand().equals(gui.getProductosListaFrame().getProductosListaPanel().eliminarProductos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getProductosListaFrame().getProductosListaPanel().AgregarNuevoProducto)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getProductosListaFrame().getProductosListaPanel().modificarProductos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getProductosListaFrame().getProductosListaPanel().volverProductosLista)) {

			gui.getProductosListaFrame().setVisible(false);
			gui.getGestionProductosFrame().setVisible(true);
		}

/////////////////////////// COSTOS Y GASTOS/////////////////////

		if (evento.getActionCommand()
				.equals(gui.getCostosGastosMenuFrame().getCostosGastosMenuPanel().AgregarCostoGasto)) {

			gui.getRegistrarCostosGastosFrame().setVisible(true);
			gui.getCostosGastosMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getCostosGastosMenuFrame().getCostosGastosMenuPanel().ModificarCostoGasto)) {

			gui.getCostosGastosListaFrame().setVisible(true);
			gui.getCostosGastosMenuFrame().setVisible(false);
			

		}
		if (evento.getActionCommand()
				.equals(gui.getCostosGastosMenuFrame().getCostosGastosMenuPanel().VerListaCostoGasto)) {
			
			gui.getCostosGastosListaFrame().setVisible(true);
			gui.getCostosGastosMenuFrame().setVisible(false);

		}
		if (evento.getActionCommand()
				.equals(gui.getCostosGastosMenuFrame().getCostosGastosMenuPanel().volverCostosGastosMenu)) {
			
			gui.getCostosGastosMenuFrame().setVisible(false);
			gui.getMenuVendedorFrame().setVisible(true);

		}

		// Agregar

		if (evento.getActionCommand()
				.equals(gui.getRegistrarCostosGastosFrame().getRegistrarCostosGastosPanel().agregarCostosGastos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getRegistrarCostosGastosFrame().getRegistrarCostosGastosPanel().volverRegCostoGasto)) {

			gui.getCostosGastosMenuFrame().setVisible(true);
			gui.getRegistrarCostosGastosFrame().setVisible(false);
		}

		// Modificar y listar

		if (evento.getActionCommand()
				.equals(gui.getCostosGastosListaFrame().getCostosGastosListaPanel().ModificarCostosGastos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getCostosGastosListaFrame().getCostosGastosListaPanel().eliminarCostosGastos)) {

		}
		if (evento.getActionCommand()
				.equals(gui.getCostosGastosListaFrame().getCostosGastosListaPanel().volverCostosGastos)) {
			
			
			gui.getCostosGastosListaFrame().setVisible(false);
			gui.getCostosGastosMenuFrame().setVisible(true);
		}

	}
}
