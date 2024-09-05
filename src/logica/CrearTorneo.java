package logica;

//Tambien utilizaremos ArrayList y Stack para almacenar nuestros datos
import java.util.ArrayList;
import java.util.Stack;
//importamos nuestras clases
import estadio.Equipo;
import estadio.Partido;

public class CrearTorneo {
    //Aqui se crean los Array y Stack
    private ArrayList<Equipo> equipos;
    private Stack<Partido> partidos;
    //Aqui se crea un torneo y se usara la pila para almacenar los partido jugados
    public CrearTorneo(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
        this.partidos = new Stack<>();
    }

    /*Aqui usaremos nuestros metodos de otras clases para poder hacer que 
    se juegen los partidos con diferentes equipos Usando un for*/
    public void generarPartidos() {
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                partidos.push(new Partido(equipos.get(i),equipos.get(j)));
            }
        }
    }

    /*Ya que una jornada seria la mitad de los juegos que se jugaran crearemos este metodo
     cada ves que el for este en curso se verifica que no este vacio el Stack 
    */
    public void jugarJornada() {
        for (int i = 0; i < equipos.size() / 2; i++) {
            if (!partidos.isEmpty()) {
                Partido partido = partidos.pop();
                partido.jugarPartido();
                System.out.println(partido.resultado());
            }
        }
    }

    //funcion para obtener el ganador
    public String obtenerGanador() {
        return equipos.stream()
            .max((e1, e2) -> (e1.obtenerPuntos() > e2.obtenerPuntos()) ? 1 :
                             (e1.obtenerPuntos() < e2.obtenerPuntos()) ? -1 : 0)
            .map(Equipo::obtenerNombre)
            .orElse("No hay equipos");
    }
}
