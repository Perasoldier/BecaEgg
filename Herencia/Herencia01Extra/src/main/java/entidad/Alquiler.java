/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Alquiler {

    private String nombre;
    private Integer documento;
    private LocalDate fechainicial;
    private LocalDate fechadevolucion;
    private int bahia;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, LocalDate fechainicial, LocalDate fechadevolucion, int bahia) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechainicial = fechainicial;
        this.fechadevolucion = fechadevolucion;
        this.bahia = bahia;
    }

    public Alquiler(String nombre, Integer documento, LocalDate fechainicial, LocalDate fechadevolucion, int bahia, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechainicial = fechainicial;
        this.fechadevolucion = fechadevolucion;
        this.bahia = bahia;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(LocalDate fechainicial) {
        this.fechainicial = fechainicial;
    }

    public LocalDate getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(LocalDate fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public int getBahia() {
        return bahia;
    }

    public void setBahia(int bahia) {
        this.bahia = bahia;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.documento);
        hash = 97 * hash + Objects.hashCode(this.fechainicial);
        hash = 97 * hash + Objects.hashCode(this.fechadevolucion);
        hash = 97 * hash + this.bahia;
        hash = 97 * hash + Objects.hashCode(this.barco);
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
        final Alquiler other = (Alquiler) obj;
        if (this.bahia != other.bahia) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        if (!Objects.equals(this.fechainicial, other.fechainicial)) {
            return false;
        }
        if (!Objects.equals(this.fechadevolucion, other.fechadevolucion)) {
            return false;
        }
        return Objects.equals(this.barco, other.barco);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechainicial=" + fechainicial + ", fechadevolucion=" + fechadevolucion + ", bahia=" + bahia + ", barco=" + barco + '}';
    }

    public int calculoAlquiler() {
//        int dias = this.fechadevolucion.getDayOfMonth() - this.fechainicial.getDayOfMonth();
        long diasPlus = ChronoUnit.DAYS.between(this.fechainicial, this.fechadevolucion);
//        Period period = Period.between(rentDate, returnDate);
//		int totalDays = period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
//        System.out.println("dias metodo chrono " + diasPlus);
//        System.out.println("Dias metodo santi " + dias);

        return (int)(diasPlus * this.barco.modulo());
    }

    public void crearAlquiler() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese nombre:");
        this.nombre = scan.next();
        System.out.println("ingrese documento");
        this.documento = scan.nextInt();

        System.out.println("Ingrese la fecha de inicio del alquiler: ");
        System.out.println("Ingrese el año: ");
        Integer anio = scan.nextInt();
        System.out.println("Ingrese el mes: ");
        Integer mes = scan.nextInt();
        System.out.println("Ingrese el dia: ");
        Integer dia = scan.nextInt();
        this.fechainicial = LocalDate.of(anio, mes, dia);

        System.out.println("ingrese fecha devolucion");

        System.out.println("Ingrese el año: ");
        anio = scan.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = scan.nextInt();
        System.out.println("Ingrese el dia: ");
        dia = scan.nextInt();
        this.fechadevolucion = LocalDate.of(anio, mes, dia);
        System.out.println("bahia");
        this.bahia = scan.nextInt();

        System.out.println("Ingrese el tipo de barco");
        System.out.println("1- Velero");
        System.out.println("2- Lancha");
        System.out.println("3- Yate");

        switch (scan.nextInt()) {
            case 1:
                Velero velero = new Velero();
                velero.crearBarco();
                this.barco = velero;
                break;
            case 2:
                Lancha lancha = new Lancha();
                lancha.crearBarco();
                this.barco = lancha;
                break;
            case 3:
                Yate yate = new Yate();
                yate.crearBarco();
                this.barco = yate;
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;

        }
        System.out.println("$"+calculoAlquiler());
    }
}
