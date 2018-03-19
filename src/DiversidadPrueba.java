import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DiversidadPrueba{

    static int contador = 0;
    static Director d1;
    static Consola c1;
    static Consola c2;
    static Consola c3;
    static Videojuego v1;
    static Videojuego v2;
    static Videojuego v3;
    static Videojuego v4;
    static Videojuego v5;
    static Videojuego v6;
    static Videojuego v7;
    static Videojuego v8;
    static Videojuego v9;
    static Videojuego v10;
    static Videojuego v11;


    @BeforeAll
    static void creacion() {
        d1 = new Director("Pepe");
        Fecha f1 = new Fecha();
        v1 = new Videojuego("CSGOOO","FPS", d1,f1);
        v2 = new Videojuego("Gambisimaaaaa","GambaForce", d1,f1);
        v3 = new Videojuego("Peeew","Ay",d1,f1);
        v4 = new Videojuego("Yay","baby",d1,f1);
        v5 = new Videojuego("ey","ey",d1,f1);
        v6 = new Videojuego("aaa","aa",d1,f1);
        v7 = new Videojuego("aaaaaaaaa","ooooo", d1,f1);
        v8 = new Videojuego("asa","memes",d1,f1);
        v9 = new Videojuego("rip","rest",d1,f1);
        v10 = new Videojuego("Cadiz Simulator", "Best team",d1,f1);
        v11 = v1;
        c1 = new Consola("PepeGameX");
        c2 = new Consola("GambaGamer");
        c3 = new Consola("GalardonerPepsi");
        c1.agregar(v1);
        c1.agregar(v2);
        c1.agregar(v3);
        c1.agregar(v4);
        c1.agregar(v5);
        c1.agregar(v6);
        c1.agregar(v7);
        c1.agregar(v8);
        c1.agregar(v9);
        c1.agregar(v10);
        c2.agregar(v1);
        c2.agregar(v2);
        c2.agregar(v3);
        c2.agregar(v4);
        c2.agregar(v5);
        c2.agregar(v6);
        c2.agregar(v7);
        c2.agregar(v8);
        c2.agregar(v9);
        c3.agregar(v1);
        c3.agregar(v2);
        c3.agregar(v3);
        c3.agregar(v4);
        c3.agregar(v5);
        c3.agregar(v6);
        c3.agregar(v7);
        c3.agregar(v8);
        c3.agregar(v9);
        c3.agregar(v11);
    }


    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }

    @AfterAll
    static void nulear(){
        d1 = null;
        c1 = null;
        c2 = null;
        c3 = null;
        v1 = null;
        v2 = null;
        v3 = null;
        v4 = null;
        v5 = null;
        v6 = null;
        v7 = null;
        v8 = null;
        v9 = null;
        v10 = null;
        v11 = null;
    }

    @DisplayName("Comprueba que tiene diversidad.")
    @Test
    void pruebaUno(){
        assertTrue(c1.diversidad());
    }

    @DisplayName("Comprueba que no tiene diversidad con un juego menos.")
    @Test
    void PruebaDos(){
        assertFalse(c2.diversidad());
    }

    @DisplayName("Comprueba que no tiene diversidad con 10 juegos y dos juegos del mismo genero.")
    @Test
    void PruebaTres(){
        assertFalse(c3.diversidad());
    }
}