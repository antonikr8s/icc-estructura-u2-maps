package controllers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    /**
     * Quito, Ecuador
     * Lima, Perú
     * Bogotá, Colombia
     */
    public void ejemploConHashMap() {

        Map<Integer, Empleado> empleados = new HashMap<>();

        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));

        System.out.println("Empleados por ID:");
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // HashMap con clave Empleado 
        Map<Empleado, Integer> empleadosDos = new HashMap<>();

        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        // Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        // empleadosDos.put(emp4, 2000);

        System.out.println("\nEmpleados y sueldo como clave :");
        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        // TreeMap ordenado 
        Map<Empleado, Integer> empleadosTree = new TreeMap<>(Comparator.comparingInt(Empleado::getId));

        empleadosTree.put(emp2, 1200);

        emp2.setPosition("Diseñador");

        System.out.println("\nEmpleado 2 modificado en TreeMap:");
        for (Map.Entry<Empleado, Integer> entry : empleadosTree.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }

    public void ejemploConLinkedHashMap() {
        Map<String, String> ciudades = new LinkedHashMap<>();
        ciudades.put("Madrid", "España");
        ciudades.put("París", "Francia");
        ciudades.put("Roma", "Italia");

        System.out.println("\nCiudades con LinkedHashMap:");
        for (Map.Entry<String, String> entry : ciudades.entrySet()) {
            System.out.println("Ciudad: " + entry.getKey() + ", Pais: " + entry.getValue());
        }
    }
}
