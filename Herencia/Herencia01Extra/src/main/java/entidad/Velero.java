/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaces.Modulo;
import java.util.Scanner;

/**
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes.
 *
 * @author peras
 */
public class Velero extends Barco implements Modulo {

    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.mastiles;
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
        final Velero other = (Velero) obj;
        return this.mastiles == other.mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }

    public int precioAgregado() {
//        En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
        return modulo() * this.mastiles;
    }

    @Override
    public int modulo() {
//        System.out.println(super.getEslora() * 10 + this.mastiles);
        return super.getEslora() * 10 + this.mastiles;
    }

    @Override
    public void crearBarco() {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la matricula del barco");
        super.setMatricula(scan.nextInt());
        System.out.println("Ingrese la eslora del barco");
        super.setEslora(scan.nextInt());
        System.out.println("Ingrese el año de fabricacion del barco");
        super.setAnio(scan.nextInt());
        System.out.println("Ingrese cantidad de mastiles");
        this.mastiles = scan.nextInt();
    }

}
