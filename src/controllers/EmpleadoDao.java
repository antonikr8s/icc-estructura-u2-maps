package controllers;

import models.Empleado;

public interface EmpleadoDao {
    public void agregarEmpleado(Empleado empleado);

    public void eliminarEmpleado(int id);

    public void mostrarEmpleados();
}
