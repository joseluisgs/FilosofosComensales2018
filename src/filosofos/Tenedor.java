/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author link
 */
public class Tenedor {
    private boolean tomado = false;

    public synchronized void tomar(){
        while (tomado) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.err.println("Error al tomar el tenedor");
            }
        }
        tomado = true;
    }

    public synchronized void dejar() {
        tomado = false;
        notify();
    }
    
}

