package main.personamanosalaobra;

import entidad.Dni;
import entidad.Persona;
import java.util.ArrayList;

public class PersonaManosAlaObra {

    public static void main(String[] args) {
        Persona adan = new Persona("adan", "jesus", new Dni('M', 0000000001));
        Persona eva = new Persona("eva", "jesus", new Dni('F', 0000000001));
    }

    private ArrayList<Persona> padronJesus;
}
