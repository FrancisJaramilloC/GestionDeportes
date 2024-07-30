import java.util.Date;

public class Partido {
    private int id;
    private Equipo equipo1;
    private Equipo equipo2;
    private String resultado;
    private Date fecha;
    private Arbitro arbitro;

    public Partido(int id, Equipo equipo1, Equipo equipo2, Date fecha, Arbitro arbitro) {
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.arbitro = arbitro;
    }

    public void intervenir(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public void iniciarPartido() {
        // Implementar lógica para iniciar el partido
    }

    // Métodos adicionales según el diagrama...
}
