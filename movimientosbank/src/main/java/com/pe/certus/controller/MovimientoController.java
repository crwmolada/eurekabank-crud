package com.pe.certus.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pe.certus.model.MovimientoRequest;
import com.pe.certus.service.MovimientoService;
import com.pe.certus.service.MovimientoServiceIMPL;

@Path("/v1/movimiento")
public class MovimientoController {
    private MovimientoService movimientoService = new MovimientoServiceIMPL();

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) //Asegura devolver una respuesta JSON
    public Response getAllMovimientos() {
        return movimientoService.listarMovimientos();
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON) //Asegura que recivirá una respuesta JSON
    @Produces(MediaType.APPLICATION_JSON) // response / response en formato json
    public Response createMovimiento(MovimientoRequest request) {
        return movimientoService.crearMovimiento(request);
    }
}
