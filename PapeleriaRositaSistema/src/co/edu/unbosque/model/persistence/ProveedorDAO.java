package co.edu.unbosque.model.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.conexion.Conexion;
import co.edu.unbosque.model.ProveedorDTO;

public class ProveedorDAO {
	
	private Conexion cx;
	private ProveedorDTO proveedorDTO;
	
	public ProveedorDAO() {
		
		cx= new Conexion();
		proveedorDTO= new ProveedorDTO();
	}
	
	public boolean insertarProveedor(ProveedorDTO proveedorDTO) {
		PreparedStatement ps= null;
		try {
			ps= cx.conectar().prepareStatement("INSERT INTO Proveedores VALUES(null,?,?,?,?,?)");
			ps.setString(1, proveedorDTO.getNombre());
			ps.setString(2, proveedorDTO.getApellido());
			ps.setString(3, proveedorDTO.getCelular());
			ps.setString(4, proveedorDTO.getDireccion());
			ps.setString(5, proveedorDTO.getDescripcion());
			ps.executeUpdate();
			cx.desconectar();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
		
	}
	
	
	public boolean eliminarProveedor(int id) {
		PreparedStatement ps= null;
		try {
			ps= cx.conectar().prepareStatement("DELETE FROM Proveedores WHERE id_proveedor=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			cx.desconectar();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	
		
	}
	
	public ArrayList<ProveedorDTO> consultaProveedores(){
		ArrayList<ProveedorDTO> listaProv= new ArrayList<ProveedorDTO>();
		
		PreparedStatement ps = null;
		ResultSet rs= null;
		try {
			ps= cx.conectar().prepareStatement("SELECT * FROM Proveedores");
			rs= ps.executeQuery();
			while(rs.next()) {
				ProveedorDTO proveedorDTO= new ProveedorDTO();

				proveedorDTO.setId_proveedor(rs.getInt("id_proveedor"));
				proveedorDTO.setNombre(rs.getString("nombre"));
				proveedorDTO.setApellido(rs.getString("apellido"));
				proveedorDTO.setCelular(rs.getString("celular"));
				proveedorDTO.setDireccion(rs.getString("direccion"));
				proveedorDTO.setDescripcion(rs.getString("descripcion"));
				listaProv.add(proveedorDTO);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaProv;
	}
	
	public boolean modificarProveedor(ProveedorDTO proveedorDTO) {
		PreparedStatement ps= null;
		try {
			ps= cx.conectar().prepareStatement("UPDATE Proveedores SET");
			ps.setString(1, proveedorDTO.getNombre());
			ps.setString(2, proveedorDTO.getApellido());
			ps.setString(3, proveedorDTO.getCelular());
			ps.setString(4, proveedorDTO.getDireccion());
			ps.setString(5, proveedorDTO.getDescripcion());
			ps.executeUpdate();
			cx.desconectar();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	
		
	}
	
	public boolean actualizarProveedor(ProveedorDTO proveedor) {
	    PreparedStatement ps = null;
	    try {
	        ps = cx.conectar().prepareStatement(
	            "UPDATE Proveedores SET nombre=?, apellido=?, celular=?, direccion=?, descripcion=? WHERE id_proveedor=?"
	        );
	        ps.setString(1, proveedor.getNombre());
	        ps.setString(2, proveedor.getApellido());
	        ps.setString(3, proveedor.getCelular());
	        ps.setString(4, proveedor.getDireccion());
	        ps.setString(5, proveedor.getDescripcion());
	        ps.setInt(6, proveedor.getId_proveedor());
	        ps.executeUpdate();
	        cx.desconectar();
	        return true;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	
	

}
