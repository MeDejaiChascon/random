public class Jugador {
    private String nombre;
    private int vida;
    private int velocidad;
    private int danio;
    private String clase;

    public Jugador(String nombre, int vida, int velocidad, int danio, String clase){
        this.nombre = nombre;
        this.vida = vida;
        this.velocidad = velocidad;
        this.danio = danio;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
