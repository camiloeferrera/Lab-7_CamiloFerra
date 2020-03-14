package lab7_camiloferrera;

import javax.swing.JProgressBar;

public class hiloConcierto extends Thread {
    private JProgressBar barra;
    private Evento e;

    public hiloConcierto(JProgressBar barra, Evento e) {
        this.barra = barra;
        this.e = e;
    }

    @Override
    public void run() {
        while (true) {
            barra.setMaximum(5);
            barra.setValue(barra.getValue()+1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        
        
    }
    
    
}
