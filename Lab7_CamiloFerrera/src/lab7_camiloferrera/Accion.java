package lab7_camiloferrera;

import javax.swing.JDialog;
import javax.swing.JProgressBar;

public class Accion extends Thread {
    private JProgressBar barra;
    private int segundos;
    private JDialog dialog;

    public Accion(JProgressBar barra, int segundos, JDialog dialog) {
        this.barra = barra;
        this.segundos = segundos;
        barra.setMaximum(segundos);
        this.dialog = dialog;
    }
    
    @Override
    public void run() {
        boolean avance = true;
        while (avance == true) {            
            barra.setValue(barra.getValue()+1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            
            if (barra.getValue() == barra.getMaximum()) {
                avance = false;
                dialog.setVisible(false);
            }
        }
        
        
    }
    
    
}
