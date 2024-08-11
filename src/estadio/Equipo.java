package estadio;

public class Equipo {
    String nombre;
    int puntos;

    //Aqui se crea el equipo y se inicializan los puntos en 0
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }
    //este metodo nos retorna el nombre
    public String obtenerNombre() {
        return nombre;
    }
    //este metodo nos retorna los puntos
    public int obtenerPuntos() {
        return puntos;
    }
    //este metodo suma los puntos
    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
}