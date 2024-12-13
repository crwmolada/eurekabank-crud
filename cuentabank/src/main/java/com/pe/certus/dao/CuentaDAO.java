package com.pe.certus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.APIResponse;
import com.pe.certus.model.CuentaRequest;
import com.pe.certus.model.CuentaResponse;

public class CuentaDAO {

    public List<CuentaResponse> listarCuentas() {

        List<CuentaResponse> listaCuentas = new ArrayList<CuentaResponse>();

        try {

            String sql = "SELECT c.chr_cuencodigo,m.vch_monedescripcion,CONCAT(s.vch_sucunombre,'-' ,s.vch_sucuciudad) as sucursal,"
                    + "e.vch_emplnombre,cl.vch_clienombre,c.dec_cuensaldo,c.dtt_cuenfechacreacion,t.vch_tipodescripcion,c.vch_cuenestado "
                    + "FROM cuenta c "
                    + "INNER JOIN moneda m ON c.chr_monecodigo = m.chr_monecodigo "
                    + "INNER JOIN sucursal s ON c.chr_sucucodigo = s.chr_sucucodigo "
                    + "INNER JOIN empleado e ON c.chr_emplcreacuenta = e.chr_emplcodigo "
                    + "INNER JOIN cliente cl ON c.chr_cliecodigo = cl.chr_cliecodigo "
                    + "INNER JOIN tipomovimiento t ON c.int_cuencontmov = t.chr_tipocodigo";

            Connection cn = ConexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                CuentaResponse cuenta = new CuentaResponse();
                cuenta.setCodigoCuenta(rs.getString("chr_cuencodigo"));
                cuenta.setMoneda(rs.getString("vch_monedescripcion"));
                cuenta.setSucursal(rs.getString("sucursal"));
                cuenta.setEmpleado(rs.getString("vch_emplnombre"));
                cuenta.setNombreCliente(rs.getString("vch_clienombre"));
                cuenta.setSaldo(rs.getDouble("dec_cuensaldo"));
                cuenta.setFecha(rs.getString("dtt_cuenfechacreacion"));
                cuenta.setTipoMovimiento(rs.getString("vch_tipodescripcion"));
                cuenta.setEstado(rs.getString("vch_cuenestado"));
                listaCuentas.add(cuenta);
            }

            ConexionDB.closeConexion(cn);
            ConexionDB.closeResultSet(rs);
            ConexionDB.closePreparedStatement(ps);
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCuentas;
    }

    public APIResponse insertarCuenta(CuentaRequest cuentaRequest){

        APIResponse apiResponse = new APIResponse();

        try {

            //Como es un procedure usamos el CallAbleStatement y no el resultset
            
            String sql = "CALL sp_insertar_cuenta(?,?,?,?,?,?,?,?,?,?,?);";
            Connection cn = ConexionDB.getConexion();
            CallableStatement cs = cn.prepareCall(sql);

            cs.setString(1, cuentaRequest.getCodigoCuenta());
            cs.setInt(2, cuentaRequest.getCodigoMoneda());
            cs.setInt(3, cuentaRequest.getCodigoSucursal());
            cs.setInt(4, cuentaRequest.getCodigoEmpleado());
            cs.setInt(5, cuentaRequest.getCodigoCliente());
            cs.setDouble(6, cuentaRequest.getSaldo());
            cs.setString(7, cuentaRequest.getFechaCreacion());
            cs.setInt(8, cuentaRequest.getTipoMovimiento());
            cs.setString(9, cuentaRequest.getEstado());

            // Parámetros de salida

            cs.registerOutParameter(10, java.sql.Types.INTEGER);
            cs.registerOutParameter(11, java.sql.Types.VARCHAR);
            cs.execute();
            apiResponse.setCodeResponse(String.valueOf(cs.getInt(10)));
            apiResponse.setMessageResponse(cs.getString(11));

            ConexionDB.closeConexion(cn);
            ConexionDB.closeCallableStatement(cs);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return apiResponse;
    }

}
