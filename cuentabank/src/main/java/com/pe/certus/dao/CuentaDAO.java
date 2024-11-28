package com.pe.certus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.CuentaResponse;

// cosulta a query sql
public class CuentaDAO {

    public List<CuentaResponse> listarCuentas() {
        List<CuentaResponse> listaCuentas = new ArrayList<CuentaResponse>();

        try {
            String sql = "SELECT c.chr_cuencodigo, m.vch_monedescripcion, CONCAT(s.vch_sucunombre, ',', s.vch_sucuciudad) as sucursal, "
                    + "e.vch_emplnombre, cl.vch_clienombre, c.dec_cuensaldo, c.dtt_cuenfechacreacion, t.vch_tipodescripcion, c.vch_cuenestado "
                    + "FROM cuenta c "
                    + "INNER JOIN moneda m ON c.chr_monecodigo = m.chr_monecodigo "
                    + "INNER JOIN sucursal s ON c.chr_sucucodigo = s.chr_sucucodigo "
                    + "INNER JOIN empleado e ON c.chr_emplcreacuenta = e.chr_emplcodigo "
                    + "INNER JOIN cliente cl ON c.chr_cliecodigo = cl.chr_cliecodigo "
                    + "INNER JOIN tipomovimiento t ON c.int_cuencontmov = t.chr_tipocodigo;";

            Connection cn = ConexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CuentaResponse cuenta = new CuentaResponse();
                cuenta.setCodigoCuenta(rs.getString("chr_cuencodigo")); // Asigna el código de la cuenta
                cuenta.setMoneda(rs.getString("vch_monedescripcion")); // Asigna la descripción de la moneda
                cuenta.setSucursal(rs.getString("sucursal")); // Asigna la sucursal (concatenada)
                cuenta.setNombreCliente(rs.getString("vch_clienombre")); // Asigna el nombre del cliente
                cuenta.setSaldo(rs.getDouble("dec_cuensaldo")); // Asigna el saldo de la cuenta
                cuenta.setFecha(rs.getString("dtt_cuenfechacreacion")); // Asigna la fecha de creación de la cuenta
                cuenta.setTipoMovimiento(rs.getString("vch_tipodescripcion")); // Asigna la descripción del tipo de
                                                                               // movimiento
                cuenta.setEstado(rs.getString("vch_cuenestado"));
            }

            ConexionDB.closeConexion(cn);
            ConexionDB.closePreparedStatement(ps);
            ConexionDB.closeResultSet(rs);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return listaCuentas;
    }

}
