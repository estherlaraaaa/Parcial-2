/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

/**
 *
 * @author User
 */
public class Duende implements Raza {

    @Override
    public int vida(int vida) {
        return vida; 
    }

    @Override
    public int ataque(int ataque) {
        return ataque; 
    }


    @Override
    public int fase(int fase) {
        return fase= fase  - 1;
    }

    
}
