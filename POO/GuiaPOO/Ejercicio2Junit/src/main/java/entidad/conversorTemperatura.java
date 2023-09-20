/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author peras
 */
public class conversorTemperatura {
    private double temperaturaC ;

    public conversorTemperatura() {
    }

    public conversorTemperatura(double temperaturaC) {
        this.temperaturaC = temperaturaC;
    }

    public double getTemperaturaC() {
        return temperaturaC;
    }

    public void setTemperaturaC(double temperaturaC) {
        this.temperaturaC = temperaturaC;
    }

    @Override
    public String toString() {
        return "conversorTemperatura{" + "temperaturaC=" + temperaturaC + '}';
    }
    
    public double farenheit(){
        return (this.temperaturaC * 9/5) + 32;
    }
    
    public double kelvin(){
        return this.temperaturaC + 273.15;
    }
    
}
