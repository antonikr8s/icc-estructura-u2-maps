import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.EmpleadoDao;
import controllers.EmpleadoDaoHashmap;
import controllers.EmpleadoDaoTreemap;
import controllers.Mapa;
import models.Empleado;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 
         * // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
         * runMapExample();
         * 
         * // Ejecuta el ejemplo de gestión de empleados usando HashMap
         * runEmpleadoExample();
         * 
         * // Ejecuta los ejercicios de sumatoria y anagramas
         * runEjercicios();
         * }
         * 
         * private static void runEmpleadoExample() {
         * Mapa mapa = new Mapa();
         * mapa.ejemploConHashMap();
         * mapa.ejemploConLinkedHashMap();
         * }
         * 
         * private static void runMapExample() {
         * Mapa mapa = new Mapa();
         * mapa.ejemploConHashMap();
         * mapa.ejemploConLinkedHashMap();
         * }
         * 
         * private static void runEjercicios() {
         * throw new UnsupportedOperationException("Not implemented yet");
         * 
         * }
         */
        EmpleadoDao empleadoDaoHash = new EmpleadoDaoHashmap();
        EmpleadoController empleadoController = new EmpleadoController(empleadoDaoHash);

        EmpleadoDao empleadoDaoTree = new EmpleadoDaoTreemap();
        EmpleadoController empleadoController2 = new EmpleadoController(empleadoDaoTree);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(1, "Juan", "Dev");
        Empleado emp3 = new Empleado(3, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoController2.agregarEmpleado(emp1);
        empleadoController2.agregarEmpleado(emp2);
        empleadoController2.agregarEmpleado(emp3);
        empleadoController2.agregarEmpleado(emp4);
        empleadoController2.agregarEmpleado(emp5);

        empleadoController.agregarEmpleado(emp1);
        empleadoController.agregarEmpleado(emp2);
        empleadoController.agregarEmpleado(emp3);
        empleadoController.agregarEmpleado(emp4);
        empleadoController.agregarEmpleado(emp5);

        empleadoController.mostrarEmpleados();
        empleadoController2.mostrarEmpleados();
    }
}