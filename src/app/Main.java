package app;

import model.Direccion;
import model.Empleado;

public class Main {
    public static void main(String[] args) {

        // 1. Crear direcciones
        Direccion dir1 = new Direccion("Cibeles 1", "Los angeles", "VII");
        Direccion dir2 = new Direccion("Av. Alemania 450", "Temuco", "IX");
        Direccion dir3 = new Direccion("Calle San Martin 120", "Concepcion", "VIII");

        // 2. Crear empleados directamente (con id, nombre, teléfono y dirección gracias a la herencia)
        Empleado empleado1 = new Empleado(159611, "Ana Jerez", "+56912345678", dir1);
        Empleado empleado2 = new Empleado(159612, "Carlos Mendoza", "+56987654321", dir2);
        Empleado empleado3 = new Empleado(159613, "Beatriz Silva", "+56955512345", dir3);

        // 3. Mostrar los datos por consola usando toString()
        System.out.println("=== SISTEMA DE REGISTRO - LLANQUIHUE TOUR ===");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println("--------------------------------------------------");

    }
}