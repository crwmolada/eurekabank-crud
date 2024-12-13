package com.pe.certus.service;

import javax.ws.rs.core.Response;

import com.pe.certus.dao.MovimientosDAO;
import com.pe.certus.model.APIResponse;
import com.pe.certus.model.MovimientoRequest;
import com.pe.certus.util.ResponseUtil;

public class MovimientoServiceIMPL implements MovimientoService{

    private MovimientosDAO movimientosDAO = new MovimientosDAO();
    @Override
    public Response listarMovimientos() {
        return ResponseUtil.reponseAPIMovimientos("0", "Consulta exitosa", movimientosDAO.listarMovimientos());
    }

    //no es apireponse
    @Override
    public Response crearMovimiento(MovimientoRequest movimientoRequest) {

        APIResponse response = movimientosDAO.insertarMovimiento(movimientoRequest);

        return ResponseUtil.reponseAPIMovimientos(response.getCodeResponse(), response.getMessageResponse(), null);
    }
    
}
