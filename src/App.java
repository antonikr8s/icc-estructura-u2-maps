import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runEmpleadoExample() {
    Mapa mapa = new Mapa();
    mapa.ejemploConHashMap();
    mapa.ejemploConLinkedHashMap();
}


    private static void runMapExample() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
    }

    private static void runEjercicios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}

