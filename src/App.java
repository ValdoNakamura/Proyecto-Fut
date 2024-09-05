import estadio.Equipo;
import logica.CrearTorneo;
import logica.LaTablaPosiciones;
import java.util.ArrayList;
import java.util.Random;

//este lo usamos para que no se repita nada
import java.util.HashSet;
public class App {
    public static void main(String[] args) throws Exception {
       
        String[] CopaMundial = {
            "Mexico", "Argentina", "Alemania", "Australia",
            "Belgica", "Brasil", "Canada", "Catar", "Costa Rica", 
            "Corea del Sur", "Croacia", "Dinamarca",
            "Ecuador", "España", "Estados Unidos", "Francia",
            "Gales", "Ghana", "Holanda"
        };

        ArrayList<Equipo> equipos = new ArrayList<>();
        Random random = new Random();
        HashSet<String> equiposSeleccionados = new HashSet<>();

        while (equipos.size() < 12) {
            int indiceAleatorio = random.nextInt(CopaMundial.length);
            String nombreEquipo = CopaMundial[indiceAleatorio];

            if (!equiposSeleccionados.contains(nombreEquipo)) {
                equiposSeleccionados.add(nombreEquipo);
                equipos.add(new Equipo(nombreEquipo));
            }
        }

        CrearTorneo inicio = new CrearTorneo(equipos);
        inicio.generarPartidos();

        for (int i = 0; i < 10; i++) {
            System.out.println("\nJornada " + (i + 1));
            inicio.jugarJornada();
        }

        LaTablaPosiciones tabla = new LaTablaPosiciones();
        tabla.verTabla(equipos);

        String ganador = inicio.obtenerGanador();
        System.out.println("\nEl equipo ganador es: " + ganador + " Felicidades");
    }
}
