/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.transports;

import ec.edu.espol.interfaces.IStrategy;

/**
 *
 * @author icrio
 */
public class Transports {
    private IStrategy Estrategia_Transporte;
    
    public void setStrategy(IStrategy Estrategia_Escogida){
        this.Estrategia_Transporte = Estrategia_Escogida;
    }
    public void transportar_CargaEjecutar(){
        Estrategia_Transporte.transportar_carga();
    }
}
