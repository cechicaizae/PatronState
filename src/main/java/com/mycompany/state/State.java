/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.state;

/**
 *
 * @author ce.christian
 */
public class State {

    public static void main(String[] args) {
        Mascota dogui = new Mascota();
        new Menu(dogui).display();
    }
}
