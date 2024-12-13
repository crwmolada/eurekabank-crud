package com.pe.certus.model;

public class MovimientoResponse {

    private String codigoMovimineto;
    private String movimientoNumero;
    private String empleado;
    private String fecha;
    private String tipoMovimiento;
    private Double porte;

    public MovimientoResponse() {
        super();
    }

    public MovimientoResponse(String codigoMovimineto, String movimientoNumero, String empleado, String fecha,
            String tipoMovimiento, Double porte) {
        this.codigoMovimineto = codigoMovimineto;
        this.movimientoNumero = movimientoNumero;
        this.empleado = empleado;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
        this.porte = porte;
    }

    public String getCodigoMovimineto() {
        return codigoMovimineto;
    }

    public void setCodigoMovimineto(String codigoMovimineto) {
        this.codigoMovimineto = codigoMovimineto;
    }

    public String getMovimientoNumero() {
        return movimientoNumero;
    }

    public void setMovimientoNumero(String movimientoNumero) {
        this.movimientoNumero = movimientoNumero;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
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

    public Double getPorte() {
        return porte;
    }

    public void setPorte(Double porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "MovimientoResponse [codigoMovimineto=" + codigoMovimineto + ", movimientoNumero=" + movimientoNumero
                + ", empleado=" + empleado + ", fecha=" + fecha + ", tipoMovimiento=" + tipoMovimiento + ", porte="
                + porte + "]";
    }

}
