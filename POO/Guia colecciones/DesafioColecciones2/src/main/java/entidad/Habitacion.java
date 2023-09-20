/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;
import java.time.LocalDate;
/**
 *
 * @author peras
 */
public class Habitacion {
     private int numeroHab;
    private LocalDate ocupacion;
    
    public Habitacion() {
    }
    public Habitacion(int numeroHab, LocalDate ocupacion) {
        this.numeroHab = numeroHab;
        this.ocupacion = ocupacion;
    }

    // Habitacion 1 - 5: Entran 2 personas
    // Habitacion 6 - 8: Entran hasta 3 personas
    // Habitacion 9 - 10: Entra 1 sola persona
    public int capacidad() {
        switch (this.numeroHab) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 2;
            case 6:
            case 7:
            case 8:
                return 3;
            case 9:
            case 10:
                return 1;
        }
        return 0;
    }

    public int getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }

    public LocalDate getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(LocalDate ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Habitacion [numeroHab=" + numeroHab + ", ocupacion=" + ocupacion + "]";
    }
}


