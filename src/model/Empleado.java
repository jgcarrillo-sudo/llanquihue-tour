package model;

public class Empleado extends Persona {
    private int id;

    public Empleado() {
        super(); // Llama al constructor vacío de Persona
    }

    /**
     *
     * @param id
     * @param nombre
     * @param telefono
     * @param direccion
     */
    public Empleado(int id, String nombre, String telefono, Direccion direccion) {
        super(nombre, telefono, direccion);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", " + super.toString() + // Muestra también los datos heredados de Persona
                '}';
    }
}