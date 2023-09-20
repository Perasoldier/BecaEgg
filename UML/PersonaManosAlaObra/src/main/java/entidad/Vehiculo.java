package entidad;

import java.util.Objects;

public class Vehiculo {

    private String tipo;

    private Persona propietario;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, Persona propietario) {
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.tipo);
        hash = 97 * hash + Objects.hashCode(this.propietario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return Objects.equals(this.propietario, other.propietario);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + ", propietario=" + propietario + '}';
    }
}
