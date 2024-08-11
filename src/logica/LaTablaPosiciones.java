package logica;

import estadio.Equipo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LaTablaPosiciones {
    public void verTabla(ArrayList<Equipo> equipos) {
        Collections.sort(equipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo e1, Equipo e2) {
                return e2.obtenerPuntos() - e1.obtenerPuntos();
            }
        });

        System.out.println("\nTabla de posiciones: ");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.obtenerNombre() + ": " + equipo.obtenerPuntos() + " Puntos");
        }

    }
}
