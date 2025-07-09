package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoDaoHashmap implements EmpleadoDao{
    //vamos al archivo daoHasman y treeman, se crea una variable global que es un mapa, empleado<empleado>
    //instanciamos las variables en un construcctor
    //vamos a agregar y eliminar un empleado
    
     
    private Map<Integer, Empleado> empleados;

    public EmpleadoDaoHashmap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);
    }

    @Override
    public void eliminarEmpleado(int id) {
        empleados.remove(id);
    }

    @Override
    public void mostrarEmpleados() {
        System.out.println("===== Empleados (HashMap) =====");
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

