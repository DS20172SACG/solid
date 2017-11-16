/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author Administrador
 */
public abstract class IAtaque {
    protected double daño = 0;
    
    public IAtaque(){
    }
    
    public double getDaño(){
        return daño;
    }
}
