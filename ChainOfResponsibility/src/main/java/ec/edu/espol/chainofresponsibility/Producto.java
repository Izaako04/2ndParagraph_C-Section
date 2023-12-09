/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.chainofresponsibility;

/**
 *
 * @author USER
 */
public class Producto {
    private String nombre;
    private double precio;
    private boolean enGarantia;

    public Producto(String nombre, double precio, boolean enGarantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.enGarantia = enGarantia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean enPeriodoDeGarantia() {
        return enGarantia;
    }
}
