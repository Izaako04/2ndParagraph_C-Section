/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.transports;

import ec.edu.espol.interfaces.IStrategy;

/**
 *
 * @author icrio
 */
public class Vía_Ciclista implements IStrategy {

    @Override
    public void transportar_carga() {
        System.out.println("Estrategia de transporte seleccionada: Vía Automotriz");
    }
    
}
