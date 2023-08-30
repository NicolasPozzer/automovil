
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistence.ControladoraPersistencia;

public class Controladora {
    //Comunicamos la controladora logica con la de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
            
    //Metodos:
    public void agregarAutomovil(String modelo, String marca, String motor,
            String color, String patente, int cantPuertas) {
        
        //se crea el auto y se le setean los valores agregados por teclado en 
        //las cajas de texto de la igu
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(auto);
        
    }
    
    
}
