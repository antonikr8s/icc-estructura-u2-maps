import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.EmpleadoDao;
import controllers.EmpleadoDaoHashmap;
import controllers.EmpleadoDaoTreemap;
import controllers.Mapa;
import models.Empleado;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando DAO con HashMap y TreeMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicios();
    }

    private static void runMapExample() {
        /*
         * Mapa mapa = new Mapa();
         * mapa.ejemploConHashMap();
         * mapa.ejemploConLinkedHashMap();
         */
    }

    private static void runEmpleadoExample() {

        /*
         * EmpleadoDao empleadoDaoHash = new EmpleadoDaoHashmap();
         * EmpleadoController empleadoController = new
         * EmpleadoController(empleadoDaoHash);
         * 
         * EmpleadoDao empleadoDaoTree = new EmpleadoDaoTreemap();
         * EmpleadoController empleadoController2 = new
         * EmpleadoController(empleadoDaoTree);
         * 
         * Empleado emp1 = new Empleado(5, "Pedro", "Dev");
         * Empleado emp2 = new Empleado(1, "Juan", "Dev");
         * Empleado emp3 = new Empleado(3, "Jose", "Dev");
         * Empleado emp4 = new Empleado(2, "Pedro", "Dev");
         * Empleado emp5 = new Empleado(4, "Pedro", "Dev");
         * 
         * empleadoController2.agregarEmpleado(emp1);
         * empleadoController2.agregarEmpleado(emp2);
         * empleadoController2.agregarEmpleado(emp3);
         * empleadoController2.agregarEmpleado(emp4);
         * empleadoController2.agregarEmpleado(emp5);
         * 
         * empleadoController.agregarEmpleado(emp1);
         * empleadoController.agregarEmpleado(emp2);
         * empleadoController.agregarEmpleado(emp3);
         * empleadoController.agregarEmpleado(emp4);
         * empleadoController.agregarEmpleado(emp5);
         * 
         * empleadoController.mostrarEmpleados();
         * empleadoController2.mostrarEmpleados();
         */
    }

    private static void runEjercicios() {
        Ejercicios ejercicios = new Ejercicios();

        // ----------------------------------------------------------
        // Ejercicio 01: Verificar si son anagramas (método estático)
        // ----------------------------------------------------------
        System.out.println("===== EJERCICIO.01 ====");
        System.out.println("¿'listen' y 'silent' son anagramas?");
        System.out.println(Ejercicios.areAnagrams("listen", "silent"));

        System.out.println("¿'hello' y 'bello' son anagramas?");
        System.out.println(Ejercicios.areAnagrams("hello", "bello"));

        System.out.println("¿'triangle' y 'integral' son anagramas?");
        System.out.println(Ejercicios.areAnagrams("triangle", "integral"));

        // ----------------------------------------------------------
        // Ejercicio 02: Buscar dos números que sumen un objetivo
        // ----------------------------------------------------------
        System.out.println("===== EJERCICIO.02 ====");

        // Ejemplo A
        int[] numsA = { 9, 2, 3, 6 };
        int objetivoA = 5;
        int[] resultadoA = ejercicios.sumatoriaDeDos(numsA, objetivoA);

        System.out.println("Ejemplo A:");
        System.out.println("Input: nums = [9,2,3,6], objetivo = 5");
        System.out.print("Output: ");
        if (resultadoA != null) {
            System.out.println("[" + resultadoA[0] + "," + resultadoA[1] + "]");
        } else {
            System.out.println("null");
        }

        // Ejemplo B
        int objetivoB = 10;
        int[] resultadoB = ejercicios.sumatoriaDeDos(numsA, objetivoB);

        System.out.println("Ejemplo B:");
        System.out.println("Input: nums = [9,2,3,6], objetivo = 10");
        System.out.print("Output: ");
        if (resultadoB != null) {
            System.out.println("[" + resultadoB[0] + "," + resultadoB[1] + "]");
        } else {
            System.out.println("null");
        }

        // ----------------------------------------------------------
        // Ejercicio 03: Contar caracteres
        // ----------------------------------------------------------
        System.out.println("===== EJERCICIO.03 ====");
        System.out.println("Frecuencia de caracteres en 'hola':");
        ejercicios.contarCaracteres("hola");

        // ----------------------------------------------------------
        // Ejercicio 04: Verificar si son anagramas (método no estático)
        // ----------------------------------------------------------
        System.out.println("===== EJERCICIO.04 ====");
        System.out.println("¿'roma' y 'amor' son anagramas?");
        System.out.println(ejercicios.sonAnagramas("roma", "amor"));
    }
}