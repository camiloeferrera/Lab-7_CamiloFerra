package lab7_camiloferrera;

import java.util.logging.Level;
import java.util.logging.Logger;

public class hiloEspera extends Thread {
    private int espera;

    public hiloEspera(int espera) {
        this.espera = espera;
    }
    
    
    @Override
    public void run() {
        try {
            Thread.sleep(espera*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(hiloEspera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
