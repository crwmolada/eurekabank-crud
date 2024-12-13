package com.pe.certus.service;

import javax.ws.rs.core.Response;

import com.pe.certus.dao.CuentaDao;
import com.pe.certus.model.APIResponse;
import com.pe.certus.model.CuentaRequest;
import com.pe.certus.util.ResponseUtil;

public class CuentaServiceIMPL implements CuentaService{

    private CuentaDao cuentaDao = new CuentaDao();
    @Override
    public Response listarCuentas() {
        return ResponseUtil.reponseAPICuentas("0", "Consulta exitosa", cuentaDao.listarCuentas());
    }

    //no es apireponse
    @Override
    public Response crearCuenta(CuentaRequest cuentaRequest) {

        APIResponse response = cuentaDao.insertarCuenta(cuentaRequest);

        return ResponseUtil.reponseAPICuentas(response.getCodeResponse(), response.getMessageResponse(), null);
    }
    
}
