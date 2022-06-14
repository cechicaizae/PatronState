/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author ce.christian
 */
public class Hambriento implements Estado{
    private Mascota mascota;
    public Hambriento(){
        
    }

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("comiending...");
        mascota.getEstado(new Aburrido());
    }

    @Override
    public void jugar() {
        System.out.println("No quiero jugar, tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueno");
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo hambre, quiero comer");
    }
    
}
