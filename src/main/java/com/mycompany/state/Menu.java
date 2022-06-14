/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

import java.util.Scanner;

/**
 *
 * @author ce.christian
 */
public class Menu {
    Mascota mascota;
    
    public Menu(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public void display(){
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Realizar accion: " + 
                "a) alimentar, d) dormir, j) jugar, p) preguntar, s) salir";
        while (true){
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion){
                case 'a': System.out.println("Mascota: "); mascota.alimentar(); break;
                case 'd': System.out.println("Mascota: "); mascota.dormir(); break;
                case 'j': System.out.println("Mascota: "); mascota.jugar(); break;
                case 'p': System.out.println("Mascota: "); mascota.comoEstas(); break;
                case 's': System.out.println("Hasta pronto: "); System.exit(0);
                default: System.out.println("Opcion no valida");
            }
        }
    }
}
