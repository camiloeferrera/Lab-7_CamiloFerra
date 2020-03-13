package lab7_camiloferrera;

import java.util.ArrayList;


public class Usuario {
    private String nombre,usuario,contraseña;
    private int edad;
    private ArrayList<Evento> eventos = new ArrayList();
    private ArrayList<Artista> artistas = new ArrayList();
    private boolean administrador = false;

    public Usuario(String nombre, String usuario, String contraseña, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.edad = edad;
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
    public int getEdad() {
        return edad;
    }
    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    public ArrayList<Artista> getArtistas() {
        return artistas;
    }
    public boolean isAdministrador() {
        return administrador;
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
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
}