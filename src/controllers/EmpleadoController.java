package controllers;

public class EmpleadoController {
    private EmpleadoDao dao;

    public EmpleadoController(EmpleadoDao dao) {
        this.dao = dao;
    }

    public void agregarEmpleado(models.Empleado empleado) {
        dao.agregarEmpleado(empleado);
    }

    public void eliminarEmpleado(int id) {
        dao.eliminarEmpleado(id);
    }

    public void mostrarEmpleados() {
        dao.mostrarEmpleados();
    }
}
