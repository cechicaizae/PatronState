/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ce.christian
 */
public class Durmiendo implements Estado{
private Mascota = mascota;
public Durmiendo(){
    
}
    
    
    
    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
        
        Timer timer = new Timer();
        timer.schedule (new TimerTask() {
            @Override
            public void run(){
                Durmiendo.this.mascota.setEstado(new Hambriento());
            }
        }, 5000);
    }

    @Override
    public void alimentar() {
        System.out.println("...");
    }

    @Override
    public void jugar() {
        System.out.println("...");
    }

    @Override
    public void dormir() {
        System.out.println("...");
    }

    @Override
    public void comoEstas() {
        System.out.println("...");
    }
    
}
