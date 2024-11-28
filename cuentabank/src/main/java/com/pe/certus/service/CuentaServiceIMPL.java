package com.pe.certus.service;

import java.util.List;

import com.pe.certus.dao.CuentaDAO;
import com.pe.certus.model.CuentaResponse;

public class CuentaServiceIMPL implements CuentaService {

    private CuentaDAO cuentaDao = new CuentaDAO();

    @Override
    public List<CuentaResponse> listarCuentas() {
        return cuentaDao.listarCuentas();
    }

    @Override
    public void crearCuenta() {
    }

}
