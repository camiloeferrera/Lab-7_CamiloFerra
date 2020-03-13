package lab7_camiloferrera;

public class Cancion {
    private String nombre;
    private int duracion; // en segundos

    public Cancion(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }
    public int getDuracion() {
        return duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
