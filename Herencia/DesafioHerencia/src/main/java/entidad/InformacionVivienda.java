/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author peras
 */
public class InformacionVivienda {
    private int nDeDormitorios;
    private String tipoDeParedes;
    private String tipoDePiso;
    private String iluminacion;

    public InformacionVivienda() {
    }

    public InformacionVivienda(int nDeDormitorios, String tipoDeParedes, String tipoDePiso, String iluminacion) {
        this.nDeDormitorios = nDeDormitorios;
        this.tipoDeParedes = tipoDeParedes;
        this.tipoDePiso = tipoDePiso;
        this.iluminacion = iluminacion;
    }
    
}
