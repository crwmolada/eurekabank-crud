package com.pe.certus.util;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.pe.certus.model.APIResponse;
import com.pe.certus.model.MovimientoResponse;

public class ResponseUtil {

    // para el codeResponse y messageResponse

    public static Response reponseAPIMovimientos(String codigo, String message, List<MovimientoResponse> data) { 
                                                                                                                                                                                                       
        APIResponse response = new APIResponse(codigo, message, data);

        if (data != null) {
            return Response.status(Status.OK).entity(response).build();
        } else {
            return Response.status(Status.CREATED).entity(response).build();
        }
    }
}
