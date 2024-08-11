package estadio;

//En esta clase utilizaremos los metodos de la clase de Equipo
public class Partido {
    //Estas son variables que simulan los equipos
    private Equipo equipo1;
    private Equipo equipo2;
    //Estas variables la utilizaremos para almacenar los goles
    private int golesEquipo1;
    private int golesEquipo2;

    //aqui recibimos los 2 equipos  y les damos valor a las variables creadas
    public Partido(Equipo equipo1, Equipo equipo2) {
        this .equipo1 = equipo1;
        this .equipo2 = equipo2;
    }

    //Aqui se jugaran los partidos y se agregaran los puntos 
    public void jugarPartido() {
        //Se asignan valores random para simular los goles
        golesEquipo1 = (int) (Math.random() * 5);
        golesEquipo2 = (int) (Math.random() * 5);

        //Se crea un if para que se juege el partido aqui haremos uso de otro metodo
        if ( golesEquipo1 > golesEquipo2 ) {
            equipo1.sumarPuntos(3);
        }else if ( golesEquipo1 < golesEquipo2 ) {
            equipo2.sumarPuntos(3);
        }else {
            equipo1.sumarPuntos(1);
            equipo1.sumarPuntos(1);
        }
    }

    //Haremos una para obtener el resultado
    public String resultado() {
        return equipo1.obtenerNombre() + " " + golesEquipo1 + " - " + golesEquipo2 + " " + equipo2.obtenerNombre();
    }


}