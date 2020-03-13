package lab7_camiloferrera;

public class Banda extends Artista {
    private int integrantes;

    public Banda(int integrantes, String nombre, String usuario, String contraseña, String genero) {
        super(nombre, usuario, contraseña, genero);
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }
    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }
    
    
}
