import java.util.ArrayList;
import java.util.List;

public class SistemaFutbol {
    private List<Competencia> competencias = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<Arbitro> arbitros = new ArrayList<>();

    public Competencia crearCompetencia(String nombre) {
        Competencia competencia = new Competencia(nombre);
        competencias.add(competencia);
        return competencia;
    }

    public Equipo registrarEquipo(String nombre) {
        Equipo equipo = new Equipo(nombre);
        equipos.add(equipo);
        return equipo;
    }

    public Arbitro registrarArbitro(String nombre) {
        Arbitro arbitro = new Arbitro(nombre);
        arbitros.add(arbitro);
        return arbitro;
    }

    // Métodos adicionales según el diagrama...
}

