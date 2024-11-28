package com.pe.certus.model;

public class CuentaResponse {
    
    private String codigoCuenta;
    private String moneda;
    private String sucursal;
    private String empleado;
    private String nombreCliente;
    private Double saldo;
    private String fecha;
    private String tipoMovimiento;
    private String estado; // La query lo envía como String y no como bit
    public CuentaResponse() {
        super();
    }
    public CuentaResponse(String codigoCuenta, String moneda, String sucursal, String empleado, String nombreCliente,
            Double saldo, String fecha, String tipoMovimiento, String estado) {
        this.codigoCuenta = codigoCuenta;
        this.moneda = moneda;
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.estado = estado;
    }
    public String getCodigoCuenta() {
        return codigoCuenta;
    }
    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }
    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public String getSucursal() {
        return sucursal;
    }
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public String getEmpleado() {
        return empleado;
    }
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(String tipoMovimiento) {
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
        return "CuentaResponse [codigoCuenta=" + codigoCuenta + ", moneda=" + moneda + ", sucursal=" + sucursal
                + ", empleado=" + empleado + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + ", fecha="
                + fecha + ", tipoMovimiento=" + tipoMovimiento + ", estado=" + estado + "]";
    }
    
    

    
}
