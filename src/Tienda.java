import java.util.ArrayList;

public class Tienda {

    ArrayList<Videojuego> stock = new ArrayList<>();

    // Método que tedevuelva todos los videojuegos a partir de una fecha de lanzamiento.

    public ArrayList<Videojuego> juegosLanzamiento(Fecha fecha){
        ArrayList<Videojuego> lanzamiento = new ArrayList<>();
        for (Videojuego v: stock){
            if (v.lanzamiento.after(fecha) || v.lanzamiento.equals(fecha)){
                lanzamiento.add(v);
            }
        }
        return lanzamiento;
    }

    // Método que devuelva los videojuegos con un título entre 5 y 10 caracteres.

    public String shortNames(){
        String msg= "Juegos con nombres cortos:" + "\n";
        for (Videojuego v: stock){
            if (v.nombre.length()>=5 && v.nombre.length()<=10){
                msg+="- " + v + "\n";
            }
        }
        return msg;
    }

    public void agregar(Videojuego v){
        stock.add(v);
    }
}
