package com.pe.certus.service;

import java.util.List;
import com.pe.certus.entity.Empleado;

public interface EmpleadoService {
    //Definición del contrato de operaciones disponibles para empleado
    
    public List<Empleado> listEmpleados(); 
    public Empleado getIdEmpleado(Long id); 
    public void createUpdateEmpleado(Empleado empleado); 
    public void deleteEmpleado(Long id); 
}