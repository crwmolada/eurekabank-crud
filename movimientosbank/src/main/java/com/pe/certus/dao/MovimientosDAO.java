package com.pe.certus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pe.certus.model.APIResponse;
import com.pe.certus.model.MovimientoRequest;
import com.pe.certus.model.MovimientoResponse;

public class MovimientosDAO {

    public List<MovimientoResponse> listarMovimientos() {

        List<MovimientoResponse> listarMovimientos = new ArrayList<MovimientoResponse>();

        try {

            String sql = "SELECT mv.chr_cuencodigo, mv.int_movinumero, e.vch_emplnombre, mv.dtt_movifecha, tp.vch_tipodescripcion, "
                    + "mv.dec_moviimporte "
                    + "FROM movimiento mv "
                    + "INNER JOIN empleado e ON mv.chr_emplcodigo = e.chr_emplcodigo "
                    + "INNER JOIN tipomovimiento tp ON mv.chr_tipocodigo = tp.chr_tipocodigo;";

            Connection cn = ConexionDB.getConexion();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                MovimientoResponse movimiento = new MovimientoResponse();
                movimiento.setCodigoMovimineto(rs.getString("chr_cuencodigo"));
                movimiento.setMovimientoNumero(rs.getString("int_movinumero"));
                movimiento.setEmpleado(rs.getString("vch_emplnombre"));
                movimiento.setFecha(rs.getString("dtt_movifecha"));
                movimiento.setTipoMovimiento(rs.getString("vch_tipodescripcion"));
                movimiento.setPorte(rs.getDouble("dec_moviimporte"));

                listarMovimientos.add(movimiento);
            }

            ConexionDB.closeConexion(cn);
            ConexionDB.closePreparedStatement(ps);
            ConexionDB.closeResultSet(rs);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listarMovimientos;
    }

    public APIResponse insertarMovimiento(MovimientoRequest movimientoRequest) {

        APIResponse apiResponse = new APIResponse();

        try {

            String sql = "CALL sp_insertar_movimiento(?,?,?,?,?,?,?,?);";
            Connection cn = ConexionDB.getConexion();
            CallableStatement cs = cn.prepareCall(sql);

            cs.setString(1, movimientoRequest.getCodigoMovimiento());
            cs.setInt(2, movimientoRequest.getMovimientoNumero());
            cs.setInt(3, movimientoRequest.getCodigoEmpleado());
            cs.setString(4, movimientoRequest.getFecha());
            cs.setInt(5, movimientoRequest.getMovimientoNumero());
            cs.setDouble(6, movimientoRequest.getPorte());

            // Parámetros de salida
            cs.registerOutParameter(7, java.sql.Types.INTEGER);
            cs.registerOutParameter(8, java.sql.Types.VARCHAR);
            cs.execute();
            apiResponse.setCodeResponse(String.valueOf(cs.getInt(7)));
            apiResponse.setMessageResponse(cs.getString(8));

            // No en la parte de data porque no lo construye
            ConexionDB.closeConexion(cn);
            ConexionDB.closeCallableStatement(cs);

        } catch (Exception e) {
            e.printStackTrace();

        }

        return apiResponse;
    }

}
