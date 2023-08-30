
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistence.ControladoraPersistencia;
import java.util.List;

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

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }
    
    //trae todos los atos para mostrar en la lista
    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    //trae un auto para modificar
    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca,
            String motor, String color, String patente, int cantPuertas) {
        
        //seteamos los datos nuevos a el auto actual
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        //le pasamos a la persistencia el auto completo con los datos modificados
        controlPersis.modificarAuto(auto);
        
    }
    
    
}
