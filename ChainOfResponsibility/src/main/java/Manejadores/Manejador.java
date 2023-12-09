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
public abstract class Manejador {
    protected Manejador siguiente;
    public abstract void manejarSolicitud(Producto producto);
  
}
