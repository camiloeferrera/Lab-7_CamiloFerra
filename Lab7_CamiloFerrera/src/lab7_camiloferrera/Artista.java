package lab7_camiloferrera;

import java.io.Serializable;
import java.util.ArrayList;

public class Artista implements Serializable {
    private String nombre,usuario,contraseña,genero;
    private ArrayList <Cancion> canciones = new ArrayList();

    public Artista(String nombre, String usuario, String contraseña, String genero) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public String getUsuario() {
        return usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getGenero() {
        return genero;
    }
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
