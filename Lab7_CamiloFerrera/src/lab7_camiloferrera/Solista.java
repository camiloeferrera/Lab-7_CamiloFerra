package lab7_camiloferrera;

public class Solista extends Artista   {
    private int edad;

    public Solista(String nombre, String usuario, String contraseña, String genero, int edad) {
        super(nombre, usuario, contraseña, genero);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
