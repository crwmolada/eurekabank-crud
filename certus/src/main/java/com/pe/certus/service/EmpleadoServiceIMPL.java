package com.pe.certus.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.certus.entity.Empleado;
import com.pe.certus.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceIMPL implements EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Override
    public List<Empleado> listEmpleados() {
        return empleadoRepository.findAll();
    }
    
    @Override
    public Empleado getIdEmpleado(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }
    
    @Override
   public void createUpdateEmpleado(Empleado empleado) {
		Empleado emp = new Empleado();
		emp.setId(empleado.getId());
		emp.setPaterno(empleado.getPaterno());
		emp.setMaterno(empleado.getMaterno());
		emp.setNombre(empleado.getNombre());
        emp.setUsuario(empleado.getUsuario());
		emp.setClave(empleado.getClave());
		emp.setEstado(empleado.getEstado());
		if(empleado.getEstado() == null) { 
			emp.setEstado(true);
		} else {
			emp.setEstado(empleado.getEstado());
		}
		
		empleadoRepository.save(emp);	
	}

    
    @Override
    public void deleteEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}