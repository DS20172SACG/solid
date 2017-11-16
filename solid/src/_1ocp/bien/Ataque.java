/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;


/**
 *
 * @author Palacios
 */
public class Ataque {
    public static final double ATAQUE_AGUA = 0.70;
    public static final double ATAQUE_FUEGO = 0.50;
    public static final double ATAQUE_AIRE = 0.80;
    public static final double ATAQUE_PLANTA = 0.60;
    
    public double daño; //Este tomará el valor que se coloca en el constructor.
    
    public Ataque(double valor){
        this.daño = valor;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }
    
}
