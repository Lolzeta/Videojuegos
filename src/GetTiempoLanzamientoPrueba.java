import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class getTiempoLanzamientoTest{

    static int contador = 0;
    static Director d1;
    static Fecha f1;
    static Fecha actual;
    static Videojuego v1;
    static Fecha actual2;

    @BeforeAll
    static void creaobjetos(){
        d1 = new Director("Pepe");
        f1 = new Fecha(17,4,2018);
        actual = new Fecha(17,4,2020);
        v1 = new Videojuego("CSGOOO","FPS", d1,f1);
        actual2 = new Fecha(11,1,2000);
    }

    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }

    @DisplayName("Método que te devuelva todos los videojuegos a partir de una fecha de lanzamiento.")
    @Test
    void prueba1(){
        assertEquals(2,v1.getTiempoLanzamiento(actual));
    }

    @Test
    void prueba2(){
        assertNotEquals(5,v1.getTiempoLanzamiento(actual));
    }

    @Test
    void prueba3(){
        assertNotEquals(null,v1.getTiempoLanzamiento(actual2));
    }
    @Test
    void prueba4(){
        assertNotNull(v1.getTiempoLanzamiento(actual2));
    }
}
