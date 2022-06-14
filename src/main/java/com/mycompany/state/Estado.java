/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author ce.christian
 */
public interface Estado {
    void setMascota (Mascota mascota);
    void alimentar();
    void jugar();
    void dormir();
    void comoEstas();
}
