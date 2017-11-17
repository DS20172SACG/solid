/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4dip.bien;

/**
 *
 * @author Usuario
 */
public class Computador {
    private int ram;
    private int almacenamiento;
    private String SO;

    public Computador() {
    }

    public Computador(int ram, int almacenamiento, String SO) {
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.SO = SO;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
    
    
}
