public class Enemigo {
    private final int vida;
    private final int velocidad;
    private final int danio;
    private String tipoEnemigo;
    public Enemigo(int vida, int velocidad, int danio, String tipoEnemigo){
        this.vida = vida;
        this.velocidad = velocidad;
        this.danio = danio;
        this.tipoEnemigo = tipoEnemigo;
    }

}
