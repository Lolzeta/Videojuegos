import java.util.ArrayList;
import java.util.Iterator;

public class Director {

    String nombre;
    ArrayList<Videojuego> games = new ArrayList<>();

    public Director(String nombre) {
        this.nombre = nombre;
    }


    // Método que devuelve un juego del mismo director
    public Videojuego buscarJuego(Videojuego game) {
        for (Videojuego v: games){
            if (v.director.equals(game) && !v.nombre.equals(game)){
                return v;
            }
        }
        return null;
    }

    public void agregar(Videojuego v){
        games.add(v);
    }
}
