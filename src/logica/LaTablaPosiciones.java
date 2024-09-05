package logica;

//importamos los metodos de Equipo y ademas de usar ArrayList 
import estadio.Equipo;
import java.util.ArrayList;
/*
Esta es una funcion que nos permitira la posicion de 
los equipos en la tablas utilizando el metodo para obtener puntos
*/
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

        //aqui mostramos en la consola con un for todos los equipos con sus puntos
        System.out.println("\nTabla de posiciones: ");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.obtenerNombre() + ": " + equipo.obtenerPuntos() + " Puntos");
        }
    }
}
