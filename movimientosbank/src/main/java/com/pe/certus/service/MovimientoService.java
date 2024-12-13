package com.pe.certus.service;

import javax.ws.rs.core.Response;
import com.pe.certus.model.MovimientoRequest;

public interface MovimientoService {

    public Response listarMovimientos();
    public Response crearMovimiento(MovimientoRequest movimientoRequestt);
    
}
