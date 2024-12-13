package com.pe.certus.model;

public class MovimientoRequest {
    private String codigoMovimiento;
    private Integer movimientoNumero;
    private Integer codigoEmpleado;
    private String fecha;
    private Integer tipoMovimiento;
    private Double porte;

    public MovimientoRequest() {
    }

    public MovimientoRequest(String codigoMovimiento, Integer movimientoNumero, Integer codigoEmpleado, String fecha,
            Integer tipoMovimiento, Double porte) {
        this.codigoMovimiento = codigoMovimiento;
        this.movimientoNumero = movimientoNumero;
        this.codigoEmpleado = codigoEmpleado;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.porte = porte;
    }

    public String getCodigoMovimiento() {
        return codigoMovimiento;
    }

    public void setCodigoMovimiento(String codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }

    public Integer getMovimientoNumero() {
        return movimientoNumero;
    }

    public void setMovimientoNumero(Integer movimientoNumero) {
        this.movimientoNumero = movimientoNumero;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getTipoMovimineto() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Integer tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Double getPorte() {
        return porte;
    }

    public void setPorte(Double porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "MovimientoRequest [codigoMovimiento=" + codigoMovimiento + ", movimientoNumero=" + movimientoNumero
                + ", codigoEmpleado=" + codigoEmpleado + ", fecha=" + fecha + ", tipoMovimiento=" + tipoMovimiento
                + ", porte=" + porte + "]";
    }

}
