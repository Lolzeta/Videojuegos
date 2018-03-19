import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CompararPrueba{

    static int contador = 0;
    static Videojuego v1;
    static Videojuego v2;
    static Videojuego v3;
    static Videojuego v4;
    static Videojuego v5;


    @BeforeAll
    static void creacion() {
        Director d1 = new Director("Paco");
        Fecha f1 = new Fecha();
        v1 = new Videojuego("CSGO", "FPS", d1, f1);
        v2 = new Videojuego("CSGO", "FPS", d1, f1);
        v3 = new Videojuego("Fornite", "BR", d1, f1);
        v4 = null;
        v5 = v1;
    }


    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }

    @AfterAll
    static void nulear(){
        v1 = null;
        v2 = null;
        v3 = null;
        v4 = null;
        v5 = null;
    }

    @DisplayName("Prueba que comprueba si es falso el resultado.")
    @Test
    void pruebaUno(){
        assertFalse(v1.comparar(v3));
    }

    @DisplayName("Prueba que comprueba si es verdadero el resultado.")
    @Test
    void pruebaDos(){
        assertTrue(v1.comparar(v2));
    }


    @DisplayName("Prueba que comprueba que el resultado no sea correcto al meterle un null.")
    @Test
    void pruebaTres(){
        assertFalse(v1.comparar(v4));
    }


    @DisplayName("Prueba que comprueba si al compararlo consigo mismo da correcto.")
    @Test
    void pruebaCuatro(){
        assertTrue(v1.comparar(v1));
    }


    @DisplayName("Prueba que compreuba si da correcto con un objeto que tiene la misma referencia.")
    @Test
    void pruebaCinco(){
        assertTrue(v1.comparar(v5));
    }
}
