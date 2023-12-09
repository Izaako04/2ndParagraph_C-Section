/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejadores;

import ec.edu.espol.chainofresponsibility.Producto;

/**
 *
 * @author USER
 */
public class AtencionUsuario extends Manejador {

    @Override
    public void manejarSolicitud(Producto producto) {
    verificarGarantia(producto);
        if (siguiente != null) {
            siguiente.manejarSolicitud(producto); }
    }
    
    public void verificarGarantia(Producto producto) {
    }
}
