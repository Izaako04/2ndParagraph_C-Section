/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chainofresponsibility;

import Manejadores.Manejador;

/**
 *
 * @author USER
 */
public class Cliente {
    private Manejador manejador;
    private Producto producto; 

    public Cliente(Manejador manejador) {
        this.manejador = manejador;
    }

    public void solicitarCambio(Producto p) {
        manejador.manejarSolicitud(p);
    }
}
