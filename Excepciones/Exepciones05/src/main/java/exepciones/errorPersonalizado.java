/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exepciones;

/**
 *
 * @author peras
 */
public class errorPersonalizado extends Exception{

    /**
     * Creates a new instance of <code>errorPersonalizado</code> without detail
     * message.
     */
    public errorPersonalizado() {
    }

    /**
     * Constructs an instance of <code>errorPersonalizado</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public errorPersonalizado(String msg) {
        super(msg);
    }
}
