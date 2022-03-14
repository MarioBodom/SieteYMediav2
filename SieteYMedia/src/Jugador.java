import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
    private String nombre;
    private double puntuacion;
    private int edad;
    private ArrayList <Carta> mano;
    private boolean isPlaying;
    private double monedero;
    private boolean esAmigo;
    private int partidasJugadas;

    

    public Jugador(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = 0;
        this.mano = new ArrayList<Carta>();
        this.isPlaying = false;
        if (nombre.toLowerCase().equals("mrbodom")) {
            this.esAmigo = true;
        } else {
            this.esAmigo = false;
        }
        this.monedero = 0;
        this.partidasJugadas = 0;
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

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public boolean getEsAmigo(){
        return esAmigo;
    }
    public void setEsAmigo() {
        this.esAmigo = true;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Jugador: "+ this.nombre + " de edad: "+ this.edad+ " tiene una puntuación de: "+this.puntuacion+ "\nTiene " + this.monedero 
            +"euros en el monedero."+this.esAmigo;
    }
    public void mostrarJugador(){
        System.out.println(toString());
    }

    // Este metodo roba una carta eligiendola diréctamente desde la baraja
    public void robarCarta(Baraja baraja){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que carta quieres robar?");
        String nombreCarta = sc.nextLine().toLowerCase();
        Carta cartaRobada;
        for (int i = 0; i < baraja.getCartas().length; i++) {
            if (nombreCarta.equals(baraja.getCartas()[i].toString().toLowerCase())) {
                cartaRobada = baraja.getCartas()[i];
                setMano(cartaRobada);
                setPuntuacion(cartaRobada.getValor());
            }
        }
        sc.close();
    }

    public void robarCartaAmigo(){
        Carta aux;
        
    }
}
