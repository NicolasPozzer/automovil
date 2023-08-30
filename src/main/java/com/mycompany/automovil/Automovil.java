
package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        runProgram();
        
        
    }
    
    
    public static void runProgram(){
        Principal princi = new Principal();
        princi.setVisible(true);
        princi.setLocationRelativeTo(null);
    }
    
}
