import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SistemaFutbol sistemaFutbol = new SistemaFutbol();


        Competencia liga = sistemaFutbol.crearCompetencia("Liga de Clubes");


        Equipo equipo1 = sistemaFutbol.registrarEquipo("Equipo A");
        Equipo equipo2 = sistemaFutbol.registrarEquipo("Equipo B");


        Arbitro arbitro1 = sistemaFutbol.registrarArbitro("Arbitro 1");


        liga.agregarEquipo(equipo1);
        liga.agregarEquipo(equipo2);


        Jugador jugador1 = new Jugador(1, "Jugador 1", "Delantero");
        Jugador jugador2 = new Jugador(2, "Jugador 2", "Defensa");

        equipo1.agregarJugador(jugador1);
        equipo2.agregarJugador(jugador2);


        Partido partido = new Partido(1, equipo1, equipo2, new Date(), arbitro1);
        liga.programarPartido(partido);


        partido.iniciarPartido();


        partido.intervenir(arbitro1);
        arbitro1.amonestar();
        arbitro1.anularGol();


        equipo1.actualizarEstadistica(true, false); // equipo1 ganó
        equipo2.actualizarEstadistica(false, false); // equipo2 perdió


        Equipo ganador = liga.determinarGanador(partido);
        if (ganador != null) {
            System.out.println("El ganador del partido es: " + ganador.getNombre());
        } else {
            System.out.println("El partido terminó en empate.");
        }

        
        sistemaFutbol.organizarTablaPosicion(partido);
    }
}
