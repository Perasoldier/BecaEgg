/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class PersonaEJ12 {
    private String nombre;
    private Date fechaNacimiento;

    public PersonaEJ12() {
    }

    public PersonaEJ12(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void crearPersona(){
        Scanner scan = new Scanner(System.in);
        int dia, mes,anio;
        
        System.out.println("Ingrese su nombre:");
        this.nombre=scan.nextLine();
        scan.next();
        
        System.out.println("Ingrese dia de nacimiento:");
        dia = scan.nextInt();
        
        System.out.println("Ingrese mes de nacimiento:");
        mes = scan.nextInt();
        
        System.out.println("Ingrese año de nacimiento:");
        anio = scan.nextInt();
    }
    
    
    
}
