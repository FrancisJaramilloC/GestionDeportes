import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private String nombre;
    private List<Equipo> equipoList = new ArrayList<>();
    private List<Partido> partidoList = new ArrayList<>();

    public Competencia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEquipo(Equipo equipo) {
        equipoList.add(equipo);
    }

    public void eliminarEquipo(Equipo equipo) {
        equipoList.remove(equipo);
    }

    public void programarPartido(Partido partido) {
        partidoList.add(partido);
    }

    public Equipo determinarGanador(Partido partido) {
        // Implementar lógica para determinar ganador
        return null;
    }

    // Métodos adicionales según el diagrama...
}
