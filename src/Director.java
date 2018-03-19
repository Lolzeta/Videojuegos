import java.util.ArrayList;
import java.util.Iterator;

public class Director {

    String nombre;
    ArrayList<Videojuego> games = new ArrayList<>();

    public Director(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Videojuego v){
        games.add(v);
    }
}
