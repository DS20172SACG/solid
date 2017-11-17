/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.bien;

/**
 *
 * @author Palacios
 */
public class Programador {
    
    private Computador computadora;
    
    public Programador() {
        this.computadora = new Computador(60,200,"Windows"); //Ahora el programador puede tener un computador con cualquier SO
    }

    public Computador getComputadora() {
        return computadora;
    }

    public void setComputadora(Computador computadora) {
        this.computadora = computadora;
    }

    
    
    
    
}
