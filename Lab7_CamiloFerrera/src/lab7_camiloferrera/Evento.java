package lab7_camiloferrera;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private Date fecha;
    private String ciudad,lugar;
    private ArrayList <Cancion> setlist = new ArrayList(); 

    public Evento(Date fecha, String ciudad, String lugar) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getLugar() {
        return lugar;
    }
    public ArrayList<Cancion> getSetlist() {
        return setlist;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void setSetlist(ArrayList<Cancion> setlist) {
        this.setlist = setlist;
    }
    
    
}
