package model;

public class Persona {

        private String nombre;

        private String telefono;

        private Direccion direccion ;

        public Persona() {
        }

        public Persona (String nombre, String telefono, Direccion direccion) {
            this.nombre = nombre;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public Direccion getDireccion() {
            return direccion;
        }

        public void setDireccion(Direccion direccion) {
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", telefono=" + telefono +
                    ", direccion=" + direccion +
                    '}';
        }
    }

