import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del sistema de fútbol
        SistemaFutbol sistemaFutbol = new SistemaFutbol();

        // Crear competencias
        Competencia liga = sistemaFutbol.crearCompetencia("Liga de Clubes");

        // Registrar equipos
        Equipo equipo1 = sistemaFutbol.registrarEquipo("Equipo A");
        Equipo equipo2 = sistemaFutbol.registrarEquipo("Equipo B");

        // Registrar árbitros
        Arbitro arbitro1 = sistemaFutbol.registrarArbitro("Arbitro 1");

        // Agregar equipos a la competencia
        liga.agregarEquipo(equipo1);
        liga.agregarEquipo(equipo2);

        // Crear jugadores y agregar a los equipos
        Jugador jugador1 = new Jugador(1, "Jugador 1", "Delantero");
        Jugador jugador2 = new Jugador(2, "Jugador 2", "Defensa");

        equipo1.agregarJugador(jugador1);
        equipo2.agregarJugador(jugador2);

        // Programar un partido
        Partido partido = new Partido(1, equipo1, equipo2, new Date(), arbitro1);
        liga.programarPartido(partido);

        // Iniciar el partido
        partido.iniciarPartido();

        // Simular intervención del árbitro
        partido.intervenir(arbitro1);
        arbitro1.amonestar();
        arbitro1.anularGol();

        // Actualizar estadísticas del equipo después del partido
        equipo1.actualizarEstadistica(true, false); // equipo1 ganó
        equipo2.actualizarEstadistica(false, false); // equipo2 perdió

        // Determinar ganador del partido
        Equipo ganador = liga.determinarGanador(partido);
        if (ganador != null) {
            System.out.println("El ganador del partido es: " + ganador.getNombre());
        } else {
            System.out.println("El partido terminó en empate.");
        }

        // Organizar tabla de posiciones
        sistemaFutbol.organizarTablaPosicion(partido);
    }
}
