/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author peras
 */
public class FactorDeRiesgo extends Familia {
    
    private ArrayList<Integer> factores;

    public FactorDeRiesgo() {
    }

    public FactorDeRiesgo(ArrayList<Integer> factores, String direccion, int ide, int nDeLote, String barrio, String localidad) {
        super(direccion, ide, nDeLote, barrio, localidad);
        this.factores = factores;
    }
    
    
}
