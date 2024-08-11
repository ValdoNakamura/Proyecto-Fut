import estadio.Equipo;
import logica.CrearTorneo;
import logica.LaTablaPosiciones;

import java.util.ArrayList;




public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Equipo> equipos = new ArrayList<>();
        
        equipos.add(new Equipo("Monterrey"));
        equipos.add(new Equipo("Chivas"));
        equipos.add(new Equipo("America"));
        equipos.add(new Equipo("Cruz Azul"));
        equipos.add(new Equipo("Real Madrid"));
        equipos.add(new Equipo("Manshester"));
        equipos.add(new Equipo("Pumas"));
        equipos.add(new Equipo("Barcelona"));
        equipos.add(new Equipo("Mexico"));
        equipos.add(new Equipo("Argentina"));

        CrearTorneo inicio = new CrearTorneo(equipos);
        inicio.generarPartidos();

        for (int i = 0; i < 2; i++) {
            System.out.println("\nJornada " + (i + 1));
            inicio.jugarJornada();
        }

        LaTablaPosiciones tabla = new LaTablaPosiciones();
        tabla.verTabla(equipos);

    }
}
