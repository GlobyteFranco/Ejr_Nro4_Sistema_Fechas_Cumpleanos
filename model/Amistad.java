package model;

import java.time.LocalDate;

public class Amistad {
    private String nombre;
    private String apellido;
    private LocalDate Cumple;

    public Amistad(String nombre, String apellido, LocalDate cumple) {
        this.nombre = nombre;
        this.apellido = apellido;
        Cumple = cumple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getCumple() {
        return Cumple;
    }

    public void setCumple(LocalDate cumple) {
        Cumple = cumple;
    }

    @Override
    public String toString() {
        return "Nombre =" + nombre + ", Apellido =" + apellido + ", Cumple =" + Cumple + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Amistad other = (Amistad) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (Cumple == null) {
            if (other.Cumple != null)
                return false;
        } else if (!Cumple.equals(other.Cumple))
            return false;
        return true;
    }

}
