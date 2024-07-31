import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private List<Jugador> jugadores = new ArrayList<>();
    private int partidoGanado;
    private int partidoPerdido;
    private int partidoEmpatado;
    private int partidoJugado;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public void actualizarEstadistica(boolean ganado, boolean empatado) {
        if (ganado) {
            partidoGanado++;
        } else if (empatado) {
            partidoEmpatado++;
        } else {
            partidoPerdido++;
        }
        partidoJugado++;
    }

    public String getNombre() {
        return nombre;
    }
}
