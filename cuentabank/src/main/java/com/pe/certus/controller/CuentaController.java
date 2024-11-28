package com.pe.certus.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pe.certus.service.CuentaService;
import com.pe.certus.service.CuentaServiceIMPL;

@Path("/v1/cuenta")
public class CuentaController {
    
    private CuentaService cuentaService = new CuentaServiceIMPL();

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    public Response getAllCuentas() {
        return Response.ok(cuentaService.listarCuentas()).build();
    }
    
}
