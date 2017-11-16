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
public class ManejadorAtaque {
    private final Pokemon pokemon;

    public ManejadorAtaque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    public void manejarAtaque(final Ataque ataque){
        this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*ataque.getDaño());
    }
}
