import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private double puntuacion;
    private int edad;
    private ArrayList <Carta> mano;
    private boolean isPlaying;

    

    public Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = 0;
        this.mano = new ArrayList<Carta>();
        this.isPlaying = false;
    }
    
    // Metodos
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }
    
    public boolean getPlaying(){
        return isPlaying;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(Carta carta) {
        this.mano.add(carta);
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion += puntuacion;
    }

    public void cogerCarta(Baraja baraja){
        Carta cartaRobada = baraja.getCartas()[0];
        double puntos = cartaRobada.getValor();
        puntuacion += puntos;
        baraja.moverPrimeraCarta(baraja);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Jugador: "+ this.nombre + " de edad: "+ this.edad+ " tiene una puntuación de: "+this.puntuacion;
    }
    public void mostrarJugador(Jugador jugador){
        System.out.println(jugador.toString());
    }
}
