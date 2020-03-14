package lab7_camiloferrera;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Evento implements Serializable {
    private Date fecha;
    private long capacidad;
    private String ciudad,lugar;
    private ArrayList <Cancion> setlist = new ArrayList(); 

    public Evento(Date fecha, String ciudad, String lugar, long capacidad) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.capacidad = capacidad;
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
    public long getCapacidad() {
        return capacidad;
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
    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
