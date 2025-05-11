package co.edu.unbosque.view;

import javax.swing.JFrame;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private InicioFrame frameInicial;
	private LoginFrame loginFrame;
	private MenuVendedorFrame menuVendedorFrame;
	private MenuAdministradorFrame menuAdministradorFrame;
	private VendedorAdmonFrame vendedorAdmonFrame;
	private RecordatoriosFrame recordatoriosMenuFrame;
	private ProveedorMenuFrame proveedorMenuFrame;
	private ReportesAdminFrame reportesAdminFrame;
	private DescuentosMenuFrame descuentosMenuFrame;
	private OrdenCompraProveedorFrame ordenCompraProveedorFrame;
	private VendedorAdmonAgregarFrame vendedorAdmonAgregarFrame;
	private VendedorAdmonListaFrame vendedorAdmonListaFrame;
	private ProveedorAgregarFrame proveedorAgregarFrame;
	private ProveedorListaFrame proveedorListaFrame;
	private OrdenCompraProveedorAgregarFrame ordenCompraProveedorAgregarFrame;
	private OrdenCompraProveedorListaFrame ordenCompraProveedorListaFrame;
	private DescuentosAgregarFrame descuentosAgregarFrame;
	private DescuentosListaFrame descuentosListaFrame;
	private RecordatoriosPagosMenuFrame recordatoriosPagosMenuFrame;
	private RecordatoriosStockMenuFrame recordatoriosStockMenuFrame;
	private RecordatoriosStockAgregarFrame recordatoriosStockAgregarFrame;
	private RecordatoriosStockListaFrame recordatoriosStockListaFrame;
	private RecordatoriosPagosAgregarFrame recordatoriosPagosAgregarFrame;
	private RecordatoriosPagosListaFrame recordatoriosPagosListaFrame;
	private DirProductosFrame dirProductosFrame;
	private GestionProductosFrame gestionProductosFrame;
	private CostosGastosMenuFrame costosGastosMenuFrame;
	private VentasFrame ventasFrame;
	private ProductosListaFrame productosListaFrame;
	private AgregarProductosFrame agregarProductosFrame;
	private RegistrarCostosGastosFrame registrarCostosGastosFrame;
	private CostosGastosListaFrame costosGastosListaFrame;

	public View(Controller control) {

		frameInicial = new InicioFrame(control);
		loginFrame = new LoginFrame(control);
		menuVendedorFrame = new MenuVendedorFrame(control);
		menuAdministradorFrame = new MenuAdministradorFrame(control);
		vendedorAdmonFrame = new VendedorAdmonFrame(control);
		recordatoriosMenuFrame = new RecordatoriosFrame(control);
		proveedorMenuFrame = new ProveedorMenuFrame(control);
		reportesAdminFrame = new ReportesAdminFrame(control);
		descuentosMenuFrame = new DescuentosMenuFrame(control);
		ordenCompraProveedorFrame = new OrdenCompraProveedorFrame(control);
		vendedorAdmonAgregarFrame = new VendedorAdmonAgregarFrame(control);
		vendedorAdmonListaFrame = new VendedorAdmonListaFrame(control);
		proveedorAgregarFrame = new ProveedorAgregarFrame(control);
		proveedorListaFrame = new ProveedorListaFrame(control);
		ordenCompraProveedorAgregarFrame = new OrdenCompraProveedorAgregarFrame(control);
		ordenCompraProveedorListaFrame = new OrdenCompraProveedorListaFrame(control);
		descuentosAgregarFrame = new DescuentosAgregarFrame(control);
		descuentosListaFrame = new DescuentosListaFrame(control);
		recordatoriosPagosMenuFrame = new RecordatoriosPagosMenuFrame(control);
		recordatoriosStockMenuFrame = new RecordatoriosStockMenuFrame(control);
		recordatoriosStockAgregarFrame = new RecordatoriosStockAgregarFrame(control);
		recordatoriosStockListaFrame = new RecordatoriosStockListaFrame(control);
		recordatoriosPagosAgregarFrame = new RecordatoriosPagosAgregarFrame(control);
		recordatoriosPagosListaFrame = new RecordatoriosPagosListaFrame(control);

		dirProductosFrame = new DirProductosFrame(control);
		gestionProductosFrame = new GestionProductosFrame(control);
		costosGastosMenuFrame = new CostosGastosMenuFrame(control);
		ventasFrame = new VentasFrame(control);
		productosListaFrame = new ProductosListaFrame(control);
		agregarProductosFrame = new AgregarProductosFrame(control);
		registrarCostosGastosFrame = new RegistrarCostosGastosFrame(control);
		costosGastosListaFrame = new CostosGastosListaFrame(control);
	}

	public CostosGastosListaFrame getCostosGastosListaFrame() {
		return costosGastosListaFrame;
	}

	public void setCostosGastosListaFrame(CostosGastosListaFrame costosGastosListaFrame) {
		this.costosGastosListaFrame = costosGastosListaFrame;
	}

	public RegistrarCostosGastosFrame getRegistrarCostosGastosFrame() {
		return registrarCostosGastosFrame;
	}

	public void setRegistrarCostosGastosFrame(RegistrarCostosGastosFrame registrarCostosGastosFrame) {
		this.registrarCostosGastosFrame = registrarCostosGastosFrame;
	}

	public ProductosListaFrame getProductosListaFrame() {
		return productosListaFrame;
	}

	public void setProductosListaFrame(ProductosListaFrame productosListaFrame) {
		this.productosListaFrame = productosListaFrame;
	}

	public AgregarProductosFrame getAgregarProductosFrame() {
		return agregarProductosFrame;
	}

	public void setAgregarProductosFrame(AgregarProductosFrame agregarProductosFrame) {
		this.agregarProductosFrame = agregarProductosFrame;
	}

	public VentasFrame getVentasFrame() {
		return ventasFrame;
	}

	public void setVentasFrame(VentasFrame ventasFrame) {
		this.ventasFrame = ventasFrame;
	}

	public CostosGastosMenuFrame getCostosGastosMenuFrame() {
		return costosGastosMenuFrame;
	}

	public void setCostosGastosMenuFrame(CostosGastosMenuFrame costosGastosMenuFrame) {
		this.costosGastosMenuFrame = costosGastosMenuFrame;
	}

	public GestionProductosFrame getGestionProductosFrame() {
		return gestionProductosFrame;
	}

	public void setGestionProductosFrame(GestionProductosFrame gestionProductosFrame) {
		this.gestionProductosFrame = gestionProductosFrame;
	}

	public DirProductosFrame getDirProductosFrame() {
		return dirProductosFrame;
	}

	public void setDirProductosFrame(DirProductosFrame dirProductosFrame) {
		this.dirProductosFrame = dirProductosFrame;
	}

	public RecordatoriosPagosAgregarFrame getRecordatoriosPagosAgregarFrame() {
		return recordatoriosPagosAgregarFrame;
	}

	public void setRecordatoriosPagosAgregarFrame(RecordatoriosPagosAgregarFrame recordatoriosPagosAgregarFrame) {
		this.recordatoriosPagosAgregarFrame = recordatoriosPagosAgregarFrame;
	}

	public RecordatoriosPagosListaFrame getRecordatoriosPagosListaFrame() {
		return recordatoriosPagosListaFrame;
	}

	public void setRecordatoriosPagosListaFrame(RecordatoriosPagosListaFrame recordatoriosPagosListaFrame) {
		this.recordatoriosPagosListaFrame = recordatoriosPagosListaFrame;
	}

	public RecordatoriosStockAgregarFrame getRecordatoriosStockAgregarFrame() {
		return recordatoriosStockAgregarFrame;
	}

	public void setRecordatoriosStockAgregarFrame(RecordatoriosStockAgregarFrame recordatoriosStockAgregarFrame) {
		this.recordatoriosStockAgregarFrame = recordatoriosStockAgregarFrame;
	}

	public RecordatoriosStockListaFrame getRecordatoriosStockListaFrame() {
		return recordatoriosStockListaFrame;
	}

	public void setRecordatoriosStockListaFrame(RecordatoriosStockListaFrame recordatoriosStockListaFrame) {
		this.recordatoriosStockListaFrame = recordatoriosStockListaFrame;
	}

	public RecordatoriosStockMenuFrame getRecordatoriosStockMenuFrame() {
		return recordatoriosStockMenuFrame;
	}

	public void setRecordatoriosStockMenuFrame(RecordatoriosStockMenuFrame recordatoriosStockMenuFrame) {
		this.recordatoriosStockMenuFrame = recordatoriosStockMenuFrame;
	}

	public RecordatoriosPagosMenuFrame getRecordatoriosPagosMenuFrame() {
		return recordatoriosPagosMenuFrame;
	}

	public void setRecordatoriosPagosMenuFrame(RecordatoriosPagosMenuFrame recordatoriosPagosMenuFrame) {
		this.recordatoriosPagosMenuFrame = recordatoriosPagosMenuFrame;
	}

	public DescuentosListaFrame getDescuentosListaFrame() {
		return descuentosListaFrame;
	}

	public void setDescuentosListaFrame(DescuentosListaFrame descuentosListaFrame) {
		this.descuentosListaFrame = descuentosListaFrame;
	}

	public DescuentosAgregarFrame getDescuentosAgregarFrame() {
		return descuentosAgregarFrame;
	}

	public void setDescuentosAgregarFrame(DescuentosAgregarFrame descuentosAgregarFrame) {
		this.descuentosAgregarFrame = descuentosAgregarFrame;
	}

	public OrdenCompraProveedorListaFrame getOrdenCompraProveedorListaFrame() {
		return ordenCompraProveedorListaFrame;
	}

	public void setOrdenCompraProveedorListaFrame(OrdenCompraProveedorListaFrame ordenCompraProveedorListaFrame) {
		this.ordenCompraProveedorListaFrame = ordenCompraProveedorListaFrame;
	}

	public OrdenCompraProveedorAgregarFrame getOrdenCompraProveedorAgregarFrame() {
		return ordenCompraProveedorAgregarFrame;
	}

	public void setOrdenCompraProveedorAgregarFrame(OrdenCompraProveedorAgregarFrame ordenCompraProveedorAgregarFrame) {
		this.ordenCompraProveedorAgregarFrame = ordenCompraProveedorAgregarFrame;
	}

	public ProveedorListaFrame getProveedorListaFrame() {
		return proveedorListaFrame;
	}

	public void setProveedorListaFrame(ProveedorListaFrame proveedorListaFrame) {
		this.proveedorListaFrame = proveedorListaFrame;
	}

	public VendedorAdmonAgregarFrame getVendedorAdmonAgregarFrame() {
		return vendedorAdmonAgregarFrame;
	}

	public void setVendedorAdmonAgregarFrame(VendedorAdmonAgregarFrame vendedorAdmonAgregarFrame) {
		this.vendedorAdmonAgregarFrame = vendedorAdmonAgregarFrame;
	}

	public VendedorAdmonListaFrame getVendedorAdmonListaFrame() {
		return vendedorAdmonListaFrame;
	}

	public void setVendedorAdmonListaFrame(VendedorAdmonListaFrame vendedorAdmonListaFrame) {
		this.vendedorAdmonListaFrame = vendedorAdmonListaFrame;
	}

	public ProveedorAgregarFrame getProveedorAgregarFrame() {
		return proveedorAgregarFrame;
	}

	public void setProveedorAgregarFrame(ProveedorAgregarFrame proveedorAgregarFrame) {
		this.proveedorAgregarFrame = proveedorAgregarFrame;
	}

	public VendedorAdmonListaFrame getvendedorAdmonListaFrame() {
		return vendedorAdmonListaFrame;
	}

	public void setvendedorAdmonListaFrame(VendedorAdmonListaFrame vendedorAdmonListaFrame) {
		this.vendedorAdmonListaFrame = vendedorAdmonListaFrame;
	}

	public VendedorAdmonAgregarFrame getvendedorAdmonAgregarFrame() {
		return vendedorAdmonAgregarFrame;
	}

	public void setvendedorAdmonAgregarFrame(VendedorAdmonAgregarFrame vendedorAdmonAgregarFrame) {
		this.vendedorAdmonAgregarFrame = vendedorAdmonAgregarFrame;
	}

	public OrdenCompraProveedorFrame getOrdenCompraProveedorFrame() {
		return ordenCompraProveedorFrame;
	}

	public void setOrdenCompraProveedorFrame(OrdenCompraProveedorFrame ordenCompraProveedorFrame) {
		this.ordenCompraProveedorFrame = ordenCompraProveedorFrame;
	}

	public DescuentosMenuFrame getDescuentosMenuFrame() {
		return descuentosMenuFrame;
	}

	public void setDescuentosMenuFrame(DescuentosMenuFrame descuentosMenuFrame) {
		this.descuentosMenuFrame = descuentosMenuFrame;
	}

	public ReportesAdminFrame getReportesAdminFrame() {
		return reportesAdminFrame;
	}

	public void setReportesAdminFrame(ReportesAdminFrame reportesAdminFrame) {
		this.reportesAdminFrame = reportesAdminFrame;
	}

	public ProveedorMenuFrame getProveedorMenuFrame() {
		return proveedorMenuFrame;
	}

	public void setProveedorMenuFrame(ProveedorMenuFrame proveedorMenuFrame) {
		this.proveedorMenuFrame = proveedorMenuFrame;
	}

	public RecordatoriosFrame getRecordatoriosMenuFrame() {
		return recordatoriosMenuFrame;
	}

	public void setRecordatoriosMenuFrame(RecordatoriosFrame recordatoriosMenuFrame) {
		this.recordatoriosMenuFrame = recordatoriosMenuFrame;
	}

	public VendedorAdmonFrame getVendedorAdmonFrame() {
		return vendedorAdmonFrame;
	}

	public void setVendedorAdmonFrame(VendedorAdmonFrame vendedorAdmonFrame) {
		this.vendedorAdmonFrame = vendedorAdmonFrame;
	}

	public MenuAdministradorFrame getMenuAdministradorFrame() {
		return menuAdministradorFrame;
	}

	public void setMenuAdministradorFrame(MenuAdministradorFrame menuAdministradorFrame) {
		this.menuAdministradorFrame = menuAdministradorFrame;
	}

	public MenuVendedorFrame getMenuVendedorFrame() {
		return menuVendedorFrame;
	}

	public void setMenuVendedorFrame(MenuVendedorFrame menuVendedorFrame) {
		this.menuVendedorFrame = menuVendedorFrame;
	}

	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	public void setLoginFrame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

	public InicioFrame getFrameInicial() {
		return frameInicial;
	}

	public void setFrameInicial(InicioFrame frameInicial) {
		this.frameInicial = frameInicial;
	}

}
