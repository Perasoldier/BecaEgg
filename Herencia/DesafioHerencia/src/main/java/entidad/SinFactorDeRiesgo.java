/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author peras
 */
public class SinFactorDeRiesgo extends Familia{
    private boolean mejora;
    private InformacionVivienda info;
    
    public SinFactorDeRiesgo() {
    }

    public SinFactorDeRiesgo(boolean mejora, InformacionVivienda info) {
        this.mejora = mejora;
        this.info = info;
    }

    public SinFactorDeRiesgo(boolean mejora, InformacionVivienda info, String direccion, int ide, int nDeLote, String barrio, String localidad) {
        super(direccion, ide, nDeLote, barrio, localidad);
        this.mejora = mejora;
        this.info = info;
    }


    
}
