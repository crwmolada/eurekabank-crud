package com.pe.certus.service;

import java.util.List;

import com.pe.certus.model.CuentaResponse;

public interface CuentaService {
    
    public List<CuentaResponse> listarCuentas();
    public void crearCuenta();
}
