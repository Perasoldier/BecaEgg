/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    Scanner scan = new Scanner(System.in);
    
    public void crearAlumnos(){
        for (int i = 0; i < 5; i++) {
          System.out.println("Ingrese Nombre alumno "+ (i+1));
          alumnos[i] = scan.nextLine();
        }
    }    
    
    public void crearCurso(){
        System.out.println("Ingrese nombre del curso:");
        this.nombreCurso=scan.nextLine();
        System.out.println("Ingrese cantidad horas por dia:");
        this.cantidadHorasPorDia=scan.nextInt();
        System.out.println("Ingrese cantidad dias por semana:");
        this.cantidadDiasPorSemana=scan.nextInt();
        System.out.println("Ingrese turno:");
        
        do {
            this.turno=scan.nextLine();

        } while ((!"manana".equalsIgnoreCase(this.turno))&&(!"tarde".equalsIgnoreCase(this.turno)));
        
        System.out.println("Ingrese valor hora:");
        this.precioPorHora = scan.nextInt();
        
        scan.nextLine();
        
        crearAlumnos();
    }
    
    public void calcularGananciaSemanal(){
        
        System.out.println("Ganancia semanal: $"+ (this.cantidadHorasPorDia*this.precioPorHora*5*this.cantidadDiasPorSemana));
        
    }
    
}
