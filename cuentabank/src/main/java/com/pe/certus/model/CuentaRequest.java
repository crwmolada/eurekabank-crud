package com.pe.certus.model;

public class CuentaRequest {
    private String codigoCuenta;
    private Integer codigoMoneda;
    private Integer codigoSucursal;
    private Integer codigoEmpleado;
    private Integer codigoCliente;
    private Double saldo;
    private String fechaCreacion;
    private Integer tipoMovimiento;
    private String estado;

    public CuentaRequest() {
        super();
    }

    public CuentaRequest(String codigoCuenta, Integer codigoMoneda, Integer codigoSucursal, Integer codigoEmpleado,
            Integer codigoCliente, Double saldo, String fechaCreacion, Integer tipoMovimiento, String estado) {
        this.codigoCuenta = codigoCuenta;
        this.codigoMoneda = codigoMoneda;
        this.codigoSucursal = codigoSucursal;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoCliente = codigoCliente;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
        this.tipoMovimiento = tipoMovimiento;
        this.estado = estado;
    }

    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public Integer getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(Integer codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public Integer getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Integer codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Integer tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CuentaRequest [codigoCuenta=" + codigoCuenta + ", codigoMoneda=" + codigoMoneda + ", codigoSucursal="
                + codigoSucursal + ", codigoEmpleado=" + codigoEmpleado + ", codigoCliente=" + codigoCliente
                + ", saldo=" + saldo + ", fechaCreacion=" + fechaCreacion + ", tipoMovimiento=" + tipoMovimiento
                + ", estado=" + estado + "]";
    }

}
