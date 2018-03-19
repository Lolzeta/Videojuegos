import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class juegoLanzamientoTest {

    static Director d1;
    static Director d2;
    static Fecha f1;
    static Fecha actual;
    static Fecha actual2;
    static ArrayList<Videojuego>videojuegos = new ArrayList<>();
    static  Videojuego v1;
    static  Videojuego v2;
    static  Videojuego v3;
    static  Videojuego v4;
    static  Videojuego v5;
    static  Videojuego v6;
    static  Videojuego v7;
    static  Videojuego v8;
    static  Videojuego v9;
    static  Videojuego v10;
    static Tienda t1;

    @BeforeAll
    static void creaObjetos(){
        t1 = new Tienda();
        d1 = new Director("Pepe");
        d2 = new Director("Cabesa");
        f1 = new Fecha();
        actual = new Fecha(17,4,2020);
        actual2 = new Fecha(16,4,2020);
        v1 = new Videojuego("Juego1","FPS", d1,actual);
        v2 = new Videojuego("Juego2","GambaForce", d1, f1);
        v3 = new Videojuego("Juego3","Ay",d2,actual);
        v4 = new Videojuego("Juego4","baby",d2,f1);
        v5 = new Videojuego("Juego5","ey",d2,f1);
        v6 = new Videojuego("Juego6","aa",d2,actual);
        v7 = new Videojuego("Juego7","ooooo", d2,f1);
        v8 = new Videojuego("Juego8","memes",d2,f1);
        v9 = new Videojuego("Juego9","rest",d2,f1);
        v10 = new Videojuego("Juego10", "Best team",d2,f1);
        videojuegos.add(v1);
        videojuegos.add(v3);
        videojuegos.add(v6);
        Tienda t1 = new Tienda();
        t1.agregar(v1);
        t1.agregar(v2);
        t1.agregar(v3);
        t1.agregar(v4);
        t1.agregar(v5);
        t1.agregar(v6);
    }
    static int contador = 0;
    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }
    @DisplayName("Método que calcula cuantos años lleva el juego de lanzamiento.")
    @Test
    void juegosLanzamiento1() {
        assertNotEquals(videojuegos,t1.juegosLanzamiento(f1));
    }
    @Test
    void juegosLanzamiento2() {
        ArrayList<Videojuego> games = t1.juegosLanzamiento(actual);
        for(int i = 0; i < games.size();i++){
            assertEquals(games,videojuegos);
        }
    }
    @Test
    void juegosLanzamiento3(){
        assertNotNull(t1.juegosLanzamiento(actual2));
    }
}