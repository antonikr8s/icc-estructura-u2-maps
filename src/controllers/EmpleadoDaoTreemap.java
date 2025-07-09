package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDaoTreemap implements EmpleadoDao {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDaoTreemap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);
    }

    @Override
    public void eliminarEmpleado(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }

    @Override
    public void mostrarEmpleados() {
        System.out.println("===== Empleados (TreeMap) =====");
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
