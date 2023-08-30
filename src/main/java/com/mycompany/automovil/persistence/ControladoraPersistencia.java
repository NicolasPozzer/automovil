
package com.mycompany.automovil.persistence;

import com.mycompany.automovil.logica.Automovil;

public class ControladoraPersistencia {
    //con esto ya podemos hacer uso de todos los metodos que tenemos en el
    //JPA controller y poder usar todos sus metodos
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
    
    
}
